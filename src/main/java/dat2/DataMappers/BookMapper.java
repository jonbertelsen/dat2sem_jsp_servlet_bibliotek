package dat2.DataMappers;

import dat2.Model.Bog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookMapper {

    public static ArrayList<Bog> getAllBooks(){

        ArrayList<Bog> bookList = new ArrayList<>();

        String sql = "select * from bog ";
        try (Connection con = ConnectionConfiguration.getConnection();
             PreparedStatement ps = con.prepareStatement(sql))  {
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("bog_id");
                String titel = resultSet.getString("titel");
                String forfatter = resultSet.getString("forfatternavn");
                int udgivelsesaar = resultSet.getInt("udgivelsesaar");
                Bog newBook = new Bog(id, titel,forfatter, udgivelsesaar);
                bookList.add(newBook);
            }
        } catch (SQLException e) {
            System.out.println("Fejl i connection til database");
            e.printStackTrace();
        }
        return bookList;
    }

    public static ArrayList<Bog> findBooks(String _titel, String _forfatter, int _udgivelsesaar){

        ArrayList<Bog> bookList = new ArrayList<>();

        String sql = "select * from bog  ";
        try (Connection con = ConnectionConfiguration.getConnection();
             PreparedStatement ps = con.prepareStatement(sql))  {
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("bog_id");
                String titel = resultSet.getString("titel");
                String forfatter = resultSet.getString("forfatternavn");
                int udgivelsesaar = resultSet.getInt("udgivelsesaar");
                Bog newBook = new Bog(id, titel,forfatter, udgivelsesaar);
                bookList.add(newBook);
            }
        } catch (SQLException e) {
            System.out.println("Fejl i connection til database");
            e.printStackTrace();
        }
        return bookList;
    }


}
