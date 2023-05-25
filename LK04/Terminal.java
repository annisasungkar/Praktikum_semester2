package LK04;
import java.util.ArrayList;

class Kendaraan {
    protected String driver;
    protected String nomorPolisi;
    protected int jumlahPenumpang;

    public Kendaraan(String driver, String nomorPolisi, int jumlahPenumpang) {
        this.driver = driver;
        this.nomorPolisi = nomorPolisi;
        this.jumlahPenumpang = jumlahPenumpang;
    }

    public String getDriver() {
        return driver;
    }

    public String getNomorPolisi() {
        return nomorPolisi;
    }

    public int getJumlahPenumpang() {
        return jumlahPenumpang;
    }
}

class Angkot extends Kendaraan {
    public Angkot(String driver, String nomorPolisi, int jumlahPenumpang) {
        super(driver, nomorPolisi, jumlahPenumpang);
    }
}

class Bis extends Kendaraan {
    public Bis(String driver, String nomorPolisi, int jumlahPenumpang) {
        super(driver, nomorPolisi, jumlahPenumpang);
    }
}

public class Terminal {
    public static void main(String[] args) {
        ArrayList<Kendaraan> antrian = new ArrayList<>();

        // Menambahkan beberapa kendaraan ke dalam antrian
        antrian.add(new Angkot("Budi", "B 1234 AB", 8));
        antrian.add(new Bis("Tono", "B 5678 CD", 20));
        antrian.add(new Angkot("Joko", "B 9012 EF", 10));
        antrian.add(new Bis("Diana", "B 3456 GH", 24));

        // Menampilkan antrian kendaraan Angkot
        System.out.println("Antrian Angkot");
        System.out.println("=======================");
        boolean adaAngkot = false;
        for (Kendaraan kendaraan : antrian) {
            try {
                if (kendaraan instanceof Angkot) {
                    adaAngkot = true;
                    System.out.println("Driver: " + kendaraan.getDriver());
                    System.out.println("Nomor Polisi: " + kendaraan.getNomorPolisi());
                    System.out.println("Jumlah Penumpang: " + kendaraan.getJumlahPenumpang());
                    System.out.println();
                }
            } catch (Exception e) {
                // Menangani kesalahan saat menampilkan Angkot.
                System.out.println("Terjadi kesalahan saat menampilkan Angkot.");
                e.printStackTrace();
            }
        }
        if (!adaAngkot) {
            System.out.println("Tidak ada Angkot dalam antrian.");
        }

        System.out.println();

        // Menampilkan antrian kendaraan Bis
        System.out.println("Antrian Bis");
        System.out.println("=======================");
        boolean adaBis = false;
        for (Kendaraan kendaraan : antrian) {
            try {
                if (kendaraan instanceof Bis) {
                    adaBis = true;
                    System.out.println("Driver: " + kendaraan.getDriver());
                    System.out.println("Nomor Polisi: " + kendaraan.getNomorPolisi());
                    System.out.println("Jumlah Penumpang: " + kendaraan.getJumlahPenumpang());
                    System.out.println();
                }
            } catch (Exception e) {
                // Menangani kesalahan saat menampilkan Bis.
                System.out.println("Terjadi kesalahan saat menampilkan Bis.");
                e.printStackTrace();
                }
            }
        if (!adaBis) {
            System.out.println("Tidak ada Bis dalam antrian.");
            }
        }
    }