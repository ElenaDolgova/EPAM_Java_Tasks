package javase04.t01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.EnumMap;

public class Keywords {
    public EnumMap findKeywords(String name){
        FileInputStream inFile=null;
        StringBuilder stringBuilder=new StringBuilder();
        int oneWord;
        try {
            inFile=new FileInputStream(name);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            oneWord = inFile.read();
            while (oneWord != -1) {
                stringBuilder.append((char) oneWord);
                oneWord = inFile.read();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            inFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        EnumMap<AllKeywords,Integer> es;
        es=new EnumMap<>(AllKeywords.class);
        for (AllKeywords i: AllKeywords.values()
             ) {
            es.put(i,0);
            while (stringBuilder.indexOf(i.toString())!=-1){
               es.put(i,es.get(i)+1);
                stringBuilder.replace(stringBuilder.indexOf(i.toString()),
                        i.toString().length()+stringBuilder.indexOf(i.toString()),"");
            }

        }
        return es;
    }
public void out(String nameOut, EnumMap es){
        FileOutputStream outFile=null;
        try {
            outFile =new FileOutputStream(nameOut);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (AllKeywords i: AllKeywords.values()
                ) {
            try {
                outFile.write(i.toString().getBytes());
                outFile.write(" ".toString().getBytes());
                outFile.write(es.get(i).toString().getBytes());
                outFile.write("\r\n".toString().getBytes());
                outFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    outFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
}



}
