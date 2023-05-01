package relationship;

//Ananda Annisa Sungkar
//225150701111033

public class Mobil {
    private String nomorPolisi;
    private String driver;
    private String[] penumpang;

    public Mobil(String nomorPolisi, String driver, String[] penumpang) {
        this.nomorPolisi = nomorPolisi;
        this.driver = driver;
        this.penumpang = penumpang;
    }

    public String getNomorPolisi() {
        return this.nomorPolisi;
    }

    public String getDriver() {
        return this.driver;
    }

    public String[] getPenumpang() {
        return this.penumpang;
    }

    public void tambahPenumpang(String penumpangBaru) {
        for (int i = 0; i < this.penumpang.length; i++) {
            if (this.penumpang[i] == null) {
                this.penumpang[i] = penumpangBaru;
                break;
            }
        }
    }

    public void hapusPenumpang(String penumpangHapus) {
        for (int i = 0; i < this.penumpang.length; i++) {
            if (this.penumpang[i] != null && this.penumpang[i].equals(penumpangHapus)) {
                this.penumpang[i] = null;
                break;
            }
        }
    }

    public void printInfoMobil() {
        System.out.println("Nomor Polisi : " + this.nomorPolisi);
        System.out.println("Driver       : " + this.driver);
        System.out.println("Penumpang    : ");
        for (int i = 0; i < this.penumpang.length; i++) {
            if (this.penumpang[i] != null) {
                System.out.println("- " + this.penumpang[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] penumpangAwal = {"Arifa", "Dwi"};
        Mobil mobil1 = new Mobil("N 2417 AY", "Wanto", penumpangAwal);
        System.out.println("===================================");
        mobil1.printInfoMobil();
        System.out.println();
        mobil1.hapusPenumpang("Arifa");
        mobil1.printInfoMobil();

        Mobil bis1 = new Mobil("B 1340 PRR", "Budi", penumpangAwal);
        bis1.tambahPenumpang("Sabina");
        System.out.println("===================================");
        bis1.printInfoMobil();
        System.out.println();
        bis1.hapusPenumpang("Dwi");
        bis1.printInfoMobil();
        System.out.println();

    }
}
