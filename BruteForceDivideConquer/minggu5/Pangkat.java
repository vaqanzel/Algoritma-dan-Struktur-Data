package minggu5;

public class Pangkat {
    public int nilai, pangkat;

    int pangkatBF(int a, int n) {
        int hasil = 1; 
        for (int i = 0; i < n; i++) {
            hasil *= a; 
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            int hasil = pangkatDC(a, n / 2);
            if (n % 2 == 0) 
            {
                return hasil * hasil;
            } else { 
                return hasil * hasil * a;
            }
        }
    }
}
