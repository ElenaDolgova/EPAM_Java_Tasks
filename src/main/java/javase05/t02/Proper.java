
package javase05.t02;

        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.util.*;

public class Proper {
    private static final String name = "D:\\Work\\src\\main\\resources\\config.properties";

    public void props() {
        FileInputStream fileInputStream;
        Properties prop = new Properties();

            try{
                fileInputStream = new FileInputStream(name);
                prop.load(fileInputStream);
            } catch (FileNotFoundException e) {
                System.out.println("File is not found: " + e.getMessage());
            }  catch (IOException e) {
                e.printStackTrace();
            }
            for (Map.Entry<Object, Object> i : prop.entrySet()
                    ) {
                try {
                    System.out.println(i.getKey() + ": " + i.getValue());
                }catch (NullPointerException e) {
                    System.out.println("Kie is not exist" + e.getMessage());
                }
            }
    }
}

