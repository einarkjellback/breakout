package experiments;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class TestGame extends JPanel {
    int x = 0;
    int y = 0;
    double speed = 0.5;

    private void step() {
        if (kmlpoi)
        x += speed;
        y += speed;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 30, 30);
    }

    public static void main(String[] args) throws InterruptedException {
        TestGame game = new TestGame();
        JFrame frame = new JFrame("This is a test");
        frame.add(game);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setVisible(true);
        while (true) {
            game.step();
            game.repaint();
            Thread.sleep(5);
        }
    }
}
