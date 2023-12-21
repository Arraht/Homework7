import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Дата первой пятницы: ");
        int numberMonth = 0, numberFriday = scanner.nextInt();
        if (numberFriday > 7) {
            System.out.println("Что-то неверно!");
        } else {
            while (numberMonth < 31) {
                numberMonth++;
                if (numberMonth == numberFriday) {
                    System.out.println("Сегодня пятница, " + numberMonth + "-е число. Необходимо подготовить отчет");
                    numberFriday += 7;
                }
            }
        }
    }
}



