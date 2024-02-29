public class Mahasiswa {
    private String nama;
    private String nim;

    // Konstruktor 1
    public Mahasiswa() {
        this.nama = "Belum ditentukan";
        this.nim = "Belum ditentukan";
    }

    // Konstruktor 2s
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }

    public static void main(String[] args) {
        // Membuat objek menggunakan konstruktor pertama
        Mahasiswa mhs1 = new Mahasiswa();
        System.out.println("Informasi Mahasiswa 1:");
        mhs1.tampilkanInfo();
        
        // Membuat objek menggunakan konstruktor kedua
        Mahasiswa mhs2 = new Mahasiswa("Valentina", "2341720016");
        System.out.println("\nInformasi Mahasiswa 2:");
        mhs2.tampilkanInfo();
    }
}
