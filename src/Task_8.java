public class Task_8 {
    public static void main(String[] args) {
        int years = 0, thisYear = 2020, nextYear = thisYear + 100, previousYear = thisYear - 200;
        do {
            years += 79;
            if (years >= previousYear && years <= nextYear) {
                System.out.println(years);
            }
        } while (years <= 2020);
    }
}
