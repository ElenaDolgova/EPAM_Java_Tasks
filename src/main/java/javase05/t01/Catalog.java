package javase05.t01;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Catalog {

    private StringBuilder mainDirectory=new StringBuilder("D:\\Work\\src\\main\\resources\\catalog");
    private Map<Integer,String> map= new HashMap<>();
    Scanner s = new Scanner(System.in);
    File F = new File(mainDirectory.toString());

    public void changePath(){
        System.out.print("Choose\n Action:\n0) Exite\n"+"1) CreateDir\n");

        File[] fList;
        File F = new File(mainDirectory.toString());
        fList = F.listFiles();
        map.put(0,"Exit");
        map.put(1,"CreateNewTextFile");

        int j=1;
        System.out.print("Path:\n");
        try{for (File i : fList ) {
            j++;
            map.put(j,i.getName());

            System.out.println(j+") "+i.getName());
        }
        }catch (NullPointerException e){
            System.out.println("Catalog is not exist, please select the proposed folder ");
            mainDirectory.delete(mainDirectory.indexOf("null"),mainDirectory.indexOf("null")+6);
        }


        int l = s.nextInt();

        switch (l){
            case 0:{
                break;
            }
            case 1:{
                CreateDir(mainDirectory.toString());
                l=s.nextInt();
                break;
            }
        }

        while(l!=0) {
            mainDirectory.append("\\"+map.get(l));
            map.put(0,"Exit");
            map.put(1,"CreateNewTextFile");
            map.put(2,"DeleteTextFile");
            map.put(3,"ChangeTextFile");
            map.put(4,"CreateDir");
            map.put(5,"");
            switch (l){
                case 1:{
                    mainDirectory.delete(mainDirectory.lastIndexOf("\\"),mainDirectory.length());
                    CreateDir(mainDirectory.toString());
                   break;
                }
                case 2:{
                    break;
                }
                case 3:{
                    break;
                }
                case 5: {
                mainDirectory.delete(mainDirectory.lastIndexOf("\\"),mainDirectory.length());
                mainDirectory.delete(mainDirectory.lastIndexOf("\\"),mainDirectory.length());
                    break;
            }
            }
            F = new File(mainDirectory.toString());
            fList=F.listFiles();
            if(mainDirectory.length()>34) {
                System.out.print("Choose\n Action:\n0) Exite\n" + "1) CreateNewTextFile\n"
                        + "2) DeleteTextFile\n" + "3) ChangeTextFile\n" + "4) CreateDir\n"+ "5) Return\n");
            }else{
                System.out.print("Choose\n Action:\n0) Exite\n" + "1) CreateNewTextFile\n" +
                        "2) DeleteTextFile\n" + "3) ChangeTextFile\n"+ "4) CreateDir\n");
            }
            j=6;
            System.out.println(mainDirectory);
            System.out.print("Path:\n");
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

    s.close();
        }

        public void CreateNewTextFile(String name){
            System.out.println(name);
            String new1=s.next();
            try{
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(name+"\\"+new1+".txt")));
                bw.close();
            }catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public  void CreateDir(String name){
            System.out.println(name);
            String new1=s.next();
            File folder = new File(name+
                    File.separator + new1);
            if (!folder.exists()) {
                folder.mkdirs();
            }
        }
}

