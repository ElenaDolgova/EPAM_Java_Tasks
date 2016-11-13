package javase08.t01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase {

    private PreparedStatement ps;
    private Connection cn;

    public DataBase(Connection cn){
        this.cn=cn;
    }
    public void select() throws SQLException {
        ps = cn.prepareStatement("SELECT * FROM films ORDER BY id");
        final ResultSet rs= ps.executeQuery();
        while (rs.next()){
            System.out.println(rs.getInt("id")+". Название фильма: "+rs.getString("name")+"; Рейтинг фильма "+rs.getInt("stars"));
        }

    }
    public void update(int num, String film, int star) {

      try{ ps=cn.prepareStatement("INSERT INTO films(id, name, stars) VALUES (?,?,?)");
        ps.setInt(1,num);
        ps.setString(2,film);
        ps.setInt(3,star);

        final int cnt = ps.executeUpdate();
          System.out.println("Inserted: " + cnt);
      }catch(org.postgresql.util.PSQLException e){
          try {
              ps=cn.prepareStatement("UPDATE films SET name=?, stars=? WHERE id=?");

              ps.setString(1, film);
              ps.setInt(2, star);
              ps.setInt(3, num);
              ps.executeUpdate();
          } catch (SQLException e1) {
              e1.printStackTrace();
          }
       } catch (SQLException e) {
          e.printStackTrace();
      }
    }

    public void choose(int num) throws SQLException {
        try {
            ps=cn.prepareStatement("SELECT name FROM films WHERE id=?");
            ps.setInt(1,num);
            final ResultSet rs=ps.executeQuery();
            rs.next();
            System.out.println("Фильм: "+rs.getString("name"));
        } catch (org.postgresql.util.PSQLException e) {
            System.out.println("Film is not exist.");
        }
    }

    public void delete() throws SQLException {
        ps=cn.prepareStatement("DROP TABLE films");
    }
}
