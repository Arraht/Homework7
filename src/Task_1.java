public class Task_1 {
    public static void main(String[] args) {
        int sum = 0, deposit = 0, salary = 15_000, month = 0;
        while (sum < 2_459_000) {
            deposit += (deposit / 100) + salary;
            sum = deposit;
            month++;
            System.out.println("\tМесяц " + month + " сумма накоплений равна " + sum + " рублей");
        }
    }
}