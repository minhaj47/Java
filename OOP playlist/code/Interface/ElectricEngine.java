package code.Interface;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Electric Engine Stopped");
    }

    @Override
    public void acl() {
        System.out.println("Electric Engine started Acceleration");
    }
}
