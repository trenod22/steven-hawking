package game;

import game.framework.*;
import game.levels.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Drawable> figures = new ArrayList<>();
    private Hawkin hawkin = new Hawkin();
    private LevelList levelList = new LevelList();
    private Level currentLevel;
    public static Vector topLeft = new Vector(0,0);
    public static boolean mousePressed;
    public static boolean spacePressed;
    public static final float gameMoveSpeed = 3f;
    private boolean levelDone = true;
    public static boolean lost = false;


    public Game(){
        levelFinished();
    }


    public void update(){
        figures.clear();
        figures.add(hawkin);
        figures.addAll(currentLevel.getLevel());
        Game.topLeft.x += Game.gameMoveSpeed;


        figures.forEach(f -> f.update());

        levelDone = hawkin.getLocation().x >= currentLevel.getFinish();
        if (Game.lost){
            levelLost();
            Game.lost = false;
        }
        levelFinished();
    }
    public void draw(Graphics2D g){

        figures.forEach(f -> f.draw(g));
        g.setColor(new Color(11, 64, 2));
        g.fillRect(0,700,1000,5);
        g.setColor(new Color(145, 70,0));
        g.fillRect(0,705,1000,100);

        g.drawString(topLeft.x + topLeft.y + "", 50,50);
    }

    public void levelFinished(){
        if (levelDone){
            currentLevel = levelList.getNextLevel();

            hawkin.reset();
            topLeft.x = 0;
            hawkin.setCurrentFloors(currentLevel.getFloors());
            hawkin.setCurrentObstacles(currentLevel.getObstacles());
            hawkin.setCurrentExtras(currentLevel.getExtras());
        }
    }

    public void levelLost(){
        topLeft.x = 0;
        hawkin.reset();
    }
}
