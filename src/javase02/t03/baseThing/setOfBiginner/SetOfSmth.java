package javase02.t03.baseThing.setOfBiginner;

import javase02.t01.pen.Pen;
import javase02.t02.desk.things.line.Line;
import javase02.t02.desk.things.notebook.Notebook;
import javase02.t03.baseThing.BaseThing;

import java.util.ArrayList;

public class SetOfSmth {

    ArrayList<BaseThing> set = new ArrayList<>();

    public void addThings() {
        set.add(new Notebook());
        set.add(new Pen());
        set.add(new Line());
    }

    public void addThings(String color, int...args) {
        System.out.println("Input: color of pen(0), price of pen(1), price of notebook(2), price of line(3), measure of line(4), number of titles in notebook(5), length of pen(6).");
        set.add(new Notebook(args[5],args[2]));
        set.add(new Pen(args[6],color, args[1]));
        set.add(new Line(args[4],args[3]));
    }


    public void setOut() {

        for (BaseThing var : set) {
            System.out.println(var.toString());
        }

    }

    public  static void main(String[] args){
        SetOfSmth setOfSmth=new SetOfSmth();

        setOfSmth.addThings();



        setOfSmth.setOut();

    }


}
