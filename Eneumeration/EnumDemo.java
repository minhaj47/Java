enum Apple{ 
    Jonathan, GoldenDel(5), RedDel, Winesap, Cortland; 
    int price =0;
    Apple(int price){
        this.price = price;
    }
    Apple(){
        price = -1;
    }
}
class EnumDemo{
    public static void main(String[] args){
        Apple ap, ap1, ap2;
        ap = Apple.Cortland;
        for(Apple a: Apple.values()){
            System.out.println(a + " ordinal values : " + a.ordinal());
        }
    }
}