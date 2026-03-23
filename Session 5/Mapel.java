public class Mapel extends Guru { //extends Guru to associate a subject with a teacher

    //attribute
    protected String nama_mapel;
    private String kodeMapel;
    private int sks;

    //constructor
    public Mapel(String nama_mapel, String nama_dosen) {
        this(nama_mapel, nama_dosen, "", 2);
    }

    //masih ada constructor yang lebih lengkap untuk fleksibilitas
    public Mapel(String nama_mapel, String nama_dosen, String kodeMapel, int sks) {
        super(nama_dosen);
        this.nama_mapel = (nama_mapel == null) ? "" : nama_mapel.trim();
        this.kodeMapel = (kodeMapel == null) ? "" : kodeMapel.trim();
        this.sks = (sks <= 0) ? 1 : sks;
    }

    //getter for Mapel attributes - not strictly necessary for this demo but included for completeness
    public String getNamaMapel() { return nama_mapel; }
    public String getKodeMapel() { return kodeMapel; }
    public int getSks() { return sks; }

    @Override // Override infoGuru to include Mapel info
    public void infoGuru() {
        System.out.println("Nama Guru: " + nama_guru);
        System.out.println("Mapel: " + nama_mapel + " (kode: " + kodeMapel + ", sks: " + sks + ")");
    }

    @Override // Override toString for better printout of Mapel info in Main
    public String toString() {
        return nama_mapel + " [" + kodeMapel + ", sks=" + sks + ", guru=" + nama_guru + "]";
    }
}