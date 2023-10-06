package practice_7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FootballMatch extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;

    private JButton milanButton;
    private JButton madridButton;
    private JLabel resultLabel;
    private JLabel scorerLabel;
    private JLabel winnerLabel;

    public FootballMatch() {
        setTitle("Football Match");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(5, 1));

        milanButton = new JButton("AC Milan");
        milanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateScores();
                scorerLabel.setText("Last Scorer: AC Milan");
                checkWinner();
            }
        });
        add(milanButton);

        madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateScores();
                scorerLabel.setText("Last Scorer: Real Madrid");
                checkWinner();
            }
        });
        add(madridButton);

        resultLabel = new JLabel("Result: 0 X 0");
        add(resultLabel);

        scorerLabel = new JLabel("Last Scorer: N/A");
        add(scorerLabel);

        winnerLabel = new JLabel("Winner: DRAW");
        add(winnerLabel);
    }

    private void updateScores() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
    }

    private void checkWinner() {
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (milanScore < madridScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

}

