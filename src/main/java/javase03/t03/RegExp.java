package javase03.t03;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {
//    String name = "Java.SE.03.Information handling_task_attachment.html";
//    public RegExp() {
//        Scanner sc = null;
//        //String s=;
//        Pattern p=Pattern.compile("\\(Рис\.\d\)\\");
//        try {
//            sc = new Scanner(new File(name));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        while (sc.hasNextLine()) {
//
//        }
//    }
    public static void main(String[] args){
Pattern p = Pattern.compile("\\(Рис\\.\\d\\)");
        String name = "D:\\Work\\src\\main\\java\\javase03\\t03\\Java.SE.03.Information handling_task_attachment.html";
        Scanner sc = null;
        try {
            sc = new Scanner(new File(name));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()){
            StringBuilder testString= new StringBuilder(sc.next());
            Matcher m = p.matcher(testString);

            StringBuilder str= new StringBuilder(testString);
            ArrayList<Integer> arrayList=new ArrayList<>();
            int q=0;
            while (m.find()){
                q++;
                arrayList.add(Integer.parseInt(m.group().replaceAll("\\(Рис\\.|\\)","")));
                testString=testString.delete(0,m.end());
                m=p.matcher(testString);
                if((arrayList.size()>1)&&(arrayList.get(q-2)>arrayList.get(q-1))){
                    System.out.println((q-2)+" "+(q-1) );
                    System.out.println(arrayList.get(q-2)+" "+arrayList.get(q-1));
                    System.out.println("ok");
                }
            }
            for (Integer i:
                    arrayList) {
                System.out.println(i);
            }
        }
        //StringBuilder testString= new StringBuilder ("Bя люблю рисовать как (Рис.1) и поэтому (Рис.2) (Рис.3) я разговариваю (Рис.2) вот так вот.");



       // System.out.println(m.find());
        //System.out.println(m.group()+"  "+m.start()+"  "+m.end());
        //System.out.println(m.group().replaceAll("\\(Рис\\.|\\)",""));
      //  System.out.println(m.matches());
    }
}
