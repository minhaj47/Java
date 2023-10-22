package code.Interface;

public class NiceDemo {
    public static void main(String[] args) {
        NiceCar car = new NiceCar();

        car.start();
        car.acl();
        car.musicStart();
        car.musicStop();
        car.brake();
        car.stop();
        car.upGradeEngine(new ElectricEngine());
        car.start();

        int [] a = new int [10];
        a[0]=4;
        System.out.println(a.length);

        show();
        NiceDemo nD = new NiceDemo();
        nD.show2();
        nD.show();

    }
    static void show(){
        System.out.println();
    }
    void show2(){
        System.out.println();
    }
}
