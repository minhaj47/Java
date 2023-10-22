package code.Interface;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car();

        car.acl();
        car.brake();
        car.stop();

        Media carMedia = new Car();    /// while stopping media it is stopping whole car
        carMedia.start();
    }
}
