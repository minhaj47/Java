public class TupleDemo {
    public static void main(String[] args){
        Tuple<String, String> tuple = new Tuple<String,String>("Minhaj", "Haque");
        tuple.showType();

        Tuple<String, Integer> person = new Tuple<String, Integer>("Minhaj", 23);
        person.showType();

        Tuple<String, Tuple<String, Integer>> tupleInsideTuple = new Tuple<>("Minhaj", new Tuple<>("Haque", 23));
        tupleInsideTuple.showType();
    }
}
