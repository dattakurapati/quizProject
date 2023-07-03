import javax.swing.JFrame;


public class ProjectWindow extends JFrame {
    private UnitOne one = new UnitOne(this);
    private UnitTwo two = new UnitTwo(this);
    private UnitThree three = new UnitThree(this);
    private UnitFour four = new UnitFour(this);
    private UnitFive five = new UnitFive(this);
    private UnitSix six = new UnitSix(this);
    private UnitSeven seven = new UnitSeven(this);
    private UnitEight eight = new UnitEight(this);
    private UnitNine nine = new UnitNine(this);
    private UnitTen ten = new UnitTen(this);
    private HomePanel home;

    public ProjectWindow() {
        setSize(800, 600); // width and the height of the window
        setTitle("Quiz Project - Kurapati");
        setResizable(false); // prevents the window from being able to change in size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);

        home = new HomePanel(this);
        
        add(home);
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(ten);
        one.setVisible(false);
        two.setVisible(false);
        three.setVisible(false);
        four.setVisible(false);
        five.setVisible(false);
        six.setVisible(false);
        seven.setVisible(false);
        eight.setVisible(false);
        nine.setVisible(false);
        ten.setVisible(false);
        setVisible(true);
    }
    public void whenClickedOne() {
        home.setVisible(false);
        one.setVisible(true);
    }

    public void whenClickedExit() {
        one.setVisible(false);
        home.setVisible(true);
    }

    public void whenClickedTwo() {
        home.setVisible(false);
        two.setVisible(true);
    }

    public void whenClickedExit2() {
        two.setVisible(false);
        home.setVisible(true);
    }

    public void whenClickedThree() {
        home.setVisible(false);
        three.setVisible(true);
    }

    public void whenClickedExit3() {
        three.setVisible(false);
        home.setVisible(true);
    }

    public void whenClickedFour() {
        home.setVisible(false);
        four.setVisible(true);
    }

    public void whenClickedExit4() {
        four.setVisible(false);
        home.setVisible(true);
    }

    public void whenClickedFive() {
        home.setVisible(false);
        five.setVisible(true);
    }

    public void whenClickedExit5() {
        five.setVisible(false);
        home.setVisible(true);
    }

    public void whenClickedSix() {
        home.setVisible(false);
        six.setVisible(true);
    }

    public void whenClickedExit6() {
        six.setVisible(false);
        home.setVisible(true);
    }

    public void whenClickedSeven() {
        home.setVisible(false);
        seven.setVisible(true);
    }

    public void whenClickedExit7() {
        seven.setVisible(false);
        home.setVisible(true);
    }

    public void whenClickedEight() {
        home.setVisible(false);
        eight.setVisible(true);
    }

    public void whenClickedExit8() {
        eight.setVisible(false);
        home.setVisible(true);
    }

    public void whenClickedNine() {
        home.setVisible(false);
        nine.setVisible(true);
    }

    public void whenClickedExit9() {
        nine.setVisible(false);
        home.setVisible(true);
    }

    public void whenClickedTen() {
        home.setVisible(false);
        ten.setVisible(true);
    }

    public void whenClickedExit10() {
        ten.setVisible(false);
        home.setVisible(true);
    }
}