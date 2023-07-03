import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;


public class UnitFive extends JPanel implements ActionListener {
    ProjectWindow window;
    JLabel unitName;
    JTextArea question;
    JLabel answerTextA;
    JLabel answerTextB;
    JLabel answerTextC;
    JLabel answerTextD;
    JButton ans1;
    JButton ans2;
    JButton ans3;
    JButton ans4;
    JButton exit;
    JButton back;
    JButton next;
    JButton submit;
    int rand;
    boolean q1Ans;
    boolean q2Ans;
    JLabel finalResult;

    public UnitFive(ProjectWindow w) {
        window = w;
        setSize(800, 600);
        setLocation(0, 0);
        setLayout(null);
        setBackground(Color.ORANGE);

        q1Ans = false;
        q2Ans = false;

        unitName = new JLabel("Unit 5 (The last button clicked (A, B, C, D) is the answer choice that is saved.)");
        unitName.setBounds(50, 15, 600, 50);
        unitName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        question = new JTextArea(10, 1);
        question.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        ans1 = new JButton("A");
        ans2 = new JButton("B");
        ans3 = new JButton("C");
        ans4 = new JButton("D");
        exit = new JButton("Exit");
        back = new JButton("Back");
        next = new JButton("Next");
        submit = new JButton("Submit");
        answerTextA = new JLabel();
        answerTextB = new JLabel();
        answerTextC = new JLabel();
        answerTextD = new JLabel();
        finalResult = new JLabel();
        finalResult.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        ans1.setBounds(50, 320, 45, 35);
        ans2.setBounds(50, 370, 45, 35);
        ans3.setBounds(50, 420, 45, 35);
        ans4.setBounds(50, 470, 45, 35);
        exit.setBounds(680, 25, 60, 40);
        back.setBounds(50, 520, 100, 40);
        next.setBounds(640, 520, 100, 40);
        submit.setBounds(640, 520, 100, 40);

        rand = (int)(Math.random()*2 + 1);
        
        question.setEditable(false);
        question.setBackground(Color.orange);

        if (rand == 1) {
            q1();
        } else if (rand == 2) {
            q2();
        }

        back.setVisible(false);
        submit.setVisible(false);
        finalResult.setVisible(false);
        
        add(unitName);
        add(ans1);
        add(ans2);
        add(ans3);
        add(ans4);
        add(exit);
        add(next);
        add(back);
        add(question);
        add(submit);
        add(answerTextA);
        add(answerTextB);
        add(answerTextC);
        add(answerTextD);
        add(finalResult);

        exit.addActionListener(this);
        back.addActionListener(this);
        next.addActionListener(this);
        ans1.addActionListener(this);
        ans2.addActionListener(this);
        ans3.addActionListener(this);
        ans4.addActionListener(this);
        submit.addActionListener(this);
    }

    public void q1() {
        
        question.setWrapStyleWord(true);
        question.setText("public class Car { \n    private String brand; \n    private int numSeats, numWheels;\n    public Car(String n, int s, int w) { \n        brand = n;\n        numSeats = s;\n        numWheels = w;\n    }\n}\nWhich of the following statements correctly constructs a Car object?");

        answerTextA.setText("Car c = new Car(3, \"Honda\", 10);");
        answerTextB.setText("Car c = new Car(\"Honda\", 5, 4);");
        answerTextC.setText("Car c = new Car(\"Honda\", 5, \"4\");");
        answerTextD.setText("None of the above");
        question.setBounds(50, 65, 500, 250);
        answerTextA.setBounds(110, 320, 400, 35);
        answerTextB.setBounds(110, 370, 400, 35);
        answerTextC.setBounds(110, 420, 400, 35);
        answerTextD.setBounds(110, 470, 400, 35);


    }

    public void q2() {

        question.setWrapStyleWord(true);
        question.setText("Consider the following Bugs class, which is intended to simulate variations in a population of bugs. \nThe population is stored in the method\'s int attribute. The getPopulation method is \nintended to allow methods in other classes to access a Bugs object\'s population value;\nhowever, it does not work as intended. \npublic class Bugs {\n    private int population;\n    public Bugs(int p) {\n        population = p;\n    }\n    public int getPopulation(){\n        return p;\n    }\n}\nWhich of the following best explains why the getPopulation method does NOT work as intended?");
        answerTextA.setText("The getPopulation method should be declared as private.");
        answerTextB.setText("The return type of the getPopulation method should be void.");
        answerTextC.setText("The instance variable population should be returned instead of p, which is local to the constructor.");
        answerTextD.setText("The variable population is not declared inside the getPopulation method.");
        question.setBounds(50, 65, 500, 250);
        answerTextA.setBounds(110, 320, 450, 35);
        answerTextB.setBounds(110, 370, 450, 35);
        answerTextC.setBounds(110, 420, 570, 35);
        answerTextD.setBounds(110, 470, 450, 35);

    }

    public void whenSubmit() {
        question.setVisible(false);
        answerTextA.setVisible(false);
        answerTextB.setVisible(false);
        answerTextC.setVisible(false);
        answerTextD.setVisible(false);
        back.setVisible(false);
        next.setVisible(false);
        submit.setVisible(false);
        ans1.setVisible(false);
        ans2.setVisible(false);
        ans3.setVisible(false);
        ans4.setVisible(false);


        if(q1Ans == false && q2Ans == false) {
            setBackground(Color.red);
            finalResult.setText("You got both questions wrong. No points.");
        } else if(q1Ans == false && q2Ans == true) {
            setBackground(Color.yellow);
            finalResult.setText("You got the one right. 10 points.");
            HomePanel.score += 10;
            HomePanel.scoreLabel.setText("Current Score: " + HomePanel.score);
        } else if (q2Ans == false && q1Ans == true) {
            setBackground(Color.yellow);
            finalResult.setText("You got the one right. 10 points.");
            HomePanel.score += 10;
            HomePanel.scoreLabel.setText("Current Score: " + HomePanel.score);
        } else {
            setBackground(Color.green);
            finalResult.setText("You got the both questions right. 20 points.");
            HomePanel.score += 20;
            HomePanel.scoreLabel.setText("Current Score: " + HomePanel.score);
        }
        
        finalResult.setVisible(true);
        finalResult.setBounds(140, 240, 600, 40);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == exit) {
            window.whenClickedExit5();
        } else if(e.getSource() == next) {
            if (rand == 1) {
                q2();
                rand = 2;
                back.setVisible(true);
                next.setVisible(false);
                submit.setVisible(true);

            } else if(rand == 2) {
                q1();
                rand = 1;
                back.setVisible(true);
                next.setVisible(false);
                submit.setVisible(true);
            }
        } else if(e.getSource() == back) {
            if(rand == 2) {
                q1();
                rand = 1;
                back.setVisible(false);
                next.setVisible(true);
                submit.setVisible(false);

            } else if (rand == 1) {
                q2();
                rand = 2;
                back.setVisible(false);
                next.setVisible(true);
                submit.setVisible(false);
            }

        } else if(e.getSource() == ans1 && rand == 1) {
            q1Ans = false;
        } else if (e.getSource() == ans2 && rand == 1) {
            q1Ans = true;
        } else if (e.getSource() == ans3 && rand == 1) {
            q1Ans = false;
        } else if (e.getSource() == ans4 && rand == 1) {
            q1Ans = false;
        } else if (e.getSource() == ans1 && rand == 2) { 
            q2Ans = false;
        } else if (e.getSource() == ans2 && rand == 2) {
            q2Ans = false;
        } else if (e.getSource() == ans3 && rand == 2) {
            q2Ans = true;
        } else if (e.getSource() == ans4 && rand == 2) {
            q2Ans = false;

        } else if(e.getSource() == submit) {
            whenSubmit();
        }
        
    }

}