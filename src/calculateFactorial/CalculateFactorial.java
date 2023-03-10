package calculateFactorial;

import java.text.MessageFormat;
import java.util.Scanner;

public class CalculateFactorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number from which you want to calculate the factorial.");
        int i = scanner.nextInt();

        System.out.println(MessageFormat.format("The factorial of {0} is: {1}", i,  fact(i)));

    }

    /**
     * Method to calculate the factorial of any given positive integer
     * @param n starting value
     * @ the calculated factorial of n with an recursive solution
     */
    public static long fact(long n) {
        if (n <= 1)
            return 1;
        else
            return n * fact(n - 1);
    }
}
