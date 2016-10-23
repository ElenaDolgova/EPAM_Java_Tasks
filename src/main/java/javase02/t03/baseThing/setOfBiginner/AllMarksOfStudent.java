package javase02.t03.baseThing.setOfBiginner;


import javase02.t05.Group;

import java.util.*;

public  class AllMarksOfStudent<T extends Number> {
    public List<T> marks=new ArrayList<T>();
    public void out(String name,Group... groups){
        System.out.println("Name: "+name);
        for (Group i:
             groups) {
            marks.addAll(i.findAllMarks(name));
        }

        Collections.sort(marks,new Comparator<T>() {
            public int compare(T o1, T o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        System.out.println(marks.toString());
        marks.clear();
    }
}
