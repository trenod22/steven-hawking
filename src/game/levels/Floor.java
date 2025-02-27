package game.levels;

import game.Game;
import game.framework.*;

import java.awt.*;

public class Floor implements Drawable {
    private Vector location;
    private int height;
    private int width;
    public boolean hitFromBottom = false;
    public Floor(Vector v,int height, int width){
        location = v;
        this.height = height;
        this.width = width;
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics2D g) {
        if (location.x - Game.topLeft.x < 1000 && location.x - Game.topLeft.x > -250 - width) {
            g.setColor(Color.GREEN);
            g.fillRect((int) (location.x - Game.topLeft.x), (int) location.y, width, height);
            g.setColor(Color.BLACK);
        }
    }



    public Vector getLocation() {
        return location;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
