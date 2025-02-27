package game.levels;

import game.Game;
import game.framework.*;

import java.awt.*;

public class Obstacle implements Drawable {
    private Vector location;
    private int height;
    private int width;
    private static final int BRICK_WIDTH = 30;
    private static final int BRICK_HEIGHT = 15;
    private static final Color BRICK_COLOR = new Color(178, 34, 34);  // Firebrick color
    private static final Color MORTAR_COLOR = new Color(220, 220, 220); // Light gray

    public Obstacle(Vector v, int height, int width) {
        location = v;
        this.height = height;
        this.width = width;
    }

    @Override
    public void update() {
        // No updates needed for now
    }

    @Override
    public void draw(Graphics2D g) {
        if (location.x - Game.topLeft.x < 1000 && location.x - Game.topLeft.x > -250 - width) {
            int startX = (int) (location.x - Game.topLeft.x);
            int startY = (int) location.y;

            g.setColor(MORTAR_COLOR);
            g.fillRect(startX, startY, width, height); // Hintergrund für Mörtel

            for (int y = 0; y < height; y += BRICK_HEIGHT) {
                boolean isOffsetRow = (y / BRICK_HEIGHT) % 2 == 1;
                int offsetX = isOffsetRow ? BRICK_WIDTH / 2 : 0;

                for (int x = -offsetX; x < width; x += BRICK_WIDTH) {
                    int brickX = startX + x;
                    int newBrickWidth = BRICK_WIDTH;

                    // Falls der Ziegel über den rechten Rand hinausragt, auf passende Breite kürzen
                    if (brickX + BRICK_WIDTH > startX + width) {
                        newBrickWidth = (startX + width) - brickX;
                    }
                    // Falls der Ziegel über den linken Rand hinausragt, auf halbe Breite kürzen
                    if (brickX < startX) {
                        newBrickWidth = BRICK_WIDTH / 2;
                        brickX = startX;
                    }

                    g.setColor(BRICK_COLOR);
                    g.fillRect(brickX, startY + y, newBrickWidth, BRICK_HEIGHT); // Ziegel zeichnen

                    g.setColor(Color.BLACK);
                    g.drawRect(brickX, startY + y, newBrickWidth, BRICK_HEIGHT); // Ziegel-Konturen zeichnen
                }
            }
        }
    }


    public Vector getLocation() {
        return location;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
