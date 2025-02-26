package game.framework;

public abstract class Extra implements Drawable{
    public Vector location;
    public int height;
    public int width;
    public abstract void onCollision();

    public Vector getLocation() {
        return location;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
