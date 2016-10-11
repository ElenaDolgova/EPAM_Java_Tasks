package javase02.t02.desk;

import javase02.t01.pen.Pen;

import javase02.t02.desk.things.line.Line;
import javase02.t02.desk.things.notebook.Notebook;
public class Desk {
    Pen pen;
    Notebook notebook;
    Line line;
//наличие этого предмета на столе
    public void CheckTheTable(){
        if (notebook.check&pen.check&line.check) {
            System.out.println("There is pen, notebook and line");

        }
        if(!(notebook.check)&!(pen.check)&!(line.check)){
            System.out.println("There is no pen, notebook and line");
        }
        if (!notebook.check&pen.check&line.check){
            System.out.println("There is no notebook");
        }
        if (notebook.check&!pen.check&line.check){
            System.out.println("There is no pen");
        }
        if (notebook.check&pen.check&!line.check){
            System.out.println("There is no line");
        }
        if (!notebook.check&!pen.check&line.check){
            System.out.println("There is no pen and notebook");
        }

        if (!notebook.check&pen.check&!line.check){
            System.out.println("There is no line and notebook");
        }

        if (notebook.check&!pen.check&!line.check){
            System.out.println("There is no pen and line");
        }
    }
    public int Price(){


        if (!notebook.check&pen.check){
            return pen.getPrice();
        }
        if (notebook.check&!pen.check){
            return pen.getPrice();
        }

        if(!(notebook.check)&!(pen.check)&!(line.check)){
            return 0;
        }
        if (!notebook.check&pen.check&line.check){
            return pen.getPrice()+line.getPrice();
        }
        if (notebook.check&!pen.check&line.check){
            return notebook.getPrice()+line.getPrice();
        }
        if (notebook.check&pen.check&!line.check){
            return pen.getPrice()+notebook.getPrice();
        }
        if (!notebook.check&!pen.check&line.check){
            return line.getPrice();
        }

        if (!notebook.check&pen.check&!line.check){
            return pen.getPrice();
        }

        if (notebook.check&!pen.check&!line.check){
            return notebook.getPrice();
        }
        return pen.getPrice()+notebook.getPrice()+line.getPrice();


    }
}
