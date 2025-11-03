
public class Factorial {
    static int factorialTrailingZeros(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int num=i;
            while (num % 5 == 0) {
                num = num / 5;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(factorialTrailingZeros(5));
        System.out.println(factorialTrailingZeros(10));
        System.out.println(factorialTrailingZeros(8));
        System.out.println(factorialTrailingZeros(15));
        System.out.println(factorialTrailingZeros(13));
    }
}
