package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class footballMatch extends JFrame {
    private JButton ac_milan = new JButton("AC Milan");
    private JButton real_madrid = new JButton("Real Madrid");
    private JLabel result = new JLabel("                           Result: 0 X 0");
    private JLabel scorer = new JLabel( "                           Last Scorer: N/A");
    private JLabel winner = new JLabel("Winner: DRAW");
    private int milanScore = 0;
    private int realScore = 0;
    public footballMatch() {
        setTitle("Football match");
        setSize(new Dimension(320, 300));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(ac_milan, BorderLayout.WEST);
        add(real_madrid, BorderLayout.EAST);
        add(result, BorderLayout.NORTH);
        add(scorer, BorderLayout.SOUTH);
        add(winner, BorderLayout.CENTER);
        ac_milan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanScore++;
                result.setText("                           Result: " + milanScore + " X " + realScore);
                scorer.setText("                           Last Scorer: AC Milan");
                if (milanScore > realScore){
                    winner.setText("Winner: AC Milan");
                }
                else if (milanScore < realScore){
                    winner.setText("Winner: Real Madrid");
                }
                else {
                    winner.setText("Winner: DRAW");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        real_madrid.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                realScore++;
                result.setText("                           Result: " + milanScore + " X " + realScore);
                scorer.setText("                           Last Scorer: Real Madrid");
                if (milanScore > realScore){
                    winner.setText("Winner: AC Milan");
                }
                else if (milanScore < realScore){
                    winner.setText("Winner: Real Madrid");
                }
                else {
                    winner.setText("Winner: DRAW");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        setVisible(true);
    }
}
