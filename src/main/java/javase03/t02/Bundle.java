package javase03.t02;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Bundle {

    private static void question(ResourceBundle myResources){
        System.out.println("Choose question from 1 to 3");
        for(int i=1;i<4;i++){// как улучшить?
            System.out.println(myResources.getString("q"+i));
        }
        answer(myResources);

    }
    private  static void answer(ResourceBundle myResources){
        Scanner s= new Scanner(System.in);
        int i=s.nextInt();
        System.out.println(myResources.getString("a"+i));
    }

    public static void chooseLanguage(){
        final String ru="ru";
        final String en="ru";
        System.out.println("Input number of language 1-ru, 2-en");
        Scanner s= new Scanner(System.in);
        int i=s.nextInt();
        switch (i){
            case 1:{
                ResourceBundle myResources = ResourceBundle.getBundle("My",
                        Locale.forLanguageTag(ru));
                question(myResources);
                break;
            }
            case 2:{
                ResourceBundle myResources = ResourceBundle.getBundle("My",
                        Locale.forLanguageTag(en));
                question(myResources);
                break;
            }
        }

    }
}
