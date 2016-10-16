package javase02.t03.baseThing.setOfBiginner;


import javase02.t01.pen.Pen;
import javase02.t02.desk.things.line.Line;
import javase02.t02.desk.things.notebook.Notebook;
import javase02.t03.baseThing.BaseThing;

import java.util.*;

public class Main {
    public  static void main(String[] args){

        System.out.println();
        Comparator<BaseThing> comparator= new BaseThing();
        Set<BaseThing> set=new TreeSet<BaseThing>(comparator);
        set.add(new Notebook(30, 50,"red"));
        set.add(new Pen(30,"red",20));
        set.add(new Pen(10,"blue",100));
        set.add(new Pen(10,"blue",4));
        set.add(new Line(30, 5,"indigo"));
        set.add(new Line(30, 300,"indigo"));
        for(BaseThing var: set){
            System.out.println(var.toString());
        }



    }

    public static void print(ArrayList<BaseThing> args){
        for (BaseThing i: args ) {
            System.out.println(i.toString()+" ");

        }
    }
}
