package minggu6;

public class HotelService {
    Hotel[] rooms = new Hotel[5];
    int hitung = 0;

    void tambah(Hotel H) {
        if (hitung < rooms.length) {
            rooms[hitung] = H;
            hitung++;
        } else {
            System.out.println("Maaf, kamar sudah penuh!");
        }
    }

    void tampilAll() {
        for (Hotel room : rooms) {
            System.out.println("Nama: " + room.nama + ", Kota: " + room.kota + ", Harga: " + room.harga + ", Bintang: " + room.bintang);
        }
    }

    void bubbleSortByPrice() {
        for (int i = 0; i < hitung - 1; i++) {
            for (int j = 0; j < hitung - i - 1; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < hitung - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < hitung; j++) {
                if (rooms[j].bintang > rooms[idxMax].bintang) {
                    idxMax = j;
                }
            }
            Hotel temp = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = temp;
        }
    }
}
