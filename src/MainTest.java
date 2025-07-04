import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    // 1.
    @Test
    public void sumRangetest() {
        Assertions.assertEquals(1085, Main.sumRange(20, 50));
    }

    // 2.
    @Test
    public void addTest() {
        Assertions.assertEquals(17, Main.add(9, 8));
        Assertions.assertEquals("ПриветБобер", Main.add("Привет", "Бобер"));
    }

    // 3.
    @Test
    public void findMaxTest() {
        Assertions.assertEquals(90, Main.findMax(new int[]{67, 77, 90, 8, 0, 12}));
    }

    // 4.
    @Test
    public void factorialTest() {
        Assertions.assertEquals(362880, Main.factorial(9));
    }

    // 5.
    @Test
    public void calculateAreaCircleTest() {
        Assertions.assertEquals(Math.PI * Math.pow(7, 2), Main.calculateArea(7));
    }

    @Test
    public void calculateAreaRectangleTest() {
        Assertions.assertEquals(49, Main.calculateArea(7, 7));
    }

    // 6.
    @Test
    public void calculateAverageTest() {
        Assertions.assertEquals((double) (8 + 9 + 3) / 3, Main.calculateAverage(8, 9, 3));
    }

    // 7.
    @Test
    public void calculateHypotenuseTest() {
        Assertions.assertEquals(Math.sqrt(Math.pow(2, 2) + Math.pow(5, 2)), Main.calculateHypotenuse(2, 5));
    }
}