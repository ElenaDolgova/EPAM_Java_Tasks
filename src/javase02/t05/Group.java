package javase02.t05;

import java.util.*;

public class Group<T extends Number> {

    public  Subjects subject;
    public ArrayList<StudentMarks<T>> studentMarkses=new ArrayList<>();

    public Group(Subjects subject) {
        this.subject = subject;
    }

    public void setMarks(String name, T mark) {
        boolean q = true;
        for (StudentMarks i : studentMarkses) {
            if (i.name == name) {
                i.mark.add(mark);
                q = true;
                break;
            } else {
                q = false;
            }
        }
        if(studentMarkses.size()==0){
            studentMarkses.add(new StudentMarks<T>(name,mark,subject));
        }
        if(!q){
            studentMarkses.add(new StudentMarks<T>(name,mark,subject));
        }
    }

    public List<T> findAllMarks(String name){
        for (StudentMarks i:
             studentMarkses) {
            if(i.name.equals(name)){
                return i.mark;
            }
        }
        return new ArrayList<T>();
    }

    public String stringOfStudentMarkses(){
        String str="";
        for (StudentMarks i:studentMarkses ) {
            str=str+i.toString();
        }
        return  str;
    }
    @Override
    public String toString() {
        return "Group{" +
                "subject=" + subject +
                ", studentMarkses=" + stringOfStudentMarkses()+'}';

    }
}
