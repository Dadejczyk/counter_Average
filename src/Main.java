import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("provide ratings");
        String providedEvaluations = scanner.nextLine();
        String[] ratingsTable = providedEvaluations.split(" ");

        double average = RatingCalculator.calculatorAverage(ratingsTable);

        if (average > 1 && average <= 6)
        {
            System.out.println("Medium: " + average);
        } else {
            System.out.println("No valid ratings provided");
        }
    }
}
