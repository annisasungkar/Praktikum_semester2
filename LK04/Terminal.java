package LK04;
import java.util.ArrayList;

public class Terminal {
    public static void main(String[] args) {
        ArrayList<Kendaraan> antrian = new ArrayList<>();

        // Tambahkan beberapa kendaraan ke dalam antrian
        antrian.add(new Angkot("Budi", "B 1234 AB", 8));
        antrian.add(new Bis("Tono", "B 5678 CD", 20));
        antrian.add(new Angkot("Joko", "B 9012 EF", 10));
        antrian.add(new Bis("Diana", "B 3456 GH", 24));

        // Tampilkan antrian kendaraan
        System.out.println("Antrian Angkot");
        System.out.println("=======================");
        boolean adaAngkot = false;
        for (Kendaraan kendaraan : antrian) {
            if (kendaraan instanceof Angkot) {
                adaAngkot = true;
                System.out.println("Driver: " + kendaraan.getDriver());
                System.out.println("Nomor Polisi: " + kendaraan.getNomorPolisi());
                System.out.println("Nomor Polisi: " + kendaraan.getNomorPolisi());
                System.out.println("Jumlah Penumpang: " + kendaraan.getJumlahPenumpang());
                System.out.println();
            }
        }
        if (!adaAngkot) {
            System.out.println("Tidak ada Angkot di antrian.");
        }

        System.out.println();

        System.out.println("Antrian Bis");
        System.out.println("=======================");
        boolean adaBis = false;
        for (Kendaraan kendaraan : antrian) {
            if (kendaraan instanceof Bis) {
                adaBis = true;
                System.out.println("Driver: " + kendaraan.getDriver());
                System.out.println("Nomor Polisi: " + kendaraan.getNomorPolisi());
                System.out.println("Jumlah Penumpang: " + kendaraan.getJumlahPenumpang());
                System.out.println();
            }
        }
        if (!adaBis) {
            System.out.println("Tidak ada Bis di antrian.");
        }
    }
}
