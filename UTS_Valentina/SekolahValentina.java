package UTS_Valentina;
import java.util.Arrays;

public class SekolahValentina {

    public static void urutkanSiswa(SiswaValentina[] siswaValentina) {
        int n = siswaValentina.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (siswaValentina[j].tahun < siswaValentina[maxIdx].tahun) { 
                    maxIdx = j;
                }
            }
            SiswaValentina temp = siswaValentina[i];
            siswaValentina[i] = siswaValentina[maxIdx];
            siswaValentina[maxIdx] = temp;
        }
    }

    public static SiswaValentina cariSiswa(SiswaValentina[] siswaValentina, String nama) {
        int left = 0;
        int right = siswaValentina.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (siswaValentina[mid].nama.equals(nama)) {
                return siswaValentina[mid];
            }
            else if (siswaValentina[mid].nama.compareTo(nama) < 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return null; 
    }
}

