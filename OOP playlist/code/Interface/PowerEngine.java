package code.Interface;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Stopped");
    }

    @Override
    public void acl() {
        System.out.println("Power Engine started Acceleration");
    }
}
