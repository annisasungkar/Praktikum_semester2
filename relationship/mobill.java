package relationship;

public class mobill {
    private String nomorPolisi;
    private String driver;
    private Penumpang[] penumpang;

    public mobill(String nomorPolisi, String driver, int jumlahPenumpang) {
        this.nomorPolisi = nomorPolisi;
        this.driver = driver;
        this.penumpang = new Penumpang[jumlahPenumpang];
    }

    public String getNomorPolisi() {
        return this.nomorPolisi;
    }

    public String getDriver() {
        return this.driver;
    }

    public Penumpang[] getPenumpang() {
        return this.penumpang;
    }

    public void tambahPenumpang(Penumpang penumpangBaru) {
        for (int i = 0; i < this.penumpang.length; i++) {
            if (this.penumpang[i] == null) {
                this.penumpang[i] = penumpangBaru;
                break;
            }
        }
    }

    public void hapusPenumpang(String namaPenumpang) {
        for (int i = 0; i < this.penumpang.length; i++) {
            if (this.penumpang[i] != null && this.penumpang[i].getNama().equals(namaPenumpang)) {
                this.penumpang[i] = null;
                break;
            }
        }
    }

    public void printInfoKendaraan() {
        System.out.println("Nomor Polisi: " + this.nomorPolisi);
        System.out.println("Driver: " + this.driver);
        System.out.println("Penumpang: ");
        for (int i = 0; i < this.penumpang.length; i++) {
            if (this.penumpang[i] != null) {
                System.out.println("- " + this.penumpang[i].getNama() + " (" + this.penumpang[i].getTujuan() + ")");
            }
        }
    }

    public static void main(String[] args) {
        mobill angkot1 = new mobill("B 1234 ABC", "John Doe", 10);
        Penumpang penumpang1 = new Penumpang("Jane Doe", "Universitas A");
        angkot1.tambahPenumpang(penumpang1);
        angkot1.printInfoKendaraan();
        angkot1.tambahPenumpang(new Penumpang("Bob Smith", "Kantor B"));
        angkot1.printInfoKendaraan();
        angkot1.hapusPenumpang("Jane Doe");
        angkot1.printInfoKendaraan();

        mobill bis1 = new mobill("B 5678 DEF", "Alice Johnson", 20);
        bis1.tambahPenumpang(new Penumpang("Charlie Brown", "Stasiun C"));
        bis1.printInfoKendaraan();
        bis1.tambahPenumpang(new Penumpang("Dave Williams", "Bandara D"));
        bis1.printInfoKendaraan();
        bis1.hapusPenumpang("Charlie Brown");
        bis1.printInfoKendaraan();
    }
}

class Penumpang {
    private String nama;
    private String tujuan;

    public Penumpang(String nama, String tujuan) {
        this.nama = nama;
        this.tujuan = tujuan;
    }

