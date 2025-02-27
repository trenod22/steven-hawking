package game.levels;

import game.framework.Drawable;
import game.framework.Extra;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private List<Obstacle> obstacles = new ArrayList<>();
    private List<Floor> floors = new ArrayList<>();
    private List<Extra> extras = new ArrayList<>();
    private int finish = 5000;

    public Level(int finish){
        extras.add(new FinshLine(finish));
        this.finish = finish;
    }





    public void addObstacle(Obstacle o){
        obstacles.add(o);
    }
    public void addFloor(Floor f){
        floors.add(f);
    }
    public List<Drawable> getLevel(){
        List<Drawable> level = new ArrayList<>();
        obstacles.forEach(o -> level.add(o));
        floors.forEach(f -> level.add(f));
        extras.forEach(e -> level.add(e));

        return level;
    }
    public void addExtras(Extra e){
        extras.add(e);
    }


    public List<Floor> getFloors() {
        return floors;
    }

    public List<Obstacle> getObstacles() {
        return obstacles;
    }

    public List<Extra> getExtras() {
        return extras;
    }

    public int getFinish(){
        return finish;
    }
}
