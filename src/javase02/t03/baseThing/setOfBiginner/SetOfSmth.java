package javase02.t03.baseThing.setOfBiginner;

import javase02.t01.pen.Pen;
import javase02.t02.desk.things.line.Line;
import javase02.t02.desk.things.notebook.Notebook;
import javase02.t03.baseThing.BaseThing;

public class SetOfSmth {

    Notebook notebook=new Notebook();
    Pen pen= new Pen();
    Line line= new Line();

    BaseThing[] set = {notebook,pen,line};

    public void setOut(String[] args) {
        for (BaseThing var: set ){
            System.out.println(var.toString());
        }

    }


}
