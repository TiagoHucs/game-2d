package game;

import config.ConfigService;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel implements Runnable {
    private boolean running = false;
    private Thread gameThread;
    private Player player;

    public Game() {
        setPreferredSize(new Dimension(ConfigService.WIDTH, ConfigService.HEIGHT));
        setBackground(Color.BLACK);
        player = new Player(100, 100);
        addKeyListener(player);
        setFocusable(true);
    }

    public void start() {
        running = true;
        gameThread = new Thread(this);
        gameThread.start();
    }

    public void run() {
        while (running) {
            update();
            repaint();
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void update() {
        player.update();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        player.draw(g);
    }
}