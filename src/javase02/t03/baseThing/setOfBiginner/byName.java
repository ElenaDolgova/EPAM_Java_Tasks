package javase02.t03.baseThing.setOfBiginner;


import javase02.t03.baseThing.BaseThing;

import java.util.Comparator;

public class byName  implements Comparator<BaseThing> {
    @Override
    public int compare(BaseThing o1, BaseThing o2) {
        return o1.getClass().getName().compareTo(o2.getClass().getName());

    }
}
