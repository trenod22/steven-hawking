package game.levels;

import game.framework.Vector;

import java.util.ArrayList;
import java.util.List;

public class LevelList {
    List<Level> levels = new ArrayList<>();
    private int currentLevel = 0;

    public LevelList(){
        initLevels();
    }

    public Level getNextLevel(){
        currentLevel++;
        return levels.get(currentLevel-1);
    }




    public void initLevels(){
        Level l1 = new Level();
        l1.addFloor(new Floor(new Vector(550,500),50,200));
        l1.addFloor(new Floor(new Vector(900,450),50,200));
        l1.addFloor(new Floor(new Vector(1250,350),50,200));



        l1.addObstacle(new Obstacle(new Vector(1500,300),500,50));
        l1.addObstacle(new Obstacle(new Vector(2200,600),200,50));
        l1.addObstacle(new Obstacle(new Vector(2500,400),400,50));
        l1.addObstacle(new Obstacle(new Vector(2500,0),200,50));

        l1.addFloor(new Floor(new Vector(2750,350),80,200));


        l1.addExtras(new Jetpack(new Vector(2000, 600),200,50));
        l1.finish = 5000;
        levels.add(l1);

        Level l2 = new Level();
        l2.addFloor(new Floor(new Vector(550,500),50,200));
        l2.addObstacle(new Obstacle(new Vector(1000,500),50,200));
        l2.finish = 5000;
        levels.add(l2);


    }
}
