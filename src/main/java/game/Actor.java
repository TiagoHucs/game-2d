package game;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class Actor {
    protected int x, y, width, height;
    protected int speed;
    protected BufferedImage image;

    public Actor(int x, int y, int width, int height, int speed, String imagePath) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;

        try {
            image = ImageIO.read(new File(imagePath));
            this.height = image.getHeight();
            this.width = image.getWidth();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g) {
        if(image != null){
            Graphics2D g2d = (Graphics2D) g;
            g2d.setComposite(AlphaComposite.SrcOver);
            g2d.drawImage(image, x, y, width, height, null);
        } else {
            g.fillRect(x, y, width, height);
        }
    }
}
