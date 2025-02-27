package game;

import game.Utils.Collision;
import game.framework.*;
import game.levels.*;

import java.awt.*;

import java.util.ArrayList;
import java.util.List;

public class Hawkin implements Drawable {
    private Vector location = new Vector(100,700);
    private Vector speed = new Vector(0,0);
    private Vector acceleration = new Vector(0,0.5f);
    private int height = 50;
    private int width = 20;
    private boolean isOnFloor = false;
    public static boolean hasJetPack = false;
    private List<Floor> currentFloors = new ArrayList<>();
    private List<Obstacle> currentObstacles = new ArrayList<>();
    private List<Extra> currentExtras = new ArrayList<>();


    @Override
    public void update() {


        for (Obstacle o : currentObstacles){
            if (Collision.collision(location,height,width,o.getLocation(),o.getHeight(),o.getWidth())){
                Game.lost = true;
            }
        }
        for (Extra e : currentExtras){
            if (Collision.collision(location,height,width,e.getLocation(),e.getHeight(),e.getWidth())){
                e.onCollision();
            }
        }


        isOnFloor();
        location.x += Game.gameMoveSpeed;


        if (Game.mousePressed && hasJetPack){
            acceleration.y = -1f;
        }else {
            acceleration.y = 0.5f;
        }

        for (Floor f : currentFloors) {
            float floorX = f.getLocation().x;
            float floorY = f.getLocation().y;

            if (floorX + f.getWidth() >= location.x && floorX <= location.x + width) {
                // Überprüfung der Kollision auf der y-Achse
                if (floorY + f.getHeight() >= location.y - 18 && floorY <= location.y + height && speed.y < 0) {
                    if (location.x + width - floorX<= 10f){
                        Game.lost = true;
                        return;
                    }
                    System.out.println("Set Location");
                    location.y = floorY + f.getHeight() + 16;
                    speed.y = 0.5f;
                    acceleration.y = 0.5f;
                    f.hitFromBottom = true;
                }
            }
        }


        speed.add(acceleration);
        if (isOnFloor && acceleration.y > 0){
            speed.y = 0;
        }
        if (Game.spacePressed && isOnFloor){
            speed.y -= 17.5f;
        }
        if(location.y <= 15){
            location.y = 16;
            speed.y = 0f;
            acceleration.y = 0f;
        }
        if(location.y <= 15 && Game.mousePressed){
            location.y = 16;
            speed.y = 0f;
            acceleration.y = 0f;
        }





        location.add(speed);
    }

    @Override
    public void draw(Graphics2D g) {
        // Zeichne den Rollstuhl (Basis)
        g.setColor(Color.DARK_GRAY);
        g.fillRect((int) (location.x - Game.topLeft.x), (int) location.y, width, height - 5); // Körper

        // Zeichne die Räder
        g.setColor(Color.BLACK);
        g.fillOval((int) (location.x - 5 - Game.topLeft.x), (int) location.y + height - 15, 15, 15); // Linkes Rad
        g.fillOval((int) (location.x + width - 10 - Game.topLeft.x), (int) location.y + height - 15, 15, 15); // Rechtes Rad

        // Zeichne den Kopf
        g.setColor(new Color(227, 191, 157)); // RGB für Peach (Hautfarbe)
        g.fillOval((int) ((location.x + width / 4) - Game.topLeft.x) - 2, (int) location.y - 15, width / 2 + 5, width / 2 + 5);



        if (hasJetPack) {
            // Zeichne das Jetpack
            g.setColor(new Color(150, 0, 0)); // Dunkelrot für das Jetpack
            g.fillRect((int) (location.x - 10 - Game.topLeft.x), (int) location.y + 7, 10, 20); // Linke Düse
            g.fillRect((int) (location.x + width - Game.topLeft.x), (int) location.y + 7, 10, 20); // Rechte Düse
        }
        // Zeichne die Arme
        g.setColor(new Color(227, 191, 157)); // Gleiche Hautfarbe
        int armY = (int) location.y + 5;
        g.fillRect((int) (location.x - 15 - Game.topLeft.x), armY, 15, 5); // Linker Arm
        g.fillRect((int) (location.x + width - Game.topLeft.x), armY, 15, 5); // Rechter Arm

        // Zeichne die Hände
        g.fillOval((int) (location.x - 20 - Game.topLeft.x), armY, 10, 10); // Linke Hand
        g.fillOval((int) (location.x + width + 10 - Game.topLeft.x), armY, 10, 10); // Rechte Hand

        if (Game.mousePressed && hasJetPack) {
            // Zeichne die Flammen
            g.setColor(new Color(255, 140, 0)); // Orange für die Flammen
            g.fillOval((int) (location.x - 10 - Game.topLeft.x), (int) location.y + 27, 10, 15); // Linke Flamme
            g.fillOval((int) (location.x + width - Game.topLeft.x), (int) location.y + 27, 10, 15); // Rechte Flamme
        }

        g.setColor(Color.BLACK);
    }


    private void isOnFloor(){
        if (location.y >= 700 - height){
            isOnFloor = true;
            location.y = 700 - height;
            speed.y = 0f;
            acceleration.y = 0f;
        } else {
            for (Floor floor : currentFloors) {
                if (location.x + width > floor.getLocation().x &&
                        location.x < floor.getLocation().x + floor.getWidth() &&
                        location.y + height >= floor.getLocation().y &&
                        speed.y >= 0 && !floor.hitFromBottom) { // Sicherstellen, dass der Spieler nach unten geht
                    if (location.x + width - floor.getLocation().x<= 5f){
                        Game.lost = true;
                        return;
                    }
                    isOnFloor = true;
                    location.y = floor.getLocation().y - height; // Spieler unter den Boden setzen
                    speed.y = 0;  // Geschwindigkeit auf null setzen
                    acceleration.y = 0;  // Beschleunigung auf null setzen
                    return;
                }
            }
            isOnFloor = false;
        }
    }


    public void setCurrentFloors(List<Floor> currentFloors) {
        this.currentFloors = currentFloors;
    }

    public void setCurrentObstacles(List<Obstacle> currentObstacles) {
        this.currentObstacles = currentObstacles;
    }

    public void setCurrentExtras(List<Extra> currentExtras) {
        this.currentExtras = currentExtras;
    }

    public Vector getLocation() {
        return location;
    }
    public void reset(){
        location.x = 100;
        location.y = 700;
        for (Floor f : currentFloors){
                f.hitFromBottom = false;
        }
    }

}
