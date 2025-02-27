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
        Level l1 = new Level(5000);
        l1.addFloor(new Floor(new Vector(550,500),50,200));
        l1.addFloor(new Floor(new Vector(900,450),50,200));
        l1.addFloor(new Floor(new Vector(1250,350),50,200));



        l1.addObstacle(new Obstacle(new Vector(1500,300),500,50));
        l1.addObstacle(new Obstacle(new Vector(2500,400),400,50));
        l1.addObstacle(new Obstacle(new Vector(2500,0),200,50));

        l1.addFloor(new Floor(new Vector(2800,500),50,200));
        l1.addObstacle(new Obstacle(new Vector(3000,0),550,50));


        l1.addObstacle(new Obstacle(new Vector(3400,600),200,50));
        l1.addObstacle(new Obstacle(new Vector(3450,0),400,50));

        l1.addObstacle(new Obstacle(new Vector(3600,0),200,50));
        l1.addObstacle(new Obstacle(new Vector(3650,400),400,50));

        l1.addExtras(new Jetpack(new Vector(2000, 600),200,50));
        levels.add(l1);

        Level l2 = new Level(5000);
        l2.addFloor(new Floor(new Vector(550,500),50,200));
        l2.addObstacle(new Obstacle(new Vector(1000,500),50,200));

        levels.add(l2);


    }
}
