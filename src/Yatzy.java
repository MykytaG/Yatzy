import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;

public class Yatzy implements ActionListener {
    JFrame mainframe;
    JButton roll;

    int dicenummer;

    ArrayList<JLabel> dicelist = new ArrayList<>();

    int space;

        Yatzy() {

            mainframe = new JFrame();
            mainframe.setVisible(true);
            mainframe.setLayout(null);
            mainframe.setResizable(false);
            mainframe.setSize(700, 500);

            roll = new JButton("Roll");
            mainframe.add(roll);
            roll.setBounds(50, 300, 100, 50);
            roll.addActionListener(this);
            space = 10;





        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == roll){
                dicenummer = ((int) (Math.random() * 6 + 1));
                System.out.println(dicenummer);
                mainframe.add(new Dice()).setBounds(space,10,120,120);
                space += 130;

            }

        }



        public static void main(String[] args) {

            new Yatzy();


        }
    }

