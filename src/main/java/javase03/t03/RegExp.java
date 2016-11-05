package javase03.t03;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegExp {
    public static void findSentence(String  name){
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

            if (m.find()) {
                str.append(m.group());

                if (str.indexOf("(Рис.")!=-1){
                    System.out.println(str+"\n");

                }
                str.delete(0,str.length());
            }
        }

        sc.close();
    }
    public static void checkNumber(String name) {
        Scanner sc = null;
        StringBuilder str = new StringBuilder();
        try {
            sc = new Scanner(Paths.get(name), "CP1251");
        } catch (IOException e) {
            e.printStackTrace();
        }

         ArrayList<Integer> arrayList = new ArrayList<>();
        while (sc.hasNextLine()) {
            Pattern p = Pattern.compile("\\(Рис\\. \\d+");
            Matcher m = p.matcher(sc.nextLine());

            while (m.find()) {
                str.append(m.group());
                arrayList.add(Integer.parseInt(str.substring(6,str.length())));
                str = str.delete(0, m.end());
                m = p.matcher(str);
        }
    }
       for (int i=0; i<arrayList.size();i++){
           if (arrayList.get(i)>arrayList.get(i+1) ){
               System.out.println("Not consistently");
               break;
           }
       }

    sc.close();
  }
}

