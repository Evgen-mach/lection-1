public class Task3ThirdNum {

    // Find the third number
    public static int thirdNumber(int n) {
        // return the third number
        return (n / 100) % 10;
    }

    // the function
    public static void main(String[] argc) {
        int n = 89534;
        System.out.println(thirdNumber(n));
    }
}
