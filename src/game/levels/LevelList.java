package game.levels;

import game.framework.Vector;

import java.util.ArrayList;
import java.util.List;

public class LevelList {
    List<Level> levels = new ArrayList<>();
    private int currentLevel = 1;

    public LevelList(){
        initLevels();
    }

    public Level getNextLevel(){
        currentLevel++;
        if (levels.size() < currentLevel){
            currentLevel = 1;
        }
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


        l1.addObstacle(new Obstacle(new Vector(4000,200),600,50));
        l1.addObstacle(new Obstacle(new Vector(4350,500),300,50));
        l1.addObstacle(new Obstacle(new Vector(4350,0),300,50));
        l1.addObstacle(new Obstacle(new Vector(4550,0),250,50));
        l1.addObstacle(new Obstacle(new Vector(4550,450),350,50));
        l1.addObstacle(new Obstacle(new Vector(4800,220),580,50));
        l1.addObstacle(new Obstacle(new Vector(4800,0),20,50));

        l1.addExtras(new Jetpack(new Vector(2000, 600),200,50));
        levels.add(l1);




        Level l2 = new Level(5000);

        l2.addObstacle(new Obstacle(new Vector(600,0),400,50));
        l2.addObstacle(new Obstacle(new Vector(600,600),200,50));

        l2.addObstacle(new Obstacle(new Vector(1000,0),200,50));
        l2.addObstacle(new Obstacle(new Vector(1000,400),400,50));

        l2.addObstacle(new Obstacle(new Vector(1300,0),300,50));
        l2.addObstacle(new Obstacle(new Vector(1300,500),300,50));

        l2.addObstacle(new Obstacle(new Vector(1827,100),300,50));
        l2.addObstacle(new Obstacle(new Vector(1827,600),200,50));
        l2.addObstacle(new Obstacle(new Vector(1827,345),50,463));

        l2.addObstacle(new Obstacle(new Vector(2240,0),400,50));
        l2.addObstacle(new Obstacle(new Vector(2240,600),200,50));

        l2.addObstacle(new Obstacle(new Vector(2400,0),25,50));
        l2.addObstacle(new Obstacle(new Vector(2400,165),680,50));

        l2.addObstacle(new Obstacle(new Vector(2750,0),320,50));
        l2.addObstacle(new Obstacle(new Vector(2750,520),300,50));

        l2.addObstacle(new Obstacle(new Vector(3000,0),480,50));
        l2.addObstacle(new Obstacle(new Vector(3000,680),120,50));

        l2.addObstacle(new Obstacle(new Vector(3333,0),225,50));
        l2.addObstacle(new Obstacle(new Vector(3333,400),400,50));

        l2.addObstacle(new Obstacle(new Vector(3600,0),600,50));

        l2.addObstacle(new Obstacle(new Vector(4000,0),425,50));
        l2.addObstacle(new Obstacle(new Vector(4000,625),200,50));

        l2.addObstacle(new Obstacle(new Vector(4444,0),550,50));
        l2.addObstacle(new Obstacle(new Vector(4444,750),100,50));

        l2.addObstacle(new Obstacle(new Vector(4650,0),350,50));
        l2.addObstacle(new Obstacle(new Vector(4650,550),300,50));

        levels.add(l2);


    }

    public int getCurrentLevel() {
        return currentLevel;
    }
}
