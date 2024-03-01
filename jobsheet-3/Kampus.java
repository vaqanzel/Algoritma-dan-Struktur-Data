public class Kampus {
    String nama;
    String nim;
    char jenisKelamin;
    double ipk;

    public static double hitungRataIpk(Kampus[] mahasiswas) {
        double totalIpk = 0;
        for (Kampus mahasiswa : mahasiswas) {
            totalIpk += mahasiswa.ipk;
        }
        return totalIpk / mahasiswas.length;
    }

    public static Kampus cariMahasiswaTerbaik(Kampus[] mahasiswas) {
        Kampus mahasiswaTerbaik = mahasiswas[0];
        for (int i = 1; i < mahasiswas.length; i++) {
            if (mahasiswas[i].ipk > mahasiswaTerbaik.ipk) {
                mahasiswaTerbaik = mahasiswas[i];
            }
        }
        return mahasiswaTerbaik;
    }
}
