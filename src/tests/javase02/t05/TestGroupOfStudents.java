package tests.javase02.t05;

import javase02.t03.baseThing.setOfBiginner.AllMarksOfStudent;
import javase02.t05.StudentMarks;
import javase02.t05.Group;
import javase02.t05.Student;
import javase02.t05.Subjects;
import org.testng.annotations.Test;

import java.util.*;

public class TestGroupOfStudents{
    @Test
    public void Test(){

        Group<Integer> gr1=new Group<Integer>(Subjects.HISTORY);
        Group<Double> gr2= new Group<Double>(Subjects.PROGRAMMING);
        Group<Long> gr3= new Group<Long>(Subjects.RUSSIAN_LANGUAGE);

        gr1.setMarks("Misha", 4);
        gr1.setMarks("Julia", 5);
        gr1.setMarks("Seva", 3);
        gr1.setMarks("Pola", 5);
        gr1.setMarks("Sergey", 2);
        gr1.setMarks("Seva", 5);
        gr1.setMarks("Roma", 4);
        gr1.setMarks("Julia", 3);
        gr1.setMarks("Julia", 5);

        gr2.setMarks("Misha", 3.);
        gr2.setMarks("Misha", 3.);
        gr2.setMarks("Pola", 3.9);
        gr2.setMarks("Sergey", 4.5);
        gr2.setMarks("Pola", 5.);
        gr2.setMarks("Julia", 5.);
        gr2.setMarks("Julia", 3.1);


        gr3.setMarks("Pola", -2l);
        gr3.setMarks("Sergey", 5l);
        gr3.setMarks("Pola", 0l);
        gr3.setMarks("Julia", 5l);
        gr3.setMarks("Julia", 7l);


        AllMarksOfStudent q=new AllMarksOfStudent();
        q.out("Julia",gr1,gr2,gr3);
        q.out("Roma",gr1,gr2);
        q.out("Sergey",gr1,gr2,gr3);

    }
}
