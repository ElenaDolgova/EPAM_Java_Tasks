package javase03.t01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class CrazyLogger {
    StringBuilder stringBuilder= new StringBuilder();


    public void addMessage(){
        System.out.print("Input message: ");
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        add(str);
        s.close();

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
        stringBuilder.append(changeDate()+":"+changeTime()+"-"+message+";");
    }
    private String changeDate(){
        return DateTimeFormatter.ofPattern("dd-MM-YYYY").format(LocalDateTime.now());
    }

    private String changeTime(){
        return DateTimeFormatter.ofPattern("hh-mm").format(LocalDateTime.now());
    }
}
