package javase01.t05.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Input the dimension of the matrix: ");
        Scanner s= new Scanner(System.in);
        matrix(s.nextInt());
        }

        private static void matrix(int n){
            int[][] mass=new int[n][n];
            for (int i=0;i<n;i++) {

                for(int j=0;j<n;j++){
                    if((i==j)|((i+j)==(n-1))){ // проврка на единички, стоящие на дагонали
                        mass[i][j]=1;
                    }
                    System.out.print(mass[i][j]);
                }
                System.out.println();

            }
        }

}
