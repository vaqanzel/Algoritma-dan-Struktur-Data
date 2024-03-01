public class LimasSegiEmpat {
    private double sisiAlas;
    private double tinggi;

    public LimasSegiEmpat(double sisiAlas, double tinggi) {
        this.sisiAlas = sisiAlas;
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * sisiAlas * sisiAlas * tinggi;
    }

    public double hitungLuasPermukaan() {
        return sisiAlas * sisiAlas + 4 * (0.5 * sisiAlas * Math.sqrt((sisiAlas / 2) * (sisiAlas / 2) + tinggi * tinggi));
    }
}
