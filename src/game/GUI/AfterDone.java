package game.GUI;

import java.awt.*;

public class AfterDone {
    public static void draw(Graphics2D g){
        Font font = g.getFont();
        // Set background color
        g.setColor(new Color(30, 30, 30));
        g.fillRect(0, 0, 800, 800);
        // Draw Title
        g.setFont(new Font("Arial", Font.BOLD, 30));
        g.setColor(Color.WHITE);
        String title = "Steven was researching about Black holes.";
        int titleWidth = g.getFontMetrics().stringWidth(title);
        g.drawString(title, (800 - titleWidth) / 2, 175);

        String startMessage = "When suddenly a Portal to a diffrent ";
        int textWidth = g.getFontMetrics().stringWidth(startMessage);
        g.drawString(startMessage, (800 - textWidth) / 2, 250);

        String steuerungMessage = "dimension opened beside him. He got ";
        int textWidth1 = g.getFontMetrics().stringWidth(steuerungMessage);
        g.drawString(steuerungMessage, (800 - textWidth1) / 2, 325);

        String steuerung1Message = "sucked into the portal. At the end of each level ";
        int textWidth2 = g.getFontMetrics().stringWidth(steuerung1Message);
        g.drawString(steuerung1Message, (800 - textWidth2) / 2, 400);

        String steuerung3Message = "is a Portal to a diffrent dimension.";
        int textWidth3 = g.getFontMetrics().stringWidth(steuerung3Message);
        g.drawString(steuerung3Message, (800 - textWidth3) / 2, 475);

        String steuerung4Message = "Sometimes there are timeskips in these dimensions.";
        int textWidth4 = g.getFontMetrics().stringWidth(steuerung4Message);
        g.drawString(steuerung4Message, (800 - textWidth4) / 2, 550);


        String continuer = "Press Space to Continue";
        int continueWidth = g.getFontMetrics().stringWidth(continuer);
        g.drawString(continuer,(800 - continueWidth)/2,700);

        g.setFont(font);

    }
}
