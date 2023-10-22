 class BoxDemo{
    public static void main(String[] args){
        Box box;
        box = new Box(5, 5, 5);
        System.out.println(box);
        System.out.println("Inside BoxDemo");
        System.out.println(box.volume());
        // System.out.println(box.width);
        // System.out.println(box.height);
        // System.out.println(box.depth);
        Box box2 = new Box(40, 40, 40);
        System.out.println(box2);
        box2.width = box2.height = box2.depth = 20;
        // System.out.println(box2.width);
        // System.out.println(box2.height);
        // System.out.println(box2.depth);
        System.out.println(box2.volume());
        box2 = box;
        // System.out.println(box2.width);
        // System.out.println(box2.height);
        // System.out.println(box2.depth);
        System.out.println(box2.volume());
    }
}
