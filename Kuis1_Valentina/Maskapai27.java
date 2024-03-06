package Kuis1_Valentina;
    import java.util.Arrays;
    import java.util.Comparator;
    
    public class Maskapai27 {
        public String nomor;
        public String tujuan;
        public int tiket;
        public int tersedia;
        public int terdaftar;
        
        public Maskapai27(String nomor, String tujuan, int tiket, int tersedia, int terdaftar){
            this.nomor = nomor;
            this.tujuan = tujuan;
            this.tiket = tiket;
            this.tersedia = tersedia;
            this.terdaftar = terdaftar;
        }
    
        void tampilInformasi() {
            System.out.println("Nomor : " + nomor);
            System.out.println("Tujuan: " + tujuan);
            System.out.println("Tiket: " + tiket);
            System.out.println("Tersedia: " + tersedia);
            System.out.println("Terdaftar " + terdaftar);
        }
    
        public int hitungSisaKursi(){
            return tersedia - terdaftar;
        }
    
        public static Maskapai27 cariMaskapaiPalingSepi(Maskapai27[] maskapai) {
            Maskapai27 maskapaiPalingSepi = maskapai[0];
            for (int i = 1; i < maskapai.length; i++) {
                if (maskapai[i].hitungSisaKursi() < maskapaiPalingSepi.hitungSisaKursi()) {
                    maskapaiPalingSepi = maskapai[i];
                }
            }
            return maskapaiPalingSepi;
        }
        
        public static void daftarMaskapai(Maskapai27[] maskapai) {
            Arrays.sort(maskapai, Comparator.comparingInt(o -> o.tiket));
            for (int i = maskapai.length - 1; i >= 0; i--) {
                maskapai[i].tampilInformasi();
            }
        }
    
       
    }
    