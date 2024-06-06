public class NextDay {

    public static void main(String[] args) {
        int day = 28; // День
        int month = 2; // Месяц
        int year = 2024; // Год

        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        nextDay = newDay(nextDay, nextMonth, nextYear);

        if (nextDay == 1) {
            nextMonth = newMonth(nextMonth);
            if (nextMonth == 1) {
                nextYear++;
            }
        }

        System.out.println("Следующий день: " + nextDay + "." + nextMonth + "." + nextYear);
    }

    public static int newDay(int day, int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

// Проверка на високосный год
        if (isLeapYear(year)) {
            daysInMonth[2] = 29;
        }

        day++;

// Переход на следующий месяц
        if (day > daysInMonth[month]) {
            day = 1;
        }

        return day;
    }

    public static int newMonth(int month) {
        month++;
        if (month > 12) {
            month = 1;
        }
        return month;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}