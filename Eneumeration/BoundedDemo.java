class Stats<T extends Number>{  // upper bound
    T[] nums;
    Stats(T[] o){
        nums = o;
    }
    double average(){
        double sum = 0.0;
        for(int i=0; i<nums.length; i++){
            sum+= nums[i].doubleValue();
        }
        return sum/nums.length;
    }
    //void isSame(Stats<T> ob){
    void isSame(Stats<?> ob){   // wildcard argument
        if(average()==ob.average()){
            System.out.println("Same");
        }
        else System.out.println("Different");
    }
}

public class BoundedDemo {
    public static void main(String[] args) {
        Integer[] inums = { 1, 2, 4, 3, 5};
        Stats<Integer> iOb = new Stats<>(inums);
        double avg = iOb.average();
        System.out.println("iOb average is :" + avg);
        Double[] dnums = {1.1, 2.2, 3.3, 4.4};
        Stats<Double> diOb = new Stats<>(dnums);
        double davg = diOb.average();
        System.out.println("diOb average is :" + davg);
        iOb.isSame(iOb);
        iOb.isSame(diOb);

        diOb.isSame(iOb);
        diOb.isSame(diOb);

    }
}
