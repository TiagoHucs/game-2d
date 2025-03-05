package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Player extends Actor implements KeyListener {
    private boolean moveLeft, moveRight, moveUp, moveDown;

    public Player(int x, int y) {
        super(x, y, 30, 50, 5, "teste.png");
    }

    public void update() {
        if (moveLeft) x -= speed;
        if (moveRight) x += speed;
        if (moveUp) y -= speed;
        if (moveDown) y += speed;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A  -> moveLeft = true;
            case KeyEvent.VK_D -> moveRight = true;
            case KeyEvent.VK_W -> moveUp = true;
            case KeyEvent.VK_S -> moveDown = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A -> moveLeft = false;
            case KeyEvent.VK_D -> moveRight = false;
            case KeyEvent.VK_W -> moveUp = false;
            case KeyEvent.VK_S -> moveDown = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {}
}
