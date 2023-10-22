enum Day {
    Saturday, Sunday, Monday, Tuesday, Wednesday, Thursday, Friday
}
public class EnumExample{
    public static void main(String[] args){
        EnumExample enumExample = new EnumExample();
        Day day = Day.Saturday;
                            // enum is a static type variable so it can only call a static method without making instance
        //displayDay(day); 
                            // display must be static for using directly
        enumExample.displayDay(day);  
                            // displayDay is called after making an instance of EnumExample class
        enumExample.switchEnum(day);
    }

    public void displayDay(Day day){
        if(day == Day.Friday || day == Day.Saturday){
            System.out.println(day + " is weekend\n");
        }
        else 
            System.out.println(day + "is a weekday\n");
    }  
    
    public void switchEnum(Day day){
        switch(day){
            case Saturday, Friday : 
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Weekday");
        }
    }
}

