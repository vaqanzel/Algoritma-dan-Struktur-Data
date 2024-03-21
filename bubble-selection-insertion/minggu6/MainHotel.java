package minggu6;
import java.util.Scanner;
public class MainHotel {
    public static void main(String[] args) {

        HotelService hotelService = new HotelService();
        Hotel hotel1 = new Hotel("Hotel Swiss Belinn", "Malang", 500000, (byte) 4);
        Hotel hotel2 = new Hotel("Hotel Marbella", "Bandung", 300000, (byte) 3);
        Hotel hotel3 = new Hotel("Hotel Mercure", "Surabaya", 700000, (byte) 5);
        Hotel hotel4 = new Hotel("Hotel Merapi Merbabu", "Yogyakarta", 400000, (byte) 2);
        Hotel hotel5 = new Hotel("Hotel Infinity", "Bali", 800000, (byte) 1);

        hotelService.tambah(hotel1);
        hotelService.tambah(hotel2);
        hotelService.tambah(hotel3);
        hotelService.tambah(hotel4);
        hotelService.tambah(hotel5);

        System.out.println("Sebelum sorting:");
        hotelService.tampilAll();

        System.out.println("\nSetelah sorting harga:");
        hotelService.bubbleSortByPrice();
        hotelService.tampilAll();

        System.out.println("\nSetelah sorting bintang:");
        hotelService.selectionSort();
        hotelService.tampilAll();
    }
}
