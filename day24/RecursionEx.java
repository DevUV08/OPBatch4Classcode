public class RecursionEx {
    static void printN(int start, int end){
        if(start==end+1){
            return;
        }
        System.out.println(start);
        printN(start+1, end);
    }
    public static void main(String[] args) {
        printN(1, 5);
    }
}
