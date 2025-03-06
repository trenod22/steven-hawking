package game.GUI;

import java.awt.*;

public class Before3 {
    public static void draw(Graphics2D g){
        Font font = g.getFont();
        // Set background color
        g.setColor(new Color(30, 30, 30));
        g.fillRect(0, 0, 800, 800);
        // Draw Title
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.setColor(Color.WHITE);
        String title = "All what Steven wants right now is just to get home";
        int titleWidth = g.getFontMetrics().stringWidth(title);
        g.drawString(title, (800 - titleWidth) / 2, 175);

        String startMessage = "and be safe there.";
        int textWidth = g.getFontMetrics().stringWidth(startMessage);
        g.drawString(startMessage, (800 - textWidth) / 2, 250);

        String steuerungMessage = "So he has to keep going.";
        int textWidth1 = g.getFontMetrics().stringWidth(steuerungMessage);
        g.drawString(steuerungMessage, (800 - textWidth1) / 2, 325);

        String steuerung1Message = "But nobody knows how long he has to keep doing this.";
        int textWidth2 = g.getFontMetrics().stringWidth(steuerung1Message);
        g.drawString(steuerung1Message, (800 - textWidth2) / 2, 400);

        String continuer = "Press Space to Continue";
        int continueWidth = g.getFontMetrics().stringWidth(continuer);
        g.drawString(continuer,(800 - continueWidth)/2,700);


        g.setFont(font);

    }
}
