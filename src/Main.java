import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double totalValuations = 0;

        int numberValuations = 0;


        System.out.println("provide ratings");
        String providedEvaluations = scanner.nextLine();
        String[] ratingsTable = providedEvaluations.split(" ");

        for(String evaluation1 : ratingsTable)
        {
            try
            {
                double evaluation = Double.parseDouble(evaluation1);
                if (evaluation >= 1 && evaluation <= 6)
                {
                    totalValuations += evaluation;
                    numberValuations++;
                }
                else
                {

                    System.out.println("erroneous data:");
                }
            }
            catch (NumberFormatException e)
            {
                System.out.println();
            }
        }
        if (numberValuations > 0)
        {
            double average = totalValuations / numberValuations;
            System.out.println("Medium: " + average);
        }
    }
}
