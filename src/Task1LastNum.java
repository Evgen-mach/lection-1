public class Task1LastNum {

    // Find the last number
    public static int lastNumber(int n) {
        // return the last number
        return (n % 10);
    }

    // the function
    public static void main(String[] argc) {
        int n = 89349025;
        System.out.println(lastNumber(n));
    }
} 