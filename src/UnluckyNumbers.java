public class UnluckyNumbers {
    public static void main(String[] args) {
        int count4 = 0;
        int count13 = 0;
        int countBoth = 0;

        for (int i = 1; i <= 100000; i++) {
            String number = String.format("%05d", i);
            if (number.contains("4")) {
                count4++;
            }
            if (number.contains("13")) {
                count13++;
            }
            if (number.contains("4") && number.contains("13")) {
                countBoth++;
            }
        }

        int totalExcluded = count4 + count13 - countBoth;
        System.out.println("Total number excluded: " + totalExcluded);
    }
}
