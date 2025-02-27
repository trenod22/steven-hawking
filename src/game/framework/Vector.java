package game.framework;

public class Vector {
    public float x;
    public float y;
    public Vector(float x, float y){
        this.x = x;
        this.y = y;
    }
    public void add(Vector v){
        x += v.x;
        y += v.y;
    }

    @Override
    public String toString() {
        return "X: "+ x+ " | " + "Y: "+ y;
    }
}
