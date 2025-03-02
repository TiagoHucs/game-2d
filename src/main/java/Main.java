import config.ConfigService;
import game.Game;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame(ConfigService.TITLE);
        Game game = new Game();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(game);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        game.start();
    }
}

