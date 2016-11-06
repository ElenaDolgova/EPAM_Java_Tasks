package javase04.t03;

import java.io.*;

public class ChangeCoding {
    public void  read(String name, String nameOut){
        String line;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(name), "UTF8"));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(nameOut), "UTF16"));
            try {
                line=br.readLine();

                while(line!=null){
                    bw.write(line+"\r\n");
                    line=br.readLine();
                }

                br.close();
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
