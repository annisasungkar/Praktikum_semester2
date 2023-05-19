package LK04;

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

