package javase05.t01;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Catalog {
    private StringBuilder mainDirectory=new StringBuilder("D:\\Work\\src\\main\\resources\\catalog");

    public void changePath(){

        System.out.println("Choose path:\n0) Exite");

        File[] fList;
        File F = new File(mainDirectory.toString());
        fList = F.listFiles();

        Map<Integer,String> map= new HashMap<>();
        int j=1;
        for (File i : fList ) {
            map.put(0,"Exit");
            map.put(j,i.getName());
            System.out.println(j+") "+i.getName());
            j++;
        }
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        //s.close();

        while(l!=0) {
            map.put(0,"Exit");

               mainDirectory.append("\\"+map.get(l));

            F = new File(mainDirectory.toString());
           // System.out.println(mainDirectory);
            fList=F.listFiles();
            System.out.println("Choose path:\n0) Exite");
           // System.out.println(fList.toString());
            j=1;
            try{
                for (File i : fList ) {
                    map.put(j,i.getName());
                    System.out.println(j+") "+i.getName());
                    j++;
                }
            }catch (NullPointerException e){
                System.out.println("Catalog is not exist, please select the proposed folder ");
                mainDirectory.delete(mainDirectory.indexOf("null"),mainDirectory.indexOf("null")+6);
            }

            l = s.nextInt();
    }

        }
    }

