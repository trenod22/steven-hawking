package game.Utils;

import game.framework.*;

public class Collision {
    public static boolean collision(Vector v1, int height1, int width1,Vector v2, int height2, int width2){
        float left1 = v1.x;
        float right1 = v1.x + width1;
        float top1 = v1.y;
        float bottom1 = v1.y + height1;

        // Berechnung der Begrenzungen des zweiten Objekts
        float left2 = v2.x;
        float right2 = v2.x + width2;
        float top2 = v2.y;
        float bottom2 = v2.y + height2;

        // Kollisionserkennung: Prüfen, ob sich die Rechtecke überschneiden
        boolean isColliding = (left1 < right2 && right1 > left2 && top1 < bottom2 && bottom1 > top2);

        return isColliding;
    }
}
