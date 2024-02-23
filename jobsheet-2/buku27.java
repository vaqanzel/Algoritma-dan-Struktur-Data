
public class buku27 {
    //deklarasi atribut
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    // konstruktor default
public buku27() {
    judul = "";
    pengarang = "";
    halaman = 0;
    stok = 0;
    harga = 0;
}
    // konstruktor berparamenter
public buku27(String jud, String pg, int hal, int stok, int har){
    judul =jud;
    pengarang =pg;
    halaman = hal;
    this.stok = stok;
    harga = har;
    }
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
    
    void hitungHargaTotal(int hargaTotal) {
       hargaTotal = harga * stok;
        System.out.println("Harga Total: Rp " + hargaTotal);
    }
    void hitungDiskon(int hargaTotal) {
       hargaTotal = harga * stok;
        double diskon = 0;
        if (hargaTotal > 150000) {
            diskon = 0.12 * hargaTotal; 
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05 * hargaTotal; 
        }
         System.out.println("Diskon: Rp " + diskon);
    }
    void hitungHargaBayar(int hargaTotal){
       hargaTotal = harga * stok;
       double diskon = 0;
       double hargaBayar = hargaTotal;
       if (hargaTotal > 150000){
        diskon = 0.12 * hargaTotal; 
    } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
        diskon = 0.05 * hargaTotal; 
        hargaBayar -= diskon;
    }
       System.out.println("Harga Bayar: Rp " + hargaBayar);
    }
}
    
    
    
        