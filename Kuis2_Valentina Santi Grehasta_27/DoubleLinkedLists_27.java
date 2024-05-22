public class DoubleLinkedLists_27 {
    Pembeli_27 headPembeli27;
    Pesanan_27 headPesanan27;
    int sizePembeli27;
    int sizePesanan27;
    int totalPendapatan27;

    public DoubleLinkedLists_27() {
        headPembeli27 = null;
        headPesanan27 = null;
        sizePembeli27 = 0;
        sizePesanan27 = 0;
        totalPendapatan27 = 0;
    }

    public boolean isEmptyPembeli27() {
        return headPembeli27 == null;
    }

    public boolean isEmptyPesanan27() {
        return headPesanan27 == null;
    }

    public void addPembeli27(String namaPembeli27, String noHp27) {
        Pembeli_27 newPembeli27 = new Pembeli_27(sizePembeli27 + 1, namaPembeli27, noHp27);
        if (isEmptyPembeli27()) {
            headPembeli27 = newPembeli27;
        } else {
            Pembeli_27 current27 = headPembeli27;
            while (current27.next27 != null) {
                current27 = current27.next27;
            }
            current27.next27 = newPembeli27;
            newPembeli27.prev27 = current27;
        }
        sizePembeli27++;
    }

    public void addPesanan27(String namaPesanan27, int harga27) {
        Pesanan_27 newPesanan27 = new Pesanan_27(sizePesanan27 + 1, namaPesanan27, harga27);
        if (isEmptyPesanan27()) {
            headPesanan27 = newPesanan27;
        } else {
            Pesanan_27 current27 = headPesanan27;
            while (current27.next27 != null) {
                current27 = current27.next27;
            }
            current27.next27 = newPesanan27;
            newPesanan27.prev27 = current27;
        }
        sizePesanan27++;
        totalPendapatan27 += harga27;
    }

    public void printPembeli27() {
        if (!isEmptyPembeli27()) {
            Pembeli_27 current27 = headPembeli27;
            System.out.println("---------------------------------------------");
            System.out.println("Daftar Antrian Resto Royal Delish");
            System.out.println("---------------------------------------------");
            System.out.printf("%-5s%-30s%-15s\n", "No.", "Nama Customer", "No Hp");
            while (current27 != null) {
                System.out.printf("%-5d%-30s%-15s\n", current27.noAntrian27, current27.namaPembeli27, current27.noHp27);
                current27 = current27.next27;
            }
            System.out.println("Total Antrian: " + sizePembeli27);
        } else {
            System.out.println("Tidak ada antrian.");
        }
    }

    public void printPesanan27() {
        if (!isEmptyPesanan27()) {
            Pesanan_27 current27 = headPesanan27;
            System.out.println("--------------------------------------------------");
            System.out.println("Daftar Pesanan Masuk Resto Royal Delish");
            System.out.println("--------------------------------------------------");
            System.out.printf("%-5s%-30s%-10s\n", "No.", "Nama Pesanan", "Harga");
            while (current27 != null) {
                System.out.printf("%-5d%-30s%-10d\n", current27.kodePesanan27, current27.namaPesanan27, current27.harga27);
                current27 = current27.next27;
            }
        } else {
            System.out.println("Tidak ada pesanan.");
        }
    }

    public void removeFirstPembeli27(){
        if (!isEmptyPembeli27()) {
            headPembeli27 = headPembeli27.next27;
            if(headPembeli27 != null) {
                headPembeli27.prev27 = null;
            }
            sizePembeli27--;
        }
    }

    public void UrutPesanan27() {
        if (!isEmptyPesanan27()) {
            Pesanan_27 current27 = headPesanan27;
            while (current27 != null) {
                Pesanan_27 index27 = current27.next27;
                while (index27 != null) {
                    if (current27.namaPesanan27.compareTo(index27.namaPesanan27) > 0) {

                        String tempNama27 = current27.namaPesanan27;
                        int tempHarga27 = current27.harga27;

                        current27.namaPesanan27 = index27.namaPesanan27;
                        current27.harga27 = index27.harga27;
                        
                        index27.namaPesanan27 = tempNama27;
                        index27.harga27 = tempHarga27;
                    }
                    index27 = index27.next27;
                }
                current27 = current27.next27;
            }
        }
    }

    public void printTotalPendapatan27() {
        System.out.println("---------------------------------------------");
        System.out.println("TOTAL PENDAPATAN");
        System.out.println("---------------------------------------------");
        System.out.println("Pendapatan hari ini: " + totalPendapatan27);
    }
}
