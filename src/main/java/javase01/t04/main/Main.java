package javase01.t04.main;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Input the even number of elements ");
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        double[] mass = new double[n];
        for (int i=0;i<n;i++ ) {
            mass[i] = s.nextDouble();
        }

        sum(mass);
        Arrays.sort(mass);

       System.out.println(mass[n-1]);
    }

    private static void sum(double[] mass){
        double q=mass[0];
        for(int i=0;i<(mass.length/2);i++){
            mass[i]=mass[i]+mass[mass.length-i-1];
            mass[mass.length-i-1]=0;
        }
    }
}
