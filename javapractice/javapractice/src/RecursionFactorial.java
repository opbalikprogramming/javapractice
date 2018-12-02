public class RecursionFactorial {
    public static void main(String[] args) {

        System.out.println(factorial(5));

        StringBuffer hashing = new StringBuffer("hello");
        System.out.println(hashing);
        

    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);

    }
}
