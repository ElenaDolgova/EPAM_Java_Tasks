package tests.javase02.t05;

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

        gr1.setMarks("Misha", 4);
        gr1.setMarks("Julia", 5);
        gr1.setMarks("Seva", 3);
        gr1.setMarks("Pola", 5);
        gr1.setMarks("Roma", 2);


        System.out.println(gr1.toString());

        gr2.setMarks("Misha", 3.);
        gr2.setMarks("Pola", 3.9);
        gr2.setMarks("Sergey", 4.5);
        gr2.setMarks("Pola", 5.);

       // Comparator<Student> comparator= new Student();
      //  Set<Student> set=new TreeSet<Student>(comparator);

        // Хотим Misha
        Student Misha=new Student("Misha");
        Number[] marks =new Number[2];
        System.out.println("Misha");

        marks[0]=((double)gr1.findMark(Misha));
        marks[1]=((double)gr2.findMark(Misha));

        for (Number i: marks  ) {
            System.out.print(i+" ");
        }
        Arrays.sort(marks);

        System.out.println();

        for (Number i: marks  ) {
            System.out.print(i+" ");
        }


    }
}
