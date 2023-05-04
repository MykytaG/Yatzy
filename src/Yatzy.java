import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Random;

public class Yatzy implements ActionListener {
    Random rdm = new Random();
    JFrame mainframe;
    JButton roll;

    int[] dicelist = new int[6];

    int space;

        Yatzy() {

            mainframe = new JFrame();
            mainframe.setVisible(true);
            mainframe.setLayout(null);
            mainframe.setResizable(false);
            mainframe.setSize(675, 500);

            roll = new JButton("Roll");
            mainframe.add(roll);
            roll.setBounds(50, 300, 100, 50);
            roll.addActionListener(this);
            space = 10;

            for (int i = 0; i < 5; i++){
                mainframe.add(new Dice(rdm.nextInt(1,7))).setBounds(space,10,120,120);
                space += 130;
            }
            space = -120;
        }

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == roll){

                for (int i = 0; i < 6; i++){
                    mainframe.add(new Dice(rdm.nextInt(1,7))).setBounds(space,10,120,120);
                    space += 130;
                }
                space = -120;
            }
        }

        public static void main(String[] args) {

            new Yatzy();

        }
    }

