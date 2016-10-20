package javase02.t05;

import java.util.*;

public class Group<T extends Number> {

    Subjects subject;
    ArrayList<Student> students = new ArrayList<>(); // студенты в группе
    Map<String, T> marks = new HashMap<String, T>(); // оценки в группе

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
