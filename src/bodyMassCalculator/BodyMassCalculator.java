package bodyMassCalculator;

import java.text.MessageFormat;
import java.util.Scanner;

public class BodyMassCalculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter height in meters: ");
        double height = scanner.nextDouble();

        double calculatedBmi = calculateBmi(weight, height);
        BmiClassification classifiedBmi = classifyBMI(calculatedBmi);

        System.out.println(MessageFormat.format("Your bmi is {0}, so you are {1}", calculatedBmi, classifiedBmi.toString().toLowerCase()));
    }

    /**
     * Method to classify the Body Mass Index
     * @param bmi calculated by calculatedBmi
     * @return Enum BmiClassification
     */
    public static BmiClassification classifyBMI(double bmi) {

        if (bmi < 18.5) {
            return BmiClassification.UNDERWEIGHT;
        }
        else if (bmi < 25) {
            return BmiClassification.NORMAL;
        }
        else if (bmi < 30) {
            return BmiClassification.OVERWEIGHT;
        }
        else {
            return BmiClassification.OBESE;
        }
    }

    /**
     * Method to calculate the Body Mass Index.0
     * Formula: weight (kg) / (height (meters) * height (meters))
     * @param height - height in centimeters
     * @param weight - weight in kilograms
     * @return Body Mass Index
     */
    public static double calculateBmi(double weight, double height) {
        return weight / (height * height);
    }
}
