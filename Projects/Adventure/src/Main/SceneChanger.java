package Main;

public class SceneChanger {
    GameManager gm;
    public SceneChanger(GameManager gm){
        this.gm = gm;
    }
    public void showScreen1(){
        gm.ui.bgpanel[1].setVisible(true);
        gm.ui.bgpanel[2].setVisible(false);
        gm.ui.massageText.setText("ADVENTURE!\nLet's Defeat the Demon lord and save the world!");

    }
    public void showScreen2(){
        gm.ui.bgpanel[1].setVisible(false);
        gm.ui.bgpanel[2].setVisible(true);
        gm.ui.massageText.setText("You are in the 2nd Scene!");

    }
}
