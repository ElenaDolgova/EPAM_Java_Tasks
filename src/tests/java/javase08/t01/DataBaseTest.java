package javase08.t01;

import org.junit.Test;
import java.sql.*;

public class DataBaseTest {

    @Test
    public void testBase() throws ClassNotFoundException, SQLException {
        final String url = "jdbc:postgresql://localhost:5434/postgres";
        final String username = "postgres";
        final String password = "Ktyjxrf213415";

        Class.forName("org.postgresql.Driver");


        try(Connection cn = DriverManager.getConnection(url,username,password)){

            DataBase db=new DataBase(cn);
            db.select();
            db.update(3,"В бой идут одни старики", 9);
            db.select();
            db.choose(2);
            db.choose(3);
        }
    }
}
