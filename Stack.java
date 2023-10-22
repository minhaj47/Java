public class Stack {

    // public static void main(String[] args){
        
    // }
    int[] stck = new int[10];
    int tos;

    // initialize topOfStack
    Stack(){
        tos=-1;
    }

    // push 
    void push(int item){
        if(tos==9){
            System.out.println("Overflow");
        }
        else stck[tos++]=item;
    }

    // pop
    int pop(){
        if(tos < 0){
            System.out.println("Underflow");
            return -1;
        }
        else 
            return stck[tos--];
    }
}
