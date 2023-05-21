package PRAKTIKUM_BAB7;

public class Kue {
    private String nama;
    private double harga;

    Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    String getNama() {
        return nama;
    }

    double getHarga() {
        return harga;
    }

    double hitungHarga() {
        return 0;
    }

    public String toString() {
        return "";
    }
}
