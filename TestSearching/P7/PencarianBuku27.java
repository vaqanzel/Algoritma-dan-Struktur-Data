package TestSearching.P7;

public class PencarianBuku27 {
    Buku27 listBk[] = new Buku27[5];
    int idx;

void tambah(Buku27 m){
    if (idx < listBk.length){
        listBk[idx] = m;
        idx++;
    }else {
        System.out.println("Data sudah penuh!");
    }
}

void tampil() {
    for (Buku27 m : listBk){
        m.tampilDataBuku();
    }
}

public int FindSeqSearch(int cari){
    int posisi = -1;
    for (int j = 0; j < listBk.length; j++){
        if (listBk[j].kodeBuku==cari){
            posisi = j;
            break;
        }
    }
    return posisi;
}

public void Tampilposisi(int x, int pos){
    if (pos != -1){
        System.out.println("data : "+ x + " ditemukan pada indeks " + pos);
    }else{
        System.out.println("data "+ x + " tidak ditemukan");
    }
}
}