package javase02.t03.baseThing.setOfBiginner;

import javase02.t01.pen.Pen;
import javase02.t02.desk.things.line.Line;
import javase02.t02.desk.things.notebook.Notebook;
import javase02.t03.baseThing.BaseThing;

import java.util.ArrayList;

public class SetOfSmth {

    ArrayList<BaseThing> set = new ArrayList<BaseThing>();

    public void addThings() {
        set.add(new Notebook());
        set.add(new Pen());
        set.add(new Line());
    }

    public void setOut() {

        for (BaseThing var : set) {
            System.out.println(var.toString());
        }

    }



}