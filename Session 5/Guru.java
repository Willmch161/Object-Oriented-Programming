/**
 * Represents a teacher (Guru).
 * @explanation This class stores the teacher's name and provides a
 * simple `infoGuru()` method to print that information. It is a
 * minimal superclass used by `Mapel` to associate a subject with a
 * teacher. The tag is included for documentation and demonstration
 * purposes.
 */
public class Guru {

    protected String nama_guru;

    public Guru(String nama_guru) {
        this.nama_guru = nama_guru;
    }

    public void infoGuru() {
        System.out.println("Nama Guru: " + nama_guru);
    }
}
