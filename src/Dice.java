import javax.swing.*;
import java.awt.*;

public class Dice extends JPanel {
    private int value;

    public Dice(int value) {
        this.value = value;
    }

    public Dice() {

    }

    public void paintComponent(Graphics dice) {
        super.paintComponent(dice);

        this.setBackground(Color.WHITE);

        dice.setColor(Color.BLACK);
        dice.drawRect(10, 10, 100, 100);

        switch (value) {
            case 1:
                dice.fillOval(50, 50, 20, 20);
                break;
            case 2:
                dice.fillOval(30, 30, 20, 20);
                dice.fillOval(70, 70, 20, 20);
                break;
            case 3:
                dice.fillOval(30, 30, 20, 20);
                dice.fillOval(50, 50, 20, 20);
                dice.fillOval(70, 70, 20, 20);
                break;
            case 4:
                dice.fillOval(30, 30, 20, 20);
                dice.fillOval(30, 70, 20, 20);
                dice.fillOval(70, 30, 20, 20);
                dice.fillOval(70, 70, 20, 20);
                break;
            case 5:
                dice.fillOval(30, 30, 20, 20);
                dice.fillOval(30, 70, 20, 20);
                dice.fillOval(50, 50, 20, 20);
                dice.fillOval(70, 30, 20, 20);
                dice.fillOval(70, 70, 20, 20);
                break;
            case 6:
                dice.fillOval(30, 30, 20, 20);
                dice.fillOval(30, 50, 20, 20);
                dice.fillOval(30, 70, 20, 20);
                dice.fillOval(70, 30, 20, 20);
                dice.fillOval(70, 50, 20, 20);
                dice.fillOval(70, 70, 20, 20);
                break;
            default:
                break;
        }
    }
}
