public class Task4Distance {

    // Find the root
    public static int distance(
            int x1,
            int y1,
            int x2,
            int y2) {
        // return the distance between points
        return (int) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    // the function
    public static void main(String[] argc) {
        int x1 = -1;
        int y1 = 4;
        int x2 = 3;
        int y2 = 1;
        System.out.println(distance(x1, y1, x2, y2));
    }
}
