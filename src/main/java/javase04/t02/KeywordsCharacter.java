package javase04.t02;

import javase04.t01.AllKeywords;

import java.io.*;
import java.util.EnumMap;

public class KeywordsCharacter {
    public EnumMap readFile(String name){
        int oneWord;
        StringBuilder stringBuilder=new StringBuilder();
        try {
            Reader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream(name), "UTF8"));
            try {
                oneWord = reader.read();
                while (oneWord != -1) {
                    stringBuilder.append((char) oneWord);
                    oneWord = reader.read();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
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

    public void writer(String nameOut, EnumMap es){

        Writer writer= null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(nameOut)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (AllKeywords i: AllKeywords.values()
                 ) {
                try {
                    writer.write(i.toString()+" "+es.get(i).toString()+"\r\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
