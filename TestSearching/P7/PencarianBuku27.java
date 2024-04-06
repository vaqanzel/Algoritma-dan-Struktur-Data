package TestSearching.P7;

import java.util.Arrays;

public class PencarianBuku27 {
    Buku27 listBk[] = new Buku27[5];
    int idx;

    void tambah(Buku27 m){
        if (idx < listBk.length){
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku27 m : listBk){
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari) {
        for (int j = 0; j < idx; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                return j;
            }
        }
        return -1;
    }

    public void Tampilposisi(String x, int pos) {
        if (pos != -1){
            System.out.println("Data : "+ x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data "+ x + " tidak ditemukan");
        }
    }

    public void TampilData(String x, int pos) {
        if(pos != -1){
            System.out.println("Kode Buku\t : " + listBk[pos].kodeBuku );
            System.out.println("Judul\t         : " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t  : " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t     : " + listBk[pos].pengarang);
            System.out.println("Stock\t         : " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public Buku27 FindBuku(String cari) {
        for (int j = 0; j < idx; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                return listBk[j];
            }
        }
        return null;
    }

    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (listBk[j].judulBuku.compareToIgnoreCase(listBk[j + 1].judulBuku) > 0) {
                    Buku27 temp = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = temp;
                }
            }
        }
    }

    
    public int FindBinarySearch(String cari) {
        bubbleSort();
        int left = 0;
        int right = idx - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int result = listBk[mid].judulBuku.compareToIgnoreCase(cari);
            if (result == 0) {
                return mid;
            } else if (result < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
