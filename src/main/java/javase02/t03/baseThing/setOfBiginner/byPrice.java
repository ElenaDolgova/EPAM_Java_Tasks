package javase02.t03.baseThing.setOfBiginner;


import javase02.t03.baseThing.BaseThing;

import java.util.Comparator;

public class byPrice implements Comparator<BaseThing> {

        public int compare(BaseThing o1, BaseThing o2) {

            Integer price1 = o1.getPrice();
            Integer price2 = o2.getPrice();
            return price1.getClass().getName().compareTo(price2.getClass().getName());
//
//            if (price1 < price2) {
//                return -1;
//            } else if (price1 > price2) {
//                return 1;
//            } else {
//                return 0;
//
//            }

    }
}
