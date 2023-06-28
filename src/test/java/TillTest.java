import Money.Coin;
import Money.Till;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TillTest {
    Till till;
    ArrayList<Integer> coins;
    int coin;

    @Before
    public void before(){

        till = new Till();
        coin = 10;
    }

    @Test
    public void canAddCoin(){
        till.addCoin(coin);
        till.addCoin(coin);
        till.addCoin(coin);
        assertEquals(3, till.getCoins());
    }

}
