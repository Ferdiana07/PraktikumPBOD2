/* Nama File    : DAOManager.java
 * Deskripsi    : Class untuk mengelola DAO
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 12 Mei 2026
 */

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO p) {
        personDAO = p;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
