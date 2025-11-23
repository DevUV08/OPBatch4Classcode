import java.util.Stack;
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        // inserting the value 
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        // removing values 
        System.out.println(st.pop());
        System.out.println("After removing: "+ st);
        // length of the stack 
        System.out.println(st.size());
        // check whether a stack is empty or not
        System.out.println(st.isEmpty());
        System.out.println("Top: "+st.peek());
        // clear 
        st.clear();
        System.out.println(st);
    }
}
