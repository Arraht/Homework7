public class Task_3 {
    public static void main(String[] args) {
        int population = 12_000_000;
        float birthrate = 17 * 0.001f, deathRate = 8 * 0.001f;
        int populationIncrease = (int)(population * birthrate), populationDecline = (int)(population *
                deathRate);
        for (int i = 1; i <= 10 ; i++) {
            population += (populationIncrease - populationDecline);
            System.out.println("Год " + i + ", численность населения составляет " + population + " человек");
        }
    }
}
