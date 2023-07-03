import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HomePanel extends JPanel implements ActionListener {
    ProjectWindow window;
    
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JLabel directions;
    static JLabel scoreLabel;
    static int score = 0;

    public HomePanel(ProjectWindow w) {
        window = w;
        setSize(800, 600);
        setLocation(0, 0);
        setLayout(null);
        setBackground(Color.ORANGE);

        // button and label
        button1 = new JButton("Unit 1");
        button2 = new JButton("Unit 2");
        button3 = new JButton("Unit 3");
        button4 = new JButton("Unit 4");
        button5 = new JButton("Unit 5");
        button6 = new JButton("Unit 6");
        button7 = new JButton("Unit 7");
        button8 = new JButton("Unit 8");
        button9 = new JButton("Unit 9");
        button10 = new JButton("Unit 10");
        directions = new JLabel("Click on a unit and answer some questions.");
        scoreLabel = new JLabel("Current Score: " + score);
        button1.setBounds(225, 100, 100, 50);
        button2.setBounds(225, 175, 100, 50);
        button3.setBounds(225, 250, 100, 50);
        button4.setBounds(225, 325, 100, 50);
        button5.setBounds(225, 400, 100, 50);
        button6.setBounds(425, 100, 100, 50);
        button7.setBounds(425, 175, 100, 50);
        button8.setBounds(425, 250, 100, 50);
        button9.setBounds(425, 325, 100, 50);
        button10.setBounds(425,400, 100, 50);
        directions.setBounds(250, 50, 250, 50);
        scoreLabel.setBounds(300, 450, 250, 50);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(button10);
        add(directions);
        add(scoreLabel);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            window.whenClickedOne();
        } else if(e.getSource() == button2) {
            window.whenClickedTwo();
        } else if(e.getSource() == button3) {
            window.whenClickedThree();
        } else if(e.getSource() == button4) {
            window.whenClickedFour();
        } else if(e.getSource() == button5) {
            window.whenClickedFive();
        } else if(e.getSource() == button6) {
            window.whenClickedSix();
        } else if(e.getSource() == button7) {
            window.whenClickedSeven();
        } else if(e.getSource() == button8) {
            window.whenClickedEight();
        } else if(e.getSource() == button9) {
            window.whenClickedNine();
        } else if(e.getSource() == button10) {
            window.whenClickedTen();
        }
    }
}