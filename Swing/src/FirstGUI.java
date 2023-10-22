import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGUI {
    public static void main(String[] args){
        Abc obj = new Abc();
    }
}

class Abc extends JFrame {
    public Abc(){

        
        JLabel label = new JLabel("Assalamu alaikum");
        JLabel label1 = new JLabel("La Ilaha Illallah");
        JButton button = new JButton("Quran and Sunnah");

        
        add(label);
        add(label1);
        add(button);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}