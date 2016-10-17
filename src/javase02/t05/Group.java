package javase02.t05;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
@AllArgsConstructor
public class Group<T extends Number> {

    Subjects subject;
    ArrayList<Student> students = new ArrayList<>(); // студенты в группе
    Map<String, T> marks = new HashMap<String, T>(); // оценуи в группе

   // T i;
    public Group(Subjects subject) {
        this.subject = subject;
    }

    public void setSubject(Subjects subject) {
        this.subject = subject;
    }

    public void setMarks(String name, T mark) {
        marks.put(name, mark);
        students.add(new Student(name));

    }

//    public  T numberOfStudent(){
//
//    }
    public T findMark(Student student){
        for (Student var: students ) {
            if(student.name.equals(var.name)){
                return marks.get(student.name);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Group{" +
                "subject=" + subject +
                ", students=" + students +
                ", marks=" + marks +
                '}';
    }
}
