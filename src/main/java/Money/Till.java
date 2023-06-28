package Money;

import jdk.jfr.internal.consumer.RecordingInput;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class Till {
//    public userCoins;
    //    private HashMap<String, Integer> tillCoins;
    private ArrayList<Integer> userCoins;
//    private enum Coin;

    public Till(){
//        this.tillCoins = new HashMap<>();
        this.userCoins = new ArrayList<>();
    }

    public void addCoin(int coin){
         this.userCoins.add(coin);
    }

    public int getCoins() {
        return this.userCoins.size();
    }
}
