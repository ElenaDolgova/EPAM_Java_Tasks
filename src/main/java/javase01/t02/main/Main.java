package javase01.t02.main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("Input e ");
        double q = s.nextDouble();

        int n=1;
        double w=0;

        for(int i=1; min(q,method(i))>0;i++){
            System.out.print(method(i)+" ");
            n=i;
        }
        System.out.println("Minimum number: "+n);
    }

    private static  double method (int i){

        return (double)1/((i+1)*(i+1));
    }
    private static double min(double e, double a){


        return (double)a-e;
    }
}