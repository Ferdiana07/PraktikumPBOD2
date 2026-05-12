/* Nama File    : Person.java
 * Deskripsi    : Class Person untuk merepresentasikan objek person
 * Pembuat      : Caesar Ferdiana Suwandi
 * Tanggal      : 12 Mei 2026
 */

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
