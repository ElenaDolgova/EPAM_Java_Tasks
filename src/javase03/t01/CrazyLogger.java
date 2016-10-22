package javase03.t01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;


public class CrazyLogger {
    StringBuilder stringBuilder= new StringBuilder();


    public void addMessage(){
        System.out.print("Input message: ");
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        add(str);

    }
    public void find(){
        System.out.println("Input date and time in format dd-mm-yyyy:hh-mm");
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        String finding="";
        int q=0;

        while(stringBuilder.indexOf(str)!=-1){
            for(int i=0;stringBuilder.charAt(stringBuilder.indexOf(str)+17+i)!=';';i++){
                finding=finding+stringBuilder.charAt(stringBuilder.indexOf(str)+17+i);
                q=stringBuilder.indexOf(str)+17+i;
            }
            stringBuilder.delete(0,q);
            System.out.println(finding);
            finding=finding.replaceAll("\\w|\\d", "");
        }
        System.out.println();
        System.out.println("It's not found.");
    }

    private void add (String message){
        stringBuilder.append(changeDate(LocalDate.now())+":"+changeTime(LocalTime.now())+"-"+message+";");
    }
    private String changeDate(LocalDate localDate){
        String date=localDate.toString();
        return date.substring(8,10)+"-"+date.substring(5,7)+"-"+date.substring(0,4);
    }

    private String changeTime(LocalTime localTime){
        return localTime.toString().substring(0,2)+"-"+localTime.toString().substring(3,5);
    }
}
