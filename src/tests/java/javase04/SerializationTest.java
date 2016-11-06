package javase04;

import javase04.t04.Serialization;
import org.junit.Test;

public class SerializationTest {
    @Test
    public void serializationTest(){
        String name="D:\\Work\\src\\main\\resources\\films.txt";

        Serialization s=new Serialization();
        s.addNewTextFile(name);
        s.readFile();
        s.addNewActors("Бешеные псы","lol");
        s.readFile();
        s.deleteFilm("Бешеные псы");
        s.readFile();
        s.deleteActor("Джанго Освобожденный","Кристофер Вальц");
        s.readFile();
    }
}
