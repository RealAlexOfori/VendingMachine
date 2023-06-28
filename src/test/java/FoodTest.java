import FoodItems.Food;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoodTest {

    Food food;

    @Before
    public void before(){
        food = new Food("Cola", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Cola", food.getName());
    }

    @Test
    public void hasPrice(){
        assertEquals(100, food.getPrice());
    }



}
