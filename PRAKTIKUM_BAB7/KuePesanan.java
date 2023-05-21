package PRAKTIKUM_BAB7;

class KuePesanan extends Kue {
    private double berat;

    KuePesanan (String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return this.berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
   }

   public double hitungHarga() {
    return getHarga() * berat;
   }

   public String toString() {
    return "Kue\t\t: " + getNama() + "\nHarga\t\t: " + getHarga() + "\nBerat\t\t: " + berat + "\nHitungHarga\t: " + hitungHarga();
    }
}
