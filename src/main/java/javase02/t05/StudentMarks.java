package javase02.t05;

import java.util.ArrayList;
import java.util.List;

public class StudentMarks<T extends Number> extends Student {
   public List<T> mark=new ArrayList<T>();

    public StudentMarks(String name, T mark, Subjects subjects){
        super(name);
        this.mark.add(mark);
    }


    @Override
    public String toString() {
        return "StudentMarks{"+"name "+name +
                " mark=" + mark.toString() +
                '}';
    }
}
