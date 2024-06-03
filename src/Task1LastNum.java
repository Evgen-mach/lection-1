import java.util.Scanner;

public class Task1LastNum {

    // Find the last number
    public static int lastNumber(int n) {
        // return the last number
        if (n >= 0) {
            return n % 10;
        } else {
            return n * -1 % 10;
        }
    }

    // the function
    public static void main(String[] argc) {
        //int n = 89349025;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int numberFromConsole = scanner.nextInt();

        System.out.println("Number from console is " + numberFromConsole);
        System.out.println(lastNumber(numberFromConsole));
    }
} 