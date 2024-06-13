public class TransaksiRental {
    static int autoIncrement = 1;
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    BarangRental br;

    TransaksiRental(String namaPeminjam, int lamaPinjam, BarangRental br, boolean isMember) {
        this.kodeTransaksi = autoIncrement++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;
        double biaya = lamaPinjam * br.biayaSewa;
        if (isMember) {
            biaya *= 0.9; 
        }
        this.totalBiaya = biaya;
    }
}
