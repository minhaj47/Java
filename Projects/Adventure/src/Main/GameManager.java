package Main;

import Events.Event1;

public class GameManager {
    ActionHandler aHandler = new ActionHandler(this);
    public UI ui = new UI(this);
    Event1 ev1 = new Event1(this);
    SceneChanger sChanger = new SceneChanger(this);

    public static void main(String[] args) {
        new GameManager();
    }
    public GameManager(){
        sChanger.showScreen1();
    }
}