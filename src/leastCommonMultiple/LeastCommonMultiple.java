package leastCommonMultiple;

import java.text.MessageFormat;
import java.util.Scanner;
public class LeastCommonMultiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two positive integers to find the least common multiple.");
        System.out.println("Enter the first integer: ");
        int firstInt = scanner.nextInt();

        System.out.println("Enter the secont integer: ");
        int secondInt = scanner.nextInt();

        int leastCommonMultiple = calculateLeastCommonMultiple(firstInt, secondInt);

        System.out.println(MessageFormat.format("The least common multiple of {0} and {1} is: {2}",firstInt, secondInt, leastCommonMultiple));
    }

    /**
     * Method to calculater the least common multiple of two integers
     * @param firstInt integer value entered in the console
     * @param secondInt integer value entered in the console
     * @return least common multiple of two integers
     */
    public static int calculateLeastCommonMultiple(int firstInt, int secondInt) {

        int z1temp = firstInt;
        int z2temp = secondInt;

        while (z1temp != z2temp) {
            if (z1temp < z2temp) {
                z1temp += firstInt;
            } else {
                z2temp+= secondInt;
            }
        }
        return z1temp;
    }
}

