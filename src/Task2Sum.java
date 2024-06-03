public class Task2Sum {

    // Find the two first numbers
    public static int first2Numbers(int n) {
        // Remove last digit from number
        // till only one digit is left
        while (n >= 100) n /= 100;

        // return the first two numbers
        return n;
    }

    // Find the last two numbers
    public static int last2Numbers(int n) {
        // return two last numbers
        return (n % 100);
    }

    // the function
    public static void main(String[] argc) {
        int n = 6587;
        System.out.println(first2Numbers(n) + last2Numbers(n));
    }
}
