package Events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyGUI extends JFrame {
    private JPanel panel;
    private double scale = 1.0;

    public MyGUI() {
               // Create the GUI components
        panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.scale(scale, scale);
                // Draw your GUI components here
            }
        };
        JScrollPane scrollPane = new JScrollPane(panel);

        // Add a mouse wheel listener to the scroll pane to handle zooming
        scrollPane.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if (e.isControlDown()) {
                    int notches = e.getWheelRotation();
                    if (notches < 0) {
                        scale *= 1.1;
                    } else {
                        scale /= 1.1;
                    }
                    panel.repaint();
                }
            }
        });

        // Add the scroll pane to the JFrame
        add(scrollPane);

        // Set some properties of the JFrame
        setTitle("My GUI");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}