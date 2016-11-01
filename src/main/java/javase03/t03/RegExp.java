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
            Pattern p=Pattern.compile("[А-Я].{2,}[\\. |\\!{,3}|\\?{,3}|\\?\\! |\\!\\? ]");
            Matcher m = p.matcher(sc.nextLine());

            ArrayList<Integer> arrayList=new ArrayList<>();


            if (m.find()) {
                str.append(m.group());

                if (str.indexOf("(Рис.")-str.indexOf(")")<2&&(str.indexOf("(Рис.")>=0)&&(str.indexOf(")")>=0)){
                    System.out.println(str); // пишем строки с (Рис. **)
                    System.out.println(str.charAt(str.indexOf("(Рис. ")+6));
                    System.out.println();
                }

//                while ((str.indexOf("(Рис.")>=0)&&(str.indexOf(")")>=0)&&(Math.abs(str.indexOf(")"))-Math.abs(str.indexOf("(Рис.")))>2){
//                    str.delete(0,str.indexOf(")")+1);// убрали лишние скобки
//                   // System.out.println(str);
//
//                }


//                while((Math.abs(str.indexOf(")"))-Math.abs(str.indexOf("(Рис.")))<2){
//                    System.out.println(str);
////                    arrayList.add(
////                            (Integer.parseInt(
////                                    str.substring(
////                                            str.indexOf("(Рис."),str.indexOf(")")))));
//                    System.out.println((str.indexOf("(Рис.")));
//                    System.out.println((str.indexOf(")")));
//                    str.delete(0,str.indexOf(")"));
//                }


            }

            for (Integer i: arrayList
                 ) {
                System.out.println(i);
            }
           str.delete(0, str.length());
        }

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
