public class GenericStackDemo {
    public static void main(String[] args){
        GenericStack <Integer> stack = new GenericStack<>();
        stack.push(5);
        stack.push(55);
        stack.push(15);
        stack.push(52);
        stack.push(54);
        stack.push(57);
        stack.push(57);
        stack.push(57);
        stack.push(57);

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.getSize());

        GenericStack <String> st = new GenericStack<>();
        st.push("5");
        st.push("ismail");
        st.push("fuad vai");
        st.push("rafi vai");
        st.push("sarwar vai");
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        // st.pop();


        System.out.println(st);
        System.out.println(st.getSize());
    }
    
}
