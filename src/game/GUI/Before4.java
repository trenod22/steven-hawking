package game.GUI;

import java.awt.*;

public class Before4 {
    public static void draw(Graphics2D g){
        Font font = g.getFont();
        // Set background color
        g.setColor(new Color(30, 30, 30));
        g.fillRect(0, 0, 800, 800);
        // Draw Title
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.setColor(Color.WHITE);
        String title = "Steven went throught the portal again,";
        int titleWidth = g.getFontMetrics().stringWidth(title);
        g.drawString(title, (800 - titleWidth) / 2, 175);

        String startMessage = "but what happened! This dimension seems";
        int textWidth = g.getFontMetrics().stringWidth(startMessage);
        g.drawString(startMessage, (800 - textWidth) / 2, 250);

        String steuerungMessage = "to be falling apart ";
        int textWidth1 = g.getFontMetrics().stringWidth(steuerungMessage);
        g.drawString(steuerungMessage, (800 - textWidth1) / 2, 325);

        String steuerung1Message = "He has to be quick if he doesn't want the";
        int textWidth2 = g.getFontMetrics().stringWidth(steuerung1Message);
        g.drawString(steuerung1Message, (800 - textWidth2) / 2, 400);

        String steuerung3Message = "portal to fall apart aswell.";
        int textWidth3 = g.getFontMetrics().stringWidth(steuerung3Message);
        g.drawString(steuerung3Message, (800 - textWidth3) / 2, 475);

        String continuer = "Press Space to Continue";
        int continueWidth = g.getFontMetrics().stringWidth(continuer);
        g.drawString(continuer,(800 - continueWidth)/2,700);


    }
}
