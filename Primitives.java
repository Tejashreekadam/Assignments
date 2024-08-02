public class Primitives {
    public static void main(String[] args) {
    int n =234;
        int sum = 0, product = 1;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            product = product * rem;
            n = n / 10;
        }

        System.out.println(n);
    }
}