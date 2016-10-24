package javase03.t03;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
    public static void main(String[] args){
        String name = "D:\\Work\\src\\main\\resources\\Java.SE.03.Information handling_task_attachment.html";
        Scanner sc = null;
        StringBuilder str = new StringBuilder();

        try {
            sc = new Scanner(Paths.get(name), "CP1251");
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (sc.hasNextLine()) {
            //  StringBuilder testString= new StringBuilder(sc.nextLine());
            // Matcher m = p.matcher(testString);

            Pattern p;
            p = Pattern.compile("[А-Я].{2,}[\\. |\\!{,3} |\\?{,3} |\\?\\! |\\!\\? ]");
            //Pattern p = Pattern.compile(".*[А-Яа-я]*.");
            Matcher m = p.matcher(sc.nextLine());

            if (m.find()) {
                str.append(m.group());
                System.out.println(str);

                System.out.println("11111111111111111111");
            }
          //  return  str;
           // if(!str.equals(""))

           str.delete(0, str.length());
        }
     //  return new StringBuilder("");
    }
    public static void main1(String[] args) {
        Pattern p = Pattern.compile("\\(Рис\\.\\s \\d\\)");
       // StringBuilder str= readingFile();
        StringBuilder line=new StringBuilder();
        ArrayList<Integer> arrayList = new ArrayList<>();
    //    Matcher m= p.matcher(str);
//                while (m.find()){
//                    StringBuilder str=new StringBuilder();
//
//                    arrayList.add(Integer.parseInt(m.group().replaceAll("\\(Рис\\.\\s |\\)","")));
//                    testString=testString.delete(0,m.end());
//                    m=p.matcher(testString);
//            }
//        }
//        for (Integer i:
//                arrayList) {
//            System.out.println(i);
//        }
    }
}
