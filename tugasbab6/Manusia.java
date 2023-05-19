package tugasbab6;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String NIK;
    private boolean menikah;

    public Manusia (String nama, boolean jenisKelamin, String NIK, boolean menikah){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.NIK = NIK;
        this.menikah = menikah;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setjenisKelamin(boolean jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    public void setNIK(String NIK){
        this.NIK = NIK;
    }
    public void setMenikah(boolean menikah){
        this.menikah = menikah;
    }
    public String getNama() {
        return nama;
    }
    public String getjenisKelamin(){
        return jenisKelamin == true ? "Laki-laki" : "Perempuan";
    }
    public String getNIK(){
        return NIK;
    }
    public boolean getmenikah(){
        return menikah;
    }

    public double getTunjangan(){
        double tunjangan = 0;
        if (menikah){
            if(jenisKelamin){
                tunjangan = 25;
            } else {
                tunjangan = 20;
            }
        } else {
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return ("Nama\t\t  : " + getNama() + "\nNIK\t\t  : " + getNIK() + "\nJenis kelamin\t  : " + getjenisKelamin() + "\nJumlah pendapatan : " + getPendapatan() + " $");
    }
}
