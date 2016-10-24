package javase03.t03;


import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args){
        Pattern p = Pattern.compile("\\(Рис\\. \\d\\)");
        String name = "D:\\Work\\src\\main\\resources\\Java.SE.03.Information handling_task_attachment.html";
        Scanner sc = null;
        ArrayList<Integer> arrayList=new ArrayList<>();
        try {
            sc = new Scanner(Paths.get(name), "CP1251");
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()){
            StringBuilder testString= new StringBuilder(sc.nextLine());
            Matcher m = p.matcher(testString);

            System.out.println(testString);
            Pattern p1=Pattern.compile("");
                while (m.find()){
                    StringBuilder str=new StringBuilder();

                    arrayList.add(Integer.parseInt(m.group().replaceAll("\\(Рис\\. |\\)","")));
                    testString=testString.delete(0,m.end());
                    m=p.matcher(testString);
            }
        }
        for (Integer i:
                arrayList) {
            System.out.println(i);
        }
    }
}
