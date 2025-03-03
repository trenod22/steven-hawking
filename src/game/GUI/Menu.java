package game.GUI;

import java.awt.*;

public class Menu {

    public static void draw(Graphics2D g) {
        Font originalFont = g.getFont(); // Save the original font

        g.setFont(new Font("Arial", Font.BOLD, 30)); // Set a big bold font
        g.drawString("To start press Space", 200, 400);

        g.setFont(originalFont); // Restore the original font
    }

}
