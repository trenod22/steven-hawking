package game.levels;

import game.Game;
import game.framework.Extra;
import game.framework.Frame;
import game.framework.Vector;

import java.awt.*;

public class FinshLine extends Extra {
    private static final int TILE_SIZE = 20; // Size of each checker square

    public FinshLine(float x) {
        location = new Vector(0,0);
        location.x = x;
    }

    @Override
    public void onCollision() {
    }

    @Override
    public void update() {
    }

    @Override
    public void draw(Graphics2D g) {
        if (location.x - Game.topLeft.x < 1000 && location.x - Game.topLeft.x > -250 - width){
            for (int y = 0; y < Frame.WINDOWS_HEIGHT; y += TILE_SIZE) {
                boolean isBlack = (y / TILE_SIZE) % 2 == 0;
                g.setColor(isBlack ? Color.BLACK : Color.WHITE);
                g.fillRect((int) (location.x - Game.topLeft.x), y, TILE_SIZE, TILE_SIZE);
                g.fillRect((int) (location.x + TILE_SIZE + TILE_SIZE - Game.topLeft.x), y, TILE_SIZE, TILE_SIZE);
                g.setColor(isBlack ? Color.WHITE : Color.BLACK);
                g.fillRect((int) (location.x + TILE_SIZE - Game.topLeft.x), y, TILE_SIZE, TILE_SIZE);
            }
            g.setColor(Color.BLACK);
        }

    }
}
