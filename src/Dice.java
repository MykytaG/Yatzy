import javax.swing.*;
import java.awt.*;

public class Dice extends JPanel {
        public void paintComponent(Graphics dice1) {
            super.paintComponent(dice1);

            this.setBackground(Color.WHITE);

            dice1.setColor(Color.BLACK);
            dice1.drawRect(10, 10, 100, 100);

            dice1.setColor(Color.BLACK);
            dice1.fillOval(30, 30, 20, 20);
            dice1.fillOval(30, 70, 20, 20);
            dice1.fillOval(70, 30, 20, 20);
            dice1.fillOval(70, 70, 20, 20);
            dice1.fillOval(50, 50, 20, 20);
        }
}
