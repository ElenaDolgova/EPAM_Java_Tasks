package javase01.t03.main
import java.util.Scanner;
public class Main {
    public static void  main(String[] args ){
        Scanner s= new Scanner(System.in);
        System.out.println("Input h ");
        double h=s.nextDouble();
        System.out.println("Input a ");
        double a=s.nextDouble();
        System.out.println("Input b ");
        double b=s.nextDouble();
        out1(a,b,h);

    }
    private static void out1(double a, double b, double h){
        for (double i=a;i<b;i=i+h){
            System.out.print(i+" ");
            System.out.println(function(i));
        }
    }
    private static double function (double x){
        return Math.tan(2*x)-3;
    }
}
