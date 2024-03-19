package minggu5;

public class Showroom {
    Showroom[] mobils;
    String merk;
    String tipe;
    int tahun;
    int top_acceleration;
    int top_power;
    
    public Showroom(Showroom[] mobils) {
        this.mobils = mobils;
    }
    
    public Showroom(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    } 

    public int findMaxAcceleration() {
        return findMaxAcceleration(0, mobils.length - 1);
    }

    private int findMaxAcceleration(int left, int right) {
        if (left == right) {
            return mobils[left].top_acceleration;
        }
        
        int mid = (left + right) / 2;
        int maxLeft = findMaxAcceleration(left, mid);
        int maxRight = findMaxAcceleration(mid + 1, right);
        
        return Math.max(maxLeft, maxRight);
    }

    public int findMinAcceleration() {
        return findMinAcceleration(0, mobils.length - 1);
    }

    private int findMinAcceleration(int left, int right) {
        if (left == right) {
            return mobils[left].top_acceleration;
        }
        
        int mid = (left + right) / 2;
        int minLeft = findMinAcceleration(left, mid);
        int minRight = findMinAcceleration(mid + 1, right);
        
        return Math.min(minLeft, minRight);
    }

    public double calculateAveragePower() {
        double totalPower = 0;
        for (Showroom mobil : mobils) {
            totalPower += mobil.top_power;
        }
        return totalPower / mobils.length;
    }
}
