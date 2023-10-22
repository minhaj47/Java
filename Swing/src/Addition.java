import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Addition extends JFrame /*implements ActionListener */{
    
    JTextField t1, t2;
    JButton b1, b2;
    JLabel lb1;

    public Addition(){
        t1 = new JTextField(40);
        t2 = new JTextField(40);
        b1 = new JButton("Add");
        b2 = new JButton("Substruct");
        lb1 = new JLabel("REsult");
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(lb1);

        // b1.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e) {
        //         int num1 = Integer.parseInt(t1.getText());
        //         int num2 = Integer.parseInt(t2.getText());
                
        //         int ans = num1 + num2;
        //         lb1.setText("" + ans);
        //     }
        // });

        b1.addActionListener( e -> {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            
            int ans = num1 + num2;
            lb1.setText("" + ans);
        });

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     int num1 = Integer.parseInt(t1.getText());
    //     int num2 = Integer.parseInt(t2.getText());
        
    //     int ans = num1 + num2;
    //     lb1.setText("" + ans);
    // }
}
