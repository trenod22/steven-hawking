package game.levels;

import game.Game;
import game.framework.Extra;
import game.framework.Frame;
import game.framework.Vector;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class FinshLine extends Extra {
    private static final int PORTAL_RADIUS = 50; // Radius des Portals
    private static final Color OUTER_COLOR = new Color(0, 120, 255); // Blau für den Rand
    private static final Color INNER_COLOR = new Color(100, 0, 150); // Lila für den inneren Effekt

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
        int screenX = (int) (location.x - Game.topLeft.x);
        int centerY = Frame.WINDOWS_HEIGHT / 2;

        if (screenX > -PORTAL_RADIUS && screenX < 1000) {
            // Äußerer Portalrand
            g.setColor(OUTER_COLOR);
            g.fill(new Ellipse2D.Float(screenX, 0, PORTAL_RADIUS * 2, Frame.WINDOWS_HEIGHT-100));

            // Innerer Wirbel-Effekt
            GradientPaint gradient = new GradientPaint(
                    screenX - PORTAL_RADIUS, centerY, INNER_COLOR,
                    screenX + PORTAL_RADIUS, centerY, Color.BLACK, true);
            g.setPaint(gradient);
            g.fill(new Ellipse2D.Float(screenX + 10, 10, (PORTAL_RADIUS - 10) * 2, (Frame.WINDOWS_HEIGHT - 120)));
        }
    }
}
