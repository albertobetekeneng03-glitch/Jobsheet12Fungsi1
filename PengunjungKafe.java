public class PengunjungKafe {
    public static void daftarPengunjung(String... namaPengunjung){
        System.out.println("Daftar nama pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }


    public static void main(String[] args) {
        daftarPengunjung("Andi", "Budi", "Citra", "Dewi");  
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}

