package Events;

import Main.GameManager;

public class Event1 {
    GameManager gm;
    public Event1(GameManager gm){
        this.gm = gm;
    }
    public void lookHut(){
        gm.ui.massageText.setText("This is your House");
    }
    public void talkHut(){
        gm.ui.massageText.setText("Whom are you talking to?");
    }
    public void restHut(){
        gm.ui.massageText.setText("Rest in House\nYour Life has recovered");
    }
    public void lookGuard(){
        gm.ui.massageText.setText("A guard is standing in front of you.");
    }
    public void talkGuard(){
        gm.ui.massageText.setText("Guard: Don't go any further without weapon!\nLook at the Chest over there!");
    }
    public void attackGuard(){
        gm.ui.massageText.setText("Hey! Don't be stupid.");
    }
    public void lookChest(){
        gm.ui.massageText.setText("A chest is on the ground.");
    }
    public void talkChest(){
        gm.ui.massageText.setText("How fool you are to talk to a object!");
    }
    public void openChest(){
        gm.ui.massageText.setText("You opened the chest\nAnd found a sword!");
    }
}
