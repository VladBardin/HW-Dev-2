
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    public Calculator calc;
    @BeforeEach
    public void beforeEach(){
       calc = new Calculator();
     }
    @Test
    public void testThatSumWorksCorrect1() {
        int actual = calc.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatSumWorksCorrect2() {
        int actual = calc.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatSumWorksCorrect0() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }
}
