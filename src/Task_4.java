public class Task_4 {
    public static void main(String[] args) {
        int month = 0;
        int deposit = 15_000;
        while (deposit < 12_000_000) {
            deposit += ((deposit * 7) / 100);
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей");
        }
        System.out.println("Для достижения цели потребуется " + month + " месяцев");
    }
}
