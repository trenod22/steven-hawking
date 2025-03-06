package game.GUI;

import java.awt.*;

public class Before3 {
    public static void draw(Graphics2D g){
        Font font = g.getFont();
        // Set background color
        g.setColor(new Color(30, 30, 30));
        g.fillRect(0, 0, 800, 800); // Assuming a window size of 800x600

        // Draw Title
        g.setFont(new Font("Arial", Font.BOLD, 50));
        g.setColor(Color.WHITE);
        String title = "Steven Hawking Game";
        int titleWidth = g.getFontMetrics().stringWidth(title);
        g.drawString(title, (800 - titleWidth) / 2, 200);

        // Draw Start Message
        g.setFont(new Font("Arial", Font.BOLD, 30));
        String startMessage = "Press Space to Start";
        int textWidth = g.getFontMetrics().stringWidth(startMessage);
        g.drawString(startMessage, (800 - textWidth) / 2, 600);

        String steuerungMessage = "Press Space to Jump";
        int textWidth1 = g.getFontMetrics().stringWidth(steuerungMessage);
        g.drawString(steuerungMessage, (800 - textWidth1) / 2, 400);

        String steuerung1Message = "Press Mouse to use 3";
        int textWidth2 = g.getFontMetrics().stringWidth(steuerung1Message);
        g.drawString(steuerung1Message, (800 - textWidth2) / 2, 500);

        g.setFont(font);

    }
}
