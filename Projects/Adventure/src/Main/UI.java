package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class UI {

    GameManager gm;

    JFrame window;
    public JTextArea massageText;
    public JPanel bgpanel[] = new JPanel[10];
    public JLabel bglabel[] = new JLabel[10];


    //Player UI
    JPanel lifePanel;
    JLabel lifeLabel[] = new JLabel[6];

    public UI(GameManager gm){
        this.gm = gm;

        createMainField();
        generateScreen();
        window.setVisible(true);
    }

    public void createMainField(){
        window = new JFrame();
        window.setSize(1400, 1400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(new BorderLayout());

        massageText = new JTextArea("ADVENTURE");
        massageText.setBounds(50, 960, 1280, 300);
        massageText.setBackground(Color.black);
        massageText.setForeground(Color.white);
        massageText.setEditable(false);
        massageText.setLineWrap(true);
        massageText.setFont(new Font("Glass Antiqua", Font.BOLD, 60));
        window.add(massageText);
    }

    public void createBackground(int bgNum, String bgFileName){
        bgpanel[bgNum] = new JPanel();
        bgpanel[bgNum].setBounds(60, 50, 1280, 900);
        bgpanel[bgNum].setBackground(Color.black);
        bgpanel[bgNum].setLayout(null);

        window.add(bgpanel[bgNum]);

        bglabel[bgNum]= new JLabel();
        bglabel[bgNum].setBounds(60, 0, 1280, 900);
        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource(bgFileName));
        bglabel[bgNum].setIcon(bgIcon);


    }

    public void createArrowIcon(int bgNum, int x, int y, int wid, int height, String objFileName, String command){

        ImageIcon arrowIcon = new ImageIcon(getClass().getClassLoader().getResource(objFileName));
        JButton arrowButton = new JButton();

        arrowButton.setBounds(x, y, wid, height);
        arrowButton.setBackground(null);
        arrowButton.setContentAreaFilled(false);
        arrowButton.setFocusPainted(false);
        arrowButton.setIcon(arrowIcon);
        arrowButton.addActionListener(gm.aHandler);
        arrowButton.setActionCommand(command);
        //arrowButton.addActionListener();

        bgpanel[bgNum].add(arrowButton);

    }

    public void createObject(int bgNum, int objx, int objy, int objwid, int objhight, String objFileName,
                             String choiceName1, String choiceName2, String choiceName3,
                             String choiceCommand1, String choiceCommand2, String choiceCommand3 ){

        JPopupMenu popMenu = new JPopupMenu();
        JMenuItem [] menuItem = new JMenuItem[4];

        menuItem[1] = new JMenuItem(choiceName1);
        menuItem[1].addActionListener(gm.aHandler);
        menuItem[1].setActionCommand(choiceCommand1);
        popMenu.add(menuItem[1]);

        menuItem[2] = new JMenuItem(choiceName2);
        menuItem[2].addActionListener(gm.aHandler);
        menuItem[2].setActionCommand(choiceCommand2);
        popMenu.add(menuItem[2]);

        menuItem[3] = new JMenuItem(choiceName3);
        menuItem[3].addActionListener(gm.aHandler);
        menuItem[3].setActionCommand(choiceCommand3);
        popMenu.add(menuItem[3]);

        JLabel objLabel = new JLabel();

        objLabel.setBounds(objx, objy, objwid, objhight);
        ImageIcon objIcon = new ImageIcon(getClass().getClassLoader().getResource(objFileName));
        objLabel.setIcon(objIcon);

        objLabel.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {
               if(SwingUtilities.isRightMouseButton(e)){
                    popMenu.show(objLabel, e.getX(), e.getY());
                }
            }
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });

        bgpanel[bgNum].add(objLabel);

    }

    public void generateScreen(){


        // Scene 1

        createBackground(1, "resources/landscape2.jpg");

        createObject( 1, 350, 500, 200, 400, "resources/warrior.png",
                "Look", "Talk", "Attack",
                "LookGuard", "TalkGuard", "AttackGuard");

        createObject( 1, 720, 770, 230, 120, "resources/chest.png",
                "Look", "Talk", "Open" ,
                "LookChest", "TalkChest", "OpenChest");

        createObject( 1, 600, 470, 640, 440, "resources/hut1.png",
                "Look", "Talk", "Rest",
                "LookHut", "TalkHut", "RestHut");

        createArrowIcon(1, 1050, 350, 200, 100, "resources/arrow4.png",
                "goScene2");

        bgpanel[1].add(bglabel[1]);

        // Scene 2

        createBackground(2, "resources/cave.jpg");
        createArrowIcon(2, 5, 350, 210, 110, "resources/leftArrow.png",
                "goScene1");
        createObject(2, 1070, 200, 250, 550,  "resources/Empty.png",
                "Look", "Talk", "Enter",
                "LookCave", "TalkCave", "EnterCave");
        createObject(2, 500, 510, 170, 170,  "resources/Empty.png",
                "Look", "Talk", "Search",
                "LookRoot", "TalkRoot", "SearchRoot");
        bgpanel[2].add(bglabel[2]);
    }
}
