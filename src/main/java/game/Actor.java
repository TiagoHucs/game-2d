package game;

import java.awt.*;

class Actor {
    protected int x, y, width, height;
    protected int speed;

    public Actor(int x, int y, int width, int height, int speed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }

    public void draw(Graphics g) {
        g.fillRect(x, y, width, height);
    }
}
