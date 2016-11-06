
package javase05.t02;

        import java.io.FileInputStream;
        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.util.*;

public class Proper {
    private static final String name = "D:\\Work\\src\\main\\resources\\confog.properties";
    private Properties prop = new Properties();
    public void props() {
        FileInputStream fileInputStream;

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
    public Object getValue(String key){
        try{
            if (prop.get(key)==null) {
                throw new NullPointerException();
            }
        }catch (NullPointerException e){
            System.out.println("Key is null: "+e.getMessage());
        }
        return prop.get(key);
    }
}

