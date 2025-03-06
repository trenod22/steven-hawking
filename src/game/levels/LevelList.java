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

        l1.addFloor(new Floor(new Vector(2800,500),50,250));
        l1.addObstacle(new Obstacle(new Vector(3000,0),540,48));


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

        l2.addObstacle(new Obstacle(new Vector(1677,100),300,50));
        l2.addObstacle(new Obstacle(new Vector(1677,600),200,50));
        l2.addObstacle(new Obstacle(new Vector(1677,345),50,463));
        l2.addObstacle(new Obstacle(new Vector(2100,0),400,50));
        l2.addObstacle(new Obstacle(new Vector(2100,600),200,50));

        l2.addObstacle(new Obstacle(new Vector(2500,0),25,50));
        l2.addObstacle(new Obstacle(new Vector(2500,165),680,50));

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

        Level l3 = new Level(5000);

        l3.addFloor(new Floor(new Vector(500,450),50,200));
        l3.addFloor(new Floor(new Vector(850,400),50,200));
        l3.addFloor(new Floor(new Vector(1200,350),50,200));

        l3.addObstacle(new Obstacle(new Vector(1500,300),500,50));
        l3.addObstacle(new Obstacle(new Vector(1800,500),400,50));
        l3.addObstacle(new Obstacle(new Vector(2100,0),200,50));

        l3.addFloor(new Floor(new Vector(2500,500),50,250));
        l3.addObstacle(new Obstacle(new Vector(2700,0),500,58));

        l3.addObstacle(new Obstacle(new Vector(3100,600),200,50));
        l3.addObstacle(new Obstacle(new Vector(3200,0),400,50));

        l3.addObstacle(new Obstacle(new Vector(3400,0),200,50));
        l3.addObstacle(new Obstacle(new Vector(3500,400),400,50));

        l3.addObstacle(new Obstacle(new Vector(3800,200),600,50));
        l3.addObstacle(new Obstacle(new Vector(4100,500),300,50));
        l3.addObstacle(new Obstacle(new Vector(4100,0),300,50));
        l3.addObstacle(new Obstacle(new Vector(4350,0),250,50));
        l3.addObstacle(new Obstacle(new Vector(4350,450),350,50));
        l3.addObstacle(new Obstacle(new Vector(4600,220),580,50));

        levels.add(l3);

        Level l4 = new Level(5000);

        l4.addObstacle(new Obstacle(new Vector(-10,0),20,6000));
        l4.addFloor(new Floor(new Vector(400,450),50,200));
        l4.addFloor(new Floor(new Vector(750,400),50,200));
        l4.addFloor(new Floor(new Vector(1100,350),50,200));

        l4.addObstacle(new Obstacle(new Vector(1300,300),300,50));
        l4.addObstacle(new Obstacle(new Vector(1450,500),250,50));
        l4.addObstacle(new Obstacle(new Vector(1600,200),200,50));

        l4.addFloor(new Floor(new Vector(1800,500),50,200));
        l4.addObstacle(new Obstacle(new Vector(1900,0),350,50));

        l4.addObstacle(new Obstacle(new Vector(2200,600),180,50));
        l4.addObstacle(new Obstacle(new Vector(2300,0),300,50));

        l4.addObstacle(new Obstacle(new Vector(2500,0),200,50));
        l4.addObstacle(new Obstacle(new Vector(2550,350),300,50));

        l4.addObstacle(new Obstacle(new Vector(2800,200),400,50));
        l4.addObstacle(new Obstacle(new Vector(3000,450),250,50));
        l4.addObstacle(new Obstacle(new Vector(3000,0),250,50));

        l4.addObstacle(new Obstacle(new Vector(3200,0),200,50));
        l4.addObstacle(new Obstacle(new Vector(3250,400),300,50));

        l4.addObstacle(new Obstacle(new Vector(3500,220),450,50));
        l4.addObstacle(new Obstacle(new Vector(3850,0),150,50));

        l4.addObstacle(new Obstacle(new Vector(4100,300),300,50));
        l4.addObstacle(new Obstacle(new Vector(4200,0),150,50));
        l4.addObstacle(new Obstacle(new Vector(4250,500),250,50));
        l4.addObstacle(new Obstacle(new Vector(4400,200),200,50));

        l4.addObstacle(new Obstacle(new Vector(4600,220),580,50));

        l4.addObstacle(new Obstacle(new Vector(4900,0),400,50));
        l4.addObstacle(new Obstacle(new Vector(4900,600),100,50));

        levels.add(l4);


    }

    public int getCurrentLevel() {
        return currentLevel;
    }
}
