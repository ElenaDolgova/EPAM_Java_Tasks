package javase02.t03.baseThing.setOfBiginner;


import javase02.t01.pen.Pen;
import javase02.t02.desk.things.line.Line;
import javase02.t02.desk.things.notebook.Notebook;
import javase02.t03.baseThing.BaseThing;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public  static void main(String[] args){


        Comparator<BaseThing> comparator= new byPriceAndByName();
        Set<BaseThing> set=new TreeSet<BaseThing>(comparator);
        set.add(new Notebook(30, 50,"red"));
        set.add(new Pen(30,"red",20));
        set.add(new Pen(10,"blue",100));
        set.add(new Pen(10,"blue",4));
        set.add(new Line(30, 5,"indigo"));
        set.add(new Line(30, 300,"indigo"));
        print(set);


        Comparator<BaseThing> comparator1= new byName();
        set= new TreeSet<BaseThing>(comparator1);
        System.out.println();
        set.add(new Notebook(30, 50,"red"));
        set.add(new Pen(30,"red",20));
        set.add(new Pen(10,"blue",100));
        set.add(new Pen(10,"blue",4));
        set.add(new Line(30, 5,"indigo"));
        set.add(new Line(30, 300,"indigo"));
        print(set);

        Comparator<BaseThing> comparator2= new byPrice();
        set= new TreeSet<BaseThing>(comparator2);
        System.out.println();
        set.add(new Notebook(30, 50,"red"));
        set.add(new Pen(30,"red",20));
        set.add(new Pen(10,"blue",100));
        set.add(new Pen(10,"blue",4));
        set.add(new Line(30, 5,"indigo"));
        set.add(new Line(30, 300,"indigo"));
        print(set);


    }

    public static void print(Set<BaseThing> args){
        for (BaseThing i: args ) {
            System.out.println(i.toString()+" ");

        }
    }
}
