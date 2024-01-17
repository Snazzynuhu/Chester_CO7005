package BMICalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BMICalcTest {
    @Test
    void testCalculateBMI() {
         assertEquals(20.76, BMICalc.calculateBMI(60.0f, 1.7f), 0.01);

        assertEquals(27.54, BMICalc.calculateBMI(75.0f, 1.65f), 0.01);
    }

}
