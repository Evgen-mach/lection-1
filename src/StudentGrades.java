import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        int subjectsCount = getSubjectsCount();
        int[] grades = getGrades(subjectsCount);
        double average = calculateAverage(grades);
        printAverage(average);
    }

    public static int getSubjectsCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество предметов: ");
        int count = scanner.nextInt();
        return count;
    }

    public static int[] getGrades(int subjectsCount) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[subjectsCount];

        for (int i = 0; i < subjectsCount; i++) {
            System.out.print("Введите оценку за предмет " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();

            for (;grades[i] < 1 || grades[i] > 10;) {
                System.out.println("Ошибка! Введите оценку от 1 до 10.");
                System.out.print("Введите оценку для предмета " + (i + 1) + ": ");
                grades[i] = scanner.nextInt();
            }
        }
        return grades;
    }

    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static void printAverage(double average) {
        System.out.printf("Средняя оценка: %.2f\n", average);
    }
}