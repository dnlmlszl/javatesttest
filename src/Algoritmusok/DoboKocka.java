package Algoritmusok;

import java.util.Random;

public class DoboKocka {

    public static void main(String[] args) {
        int[] results = new int[11];

        // Dobások elvégzése
        randomNumbers(results);

        // Legtöbbször előforduló szám meghatározása
        int maxGyakorisag = getMaxGyakorisag(results);

        // Csillagok nyomtatása
        printResults(results, maxGyakorisag);
    }

    private static void randomNumbers(int[] results) {
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            int elsoDobas = random.nextInt(6) + 1;
            int masodikDobas = random.nextInt(6) + 1;
            int sum = elsoDobas + masodikDobas;
            results[sum - 2]++;
        }
    }

    private static int getMaxGyakorisag(int[] results) {
        int maxGyakorisag = 0;
        for (int gyakorisag : results) {
            if (gyakorisag > maxGyakorisag) {
                maxGyakorisag = gyakorisag;
            }
        }
        return maxGyakorisag;
    }

    private static void printResults(int[] results, int maxGyakorisag) {
        for (int i = 0; i < results.length; i++) {
            int stars = (int) Math.round((double) results[i] / maxGyakorisag * 40);
            System.out.print((i + 2) + ": ");
            printStars(stars);
            System.out.println(" (" + results[i] + " db)");
        }
    }

    private static void printStars(int stars) {
        for (int j = 0; j < stars; j++) {
            System.out.print("*");
        }
    }
}

