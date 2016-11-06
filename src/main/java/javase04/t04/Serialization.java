package javase04.t04;

import java.io.*;
import java.util.*;

public class Serialization implements  Serializable {

    private String binaryFile="D:\\Work\\src\\main\\resources\\binary.ser";
    private Map<String, String> map;

    public void addNewTextFile(String name){
        map= new HashMap<>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream(name)))){
            String film;
            String string="";
            String line;
            line=br.readLine();

            while(line!=null){
            film=line.substring(0,line.indexOf(":"));
            line=line.substring(line.indexOf(":")+1,line.length());
            while(!line.toString().equals(";")){
                if(line.indexOf(",")!=-1){
                    string=string+line.substring(0,line.indexOf(","))+", ";
                    line=line.substring(line.indexOf(",")+1,line.length());
                } else {
                    string=string+line.substring(0,line.indexOf(";"));
                    line=line.substring(line.indexOf(";"),line.length());
                }
            }
                map.put(film, string);
                line=br.readLine();
                string="";
            }
            serialize();

        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    private void serialize(){
        try( ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(binaryFile))){
            oos.writeObject(map);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readFile(){
        System.out.println();
        for (Map.Entry i: map.entrySet()
                ) {
            System.out.println(i.getKey()+": "+i.getValue());
        }
    }
    private void deserialize(){
         try {
             FileInputStream is= new FileInputStream(binaryFile);
             ObjectInputStream ois= new ObjectInputStream(is);
             map=(HashMap)ois.readObject();
             ois.close();
             is.close();
         } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
     }
     public void addNewActors(String film,String actors){
         deserialize();
         if(map.containsKey(film)==false){
             map.put(film, actors);
         }else{
        String string= map.get(film);
         map.put(film,string+", "+actors);
         }
         serialize();
     }
     public  void deleteFilm(String film){
         deserialize();
         map.remove(film);
         serialize();
     }
     public void deleteActor(String film, String actor){
         deserialize();
         String string=map.get(film);
         String actor1=actor+", ";
         if(string.indexOf(actor1)!=-1){
          string= string.replaceAll(actor1,"");
         }else{
            string=string.replaceAll(actor,"");
         }
         map.put(film,string);
         serialize();
     }
}
