import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RatingCalculatorTest {

    @Test
    public void testCalculateAverage() {

        String[] ratings = {"5", "3", "4", "2"};
        double result = RatingCalculator.calculatorAverage(ratings);
        assertEquals(3.5, result, 0.01);
    }

    @Test
    public void wrongTestCalculatorAvarage() {
        String[] ratings = {"10" , "2", "12", "2"};
        double result = RatingCalculator.calculatorAverage(ratings);
        assertEquals(2.0, result, 0.01);
    }

    @Test
    public void minusNumbersTestCalculatorAvarage() {
        String[] ratings = {"-1", "-10", "3" ,"6", "8"};
        double result = RatingCalculator.calculatorAverage(ratings);
        assertEquals(4.5, result, 0.01);
    }


}
