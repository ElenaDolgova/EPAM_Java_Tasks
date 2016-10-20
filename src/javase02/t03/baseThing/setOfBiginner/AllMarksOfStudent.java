package javase02.t03.baseThing.setOfBiginner;

import javase02.t05.Group;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class AllMarksOfStudent<T extends Number> {
    public List<T> marks=new ArrayList<>();
    public void out(String name,Group... groups){
        System.out.println("Name: "+name);
        for (Group i:
             groups) {
            marks.addAll(i.findAllMarks(name));
        }
        System.out.println(marks.toString());
    }
}
