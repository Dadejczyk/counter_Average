public class RatingCalculator {

    public static double calculatorAverage(String[] ratings) {
        double totalValuations = 0;
        int numberValuations = 0;

        for (String rating : ratings) {
            try {
                double evaluation = Double.parseDouble(rating);
                if (evaluation >= 1 && evaluation <= 6) {
                    totalValuations += evaluation;
                    numberValuations++;
                } else {
                    System.out.println(evaluation + " Skipped ");
                }
            } catch (NumberFormatException e){
                System.out.println("ERROR");
            }
        }
        return numberValuations > 0 ? totalValuations / numberValuations : 0;
    }
}









// for(String evaluation1 : ratingsTable)
//         {
//         try
//         {
//         double evaluation = Double.parseDouble(evaluation1);
//         if (evaluation >= 1 && evaluation <= 6)
//         {
//         totalValuations += evaluation;
//         numberValuations++;
//         }
//         else
//         {
//
//         System.out.println("erroneous data:");
//         }
//         }
//         catch (NumberFormatException e)
//         {
//         System.out.println();
//         }
//         }