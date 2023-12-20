public class Task_6 {
    public static void main(String[] args) {
        int years = 9, month = years * 12, deposit = 15_000;
        for (int i = 1; i <= month; i++) {
            deposit += ((deposit * 7)/100);
            if (i % 6 != 0){
                continue;
            }
            System.out.println("Месяц " + i + " сумма накоплений равна " + deposit);
        }
    }
}
