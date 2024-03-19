package minggu5;

public class MainShowroom {
    public static void main(String[] args) {
        Showroom[] mobils = {
                new Showroom("BMW", "M2 Coupe", 2016, 6816, 728),
                new Showroom("Ford", "Fiesta ST", 2014, 3921, 575),
                new Showroom("Nissan", "370Z", 2009, 4360, 657),
                new Showroom("Subaru", "BRZ", 2014, 4058, 609),
                new Showroom("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Showroom("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Showroom("Toyota", "86/GT86", 2014, 4180, 609),
                new Showroom("Volkswagen", "Golf GTI", 2014, 4180, 631)
        };

        Showroom showroom = new Showroom(mobils);

        // a) Mencari top_acceleration tertinggi menggunakan Divide and Conquer
        int maxAcceleration = showroom.findMaxAcceleration();
        System.out.println("Top Acceleration Tertinggi: " + maxAcceleration);

        // b) Mencari top_acceleration terendah menggunakan Divide and Conquer
        int minAcceleration = showroom.findMinAcceleration();
        System.out.println("Top Acceleration Terendah: " + minAcceleration);

        // c) Menghitung rata-rata top_power dari seluruh mobil
        double averagePower = showroom.calculateAveragePower();
        System.out.println("Rata-rata Top Power: " + averagePower);
    }
}
