/* Nama File    : MySQLPersonDAO.java
 * Deskripsi    : Implementation of PersonDAO for MySQL database
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 12 Mei 2026
 */

import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost/pbo", "root","Ferdiana028");

        String query = "INSERT INTO person (name) VALUES ('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        s.close();
    }
}