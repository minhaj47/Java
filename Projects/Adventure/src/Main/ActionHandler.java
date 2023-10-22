package Main;

import Events.Event1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener {
    GameManager gm;
    public ActionHandler(GameManager gm){
        this.gm = gm;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String choice = e.getActionCommand();

        switch (choice){
            case "LookHut":
                gm.ev1.lookHut();
                break;
            case "TalkHut":
                gm.ev1.talkHut();
                break;
            case "RestHut" :
                gm.ev1.restHut();
                break;
            case "LookGuard":
                gm.ev1.lookGuard();
                break;
            case "TalkGuard":
                gm.ev1.talkGuard();
                break;
            case "AttackGuard" :
                gm.ev1.attackGuard();
                break;
            case "LookChest":
                gm.ev1.lookChest();
                break;
            case "TalkChest":
                gm.ev1.talkChest();
                break;
            case "OpenChest" :
                gm.ev1.openChest();
                break;
            // Scene Change
            case "goScene1" :
                gm.sChanger.showScreen1();
                break;
            case "goScene2" :
                gm.sChanger.showScreen2();
                break;
        }
    }
}
