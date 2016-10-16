package javase02.t03.baseThing.setOfBiginner;

import javase02.t03.baseThing.BaseThing;

import java.util.Comparator;

public class byPrice implements Comparator<BaseThing> {

    @Override
    public int compare(BaseThing o1, BaseThing o2) {

        int price1 = o1.getPrice();
        int price2 = o2.getPrice();

       if (price1 < price2) {
            return -1;
        } else if (price1 > price2) {
            return 1;
        } else {
            return 0;

        }

    }
}
