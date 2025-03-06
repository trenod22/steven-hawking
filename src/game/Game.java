package game;

import game.GUI.Menu;
import game.Utils.Screens;
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
    private Screens currentScreen = Screens.MENU;
    private long time = System.currentTimeMillis();
    private boolean checkBit = false;



    public Game(){
        levelFinished();
    }


    public void update(){
        //timingTester();


        switch (currentScreen){
            case GAME :
                updateGame();
                break;
            case MENU:
                updateMenu();
                break;
        }







    }
    public void draw(Graphics2D g){
        switch (currentScreen){
            case GAME :
                drawGame(g);
                break;
            case MENU:
                drawMenu(g);
                break;
        }
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
        currentScreen = Screens.MENU;
    }





    private void updateGame(){
        figures.clear();
        figures.add(hawkin);
        figures.addAll(currentLevel.getLevel());
        Game.topLeft.x += Game.gameMoveSpeed;


        figures.forEach(f -> f.update());

        levelDone = hawkin.getLocation().x >= currentLevel.getFinish();
        if (Game.lost){
            levelLost();
            currentScreen = Screens.MENU;
            Game.lost = false;
        }
        levelFinished();
    }

    private void drawGame(Graphics2D g){
        figures.forEach(f -> f.draw(g));


        g.setColor(new Color(11, 64, 2));
        g.fillRect(0,700,1000,5);
        g.setColor(new Color(145, 70,0));
        g.fillRect(0,705,1000,100);

        g.drawString("Level: "+ levelList.getCurrentLevel(), 50,50);
    }


    private void updateMenu(){
        if (Game.spacePressed){
            checkBit = true;
        }
        if (!Game.spacePressed && checkBit){
            currentScreen = Screens.GAME;
            checkBit = false;
        }
    }

    private void drawMenu(Graphics2D g){
        Menu.draw(g);
    }


    private void timingTester(){
        System.out.println(System.currentTimeMillis() - time);
        time = System.currentTimeMillis();
    }
}
