package Exercises;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class KockaDobasok {
    static Random random;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        statistics();
    }

    private static void statistics() {
        int[] results = new int[11]; // Initialize results array

        int numOfRolls = getNumOfRolls(); // Choose a number of rolls

        getRandomRolls(results, numOfRolls); //get random roll results and add to the results array

        int maxFrequency = getFrequency(results); // get the max frequency of roll results

        printResults(results,maxFrequency); // print results

    }
    private static int getNumOfRolls() {
        System.out.println("Add the number of Rolls:");
        return Integer.parseInt(scanner.nextLine());
    }
    private static void getRandomRolls(int[] results, int numOfRolls) {
        random = new Random();
        for (int i = 0; i < numOfRolls; i++) {
            int firstRoll = random.nextInt(6) + 1;
            int secondRoll = random.nextInt(6) + 1;
            int sum = firstRoll + secondRoll;
            results[sum - 2]++;
        }
    }
    private static int getFrequency(int[] results) {
        int maxFrequency = 0;
        for (int frequency: results) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }
        return maxFrequency;
    }
    private static void printResults(int[] results, int maxFrequency) {
        for (int i = 0; i < results.length; i++) {
            int numOfStars = (int) Math.round((double) results[i] / maxFrequency * 40);
            System.out.printf("%2d: ", (i + 2));
            printStars(numOfStars);
            if (results[i] == 0) {
                System.out.println("You didn't spin this one.");
            } else {
                System.out.printf(" (%d db)\n", results[i]);
            }
        }
    }
    private static void printStars(int stars) {
        for (int i = 0; i < stars; i++) {
            System.out.print("*");
        }
    }

}
