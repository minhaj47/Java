package code.Interface;

public class MediaPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Media Player Started");
    }

    @Override
    public void stop() {
        System.out.println("Media Player Stopped");
    }
}
