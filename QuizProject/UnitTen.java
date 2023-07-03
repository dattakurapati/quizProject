import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;


public class UnitTen extends JPanel implements ActionListener {
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

    public UnitTen(ProjectWindow w) {
        window = w;
        setSize(800, 600);
        setLocation(0, 0);
        setLayout(null);
        setBackground(Color.ORANGE);

        q1Ans = false;
        q2Ans = false;

        unitName = new JLabel("Unit 10 (The last button clicked (A, B, C, D) is the answer choice that is saved.)");
        unitName.setBounds(50, 15, 600, 50);
        unitName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        question = new JTextArea(10, 1);
        question.setFont(new Font("Times New Roman", Font.PLAIN, 15));
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
        question.setText("Consider the following recursive method.\npublic int recur(int n) {\n    if(n <= 10)\n        return n * 2;\n    else\n         return recur(recur(n/3));\n}\nWhat value is returned as a result of the class recur(27)?");

        answerTextA.setText("8");
        answerTextB.setText("16");
        answerTextC.setText("9");
        answerTextD.setText("12");
        question.setBounds(50, 65, 500, 250);
        answerTextA.setBounds(110, 320, 400, 35);
        answerTextB.setBounds(110, 370, 400, 35);
        answerTextC.setBounds(110, 420, 400, 35);
        answerTextD.setBounds(110, 470, 400, 35);


    }

    public void q2() {

        question.setWrapStyleWord(true);
        question.setText("public static int m00h(int x) {\n    if(x < 1)\n        return 1;\n    else\n       return m00h(x-2) * x;\n}\nWhat is returned by the method call m00h(3)?");
        answerTextA.setText("3");
        answerTextB.setText("0");
        answerTextC.setText("48");
        answerTextD.setText("36");
        question.setBounds(50, 65, 500, 250);
        answerTextA.setBounds(110, 320, 400, 35);
        answerTextB.setBounds(110, 370, 400, 35);
        answerTextC.setBounds(110, 420, 400, 35);
        answerTextD.setBounds(110, 470, 400, 35);

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
            finalResult.setText("You got one question right. 10 points.");
            HomePanel.score += 10;
            HomePanel.scoreLabel.setText("Current Score: " + HomePanel.score);
        } else if (q2Ans == false && q1Ans == true) {
            setBackground(Color.yellow);
            finalResult.setText("You got one question right. 10 points.");
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
            window.whenClickedExit10();
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