package minggu5;

public class Faktorial {
     int nilai;

    //  int faktorialBF(int n) {
    //     int fakto = 1;
    //     for(int i = 1; i <= n; i++) {
    //         fakto = fakto * i;
    //     }
    //     return fakto;
    // }

    int faktorialBF(int n) {
        if (n==0 || n==1) {
            return 1;
        } else {
            return n * faktorialBF(n - 1);
        }
    }

      int faktorialDC(int n) {
        if(n==1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}
