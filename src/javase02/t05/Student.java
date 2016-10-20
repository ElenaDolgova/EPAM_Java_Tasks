package javase02.t05;

import java.util.Comparator;

public class Student {


    String name;
    Subjects subjects;


    public Student(){}

    public Student(String name) {

        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        return getName() != null ? getName().equals(student.getName()) : student.getName() == null;

    }

    @Override
    public int hashCode() {
        return getName() != null ? getName().hashCode() : 0;
    }

}
