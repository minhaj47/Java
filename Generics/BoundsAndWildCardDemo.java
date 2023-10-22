class Stats<T extends Number>{
    T[] nums;
    public Stats(T[] nums){
        this.nums = nums;
    }
    double average(){
        double sum = 0.0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i].doubleValue();
        }
        return sum/nums.length;
    }
    boolean isSameAvg(Stats<?> ob){  // if T is written it is specified to Integer or double
        // on which it is defined hence another could not be sent as parameter
        // hence wildcard is used to resolve

        if(ob.average()==average()){
            return true;
        }
        return false;
    }
}
public class BoundsAndWildCardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> stats = new Stats<>(inums);
        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> stats1 = new Stats<>(dnums);

        System.out.println("INterger Avg : " + stats.average());
        System.out.println("Double Avg : " + stats1.average());

        if(stats1.isSameAvg(stats)){
            System.out.println("Same");
        }else System.out.println("not same ");
    }

}
