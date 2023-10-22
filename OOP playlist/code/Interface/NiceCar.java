package code.Interface;

public class NiceCar implements Brake{
    private Engine engine;
    private Media media = new MediaPlayer();

    public NiceCar(){
        this.engine = new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void acl(){
        engine.acl();
    }
    public void musicStart(){
        media.start();
    }
    public void musicStop(){
        media.stop();
    }
    public void upGradeEngine(Engine engine){
        this.engine = engine;
    }


    @Override
    public void brake() {
        System.out.println("Braking");
    }
}
