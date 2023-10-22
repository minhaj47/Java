package code.Interface;

public class Car implements Brake, Engine, Media{

    @Override
    public void brake() {
        System.out.println("Car is braking");
    }

    @Override
    public void start() {
        System.out.println("Car is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is Stopping");
    }

    @Override
    public void acl() {
        System.out.println("Engine is Accelerating");
    }
}
