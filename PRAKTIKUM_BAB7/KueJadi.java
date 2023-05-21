package PRAKTIKUM_BAB7;

class KueJadi extends Kue {
    private double jumlah;

    KueJadi (String nama, double harga, double jumlah) {
        super(nama,harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return this.jumlah = jumlah;
    }

    public double hitungHarga() {
        return getHarga() * jumlah * 2;
    }

    public String toString() {
        return "Kue\t\t: " + getNama() + "\nHarga\t\t: " + getHarga() + "\nJumlah\t\t: " + jumlah + "\nHitungHarga\t: " + hitungHarga();
    }
}
