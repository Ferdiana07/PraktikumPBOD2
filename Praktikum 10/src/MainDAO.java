/* Nama File    : MainDAO.java
 * Deskripsi    : Main class untuk menguji DAO 
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 12 Mei 2026
 */

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Caesar Ferdiana Suwandi");
        DAOManager manager = new DAOManager();
        manager.setPersonDAO(new MySQLPersonDAO());
        try {
            manager.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
