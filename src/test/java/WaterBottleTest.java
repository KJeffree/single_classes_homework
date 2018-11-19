import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void canDrink() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume(), 0.01);
    }

    @Test
    public void canEmpty() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume(), 0.01);
    }

    @Test
    public void cannotDrinkIfEmpty() {
        waterBottle.empty();
        assertEquals(false, waterBottle.drink());
        assertEquals(0, waterBottle.getVolume(), 0.01);
    }

    @Test
    public void canFill() {
        waterBottle.drink();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume(), 0.01);
    }

}
