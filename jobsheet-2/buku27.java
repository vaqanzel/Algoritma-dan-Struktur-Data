
public class buku27 {
    //deklarasi atribut
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;
    //deklarasi method
    void tampilInformasi() {
         System.out.println("Judul: " + judul);
         System.out.println("Pengarang: " + pengarang);
         System.out.println("Julah halaman: " + halaman);
         System.out.println("Sisa Stok: " + stok);
         System.out.println("Harga: Rp " + harga);
    }
    // void terjual(int jml){
    //     stok -= jml;
    // }   
    //modifikasi
    void terjual(int jml) {
        if (stok > 0) { 
            stok -= jml; 
        } else {
            System.out.println("Stok habis. Tidak dapat melakukan penjualan.");
        }
    }
    
    void restock(int jml){
        stok += jml;
    }
    void gantiHarga(int hrg){
        harga = hrg;
    }
}