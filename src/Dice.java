import javax.swing.*;
import java.awt.*;

public class Dice extends JPanel {
    public int value;

    JButton dicebutton;

    JButton dice1;

    JButton dice2;

    JButton dice3;

    JButton dice4;

    JButton dice5;

    JButton dice6;

    public int[] dicenummer = new int[6];

    public Dice(int value) {
        this.value = value;
    }

    public void paintComponent(Graphics dice) {
        super.paintComponent(dice);

        this.setBackground(Color.WHITE);

        dice.setColor(Color.BLACK);
        dice.drawRect(10, 10, 100, 100);

        switch (value) {
            case 1:
                dicenummer[0] = 1;
                dice.fillOval(50, 50, 20, 20);
                break;
            case 2:
                dicenummer[1] = 2;
                dice.fillOval(30, 30, 20, 20);
                dice.fillOval(70, 70, 20, 20);
                break;
            case 3:
                dicenummer[2] = 3;
                dice.fillOval(30, 30, 20, 20);
                dice.fillOval(50, 50, 20, 20);
                dice.fillOval(70, 70, 20, 20);
                break;
            case 4:
                dicenummer[3] = 4;
                dice.fillOval(30, 30, 20, 20);
                dice.fillOval(30, 70, 20, 20);
                dice.fillOval(70, 30, 20, 20);
                dice.fillOval(70, 70, 20, 20);
                break;
            case 5:
                dicenummer[4] = 5;
                dice.fillOval(30, 30, 20, 20);
                dice.fillOval(30, 70, 20, 20);
                dice.fillOval(50, 50, 20, 20);
                dice.fillOval(70, 30, 20, 20);
                dice.fillOval(70, 70, 20, 20);
                break;
            case 6:
                dicenummer[5] = 6;
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
