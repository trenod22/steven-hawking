package game.levels;

import game.Game;
import game.Hawkin;
import game.framework.*;

import java.awt.*;

public class Jetpack extends Extra {
    private boolean onscreen = true;

    public Jetpack(Vector location, int height, int width) {
        this.location = location;
        this.height = height;
        this.width = width;
    }



    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics2D g) {
        if (location.x - Game.topLeft.x < 1000 && location.x - Game.topLeft.x > -250 - width) {
            if (onscreen) {


                int x1 = (int) (location.x - 10 - Game.topLeft.x);
                int x2 = (int) (location.x + width - Game.topLeft.x);
                int y = (int) location.y + 7;

                // Main jetpack color with shading
                Color darkRed = new Color(120, 0, 0);
                Color lightRed = new Color(200, 50, 50);

                g.setColor(darkRed);
                g.fillRoundRect(x1, y, 50, 200, 20, 20);
                g.fillRoundRect(x2, y, 50, 200, 20, 20);

                // Add highlights for depth
                g.setColor(lightRed);
                g.fillRoundRect(x1 + 5, y + 5, 40, 190, 15, 15);
                g.fillRoundRect(x2 + 5, y + 5, 40, 190, 15, 15);

                // Outline for definition
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1, y, 50, 200, 20, 20);
                g.drawRoundRect(x2, y, 50, 200, 20, 20);

                // Straps (if attached to a character)
                g.setColor(new Color(80, 80, 80));
                g.fillRect(x1 + 20, y - 40, 10, 40);
                g.fillRect(x2 + 20, y - 40, 10, 40);
            }
        }
    }


    @Override
    public void onCollision() {
        Hawkin.hasJetPack = true;
        onscreen = false;
    }
}
