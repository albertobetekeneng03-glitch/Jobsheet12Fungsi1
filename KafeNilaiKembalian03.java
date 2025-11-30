import java.util.Scanner;

public class KafeNilaiKembalian03 {

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int total = hargaItems[pilihanMenu - 1] * banyakItem;
        int potongan = 0;

        if (kodePromo.equals("Diskon 50")) {
            potongan = total / 2;
            System.out.println("Diskon 50% diterapkan.");
        } else if (kodePromo.equals("Diskon 30")) {
            potongan = (int)(total * 0.3);
            System.out.println("Diskon 30% diterapkan.");
        } else {
            System.out.println("Kode promo invalid.");
        }

        return total - potongan;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nMasukkan nomor menu: ");
        int menu = sc.nextInt();
        System.out.print("Masukkan jumlah item: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        System.out.print("Masukkan kode promo: ");
        String kode = sc.nextLine();

        int total = hitungTotalHarga(menu, jumlah, kode);
        System.out.println("Total harga setelah diskon: Rp. " + total);

        sc.close();
    }
}
