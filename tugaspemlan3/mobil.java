package tugaspemlan3;

class mobil {
    protected String nopol;
    protected String driver;
    protected int kapasitas;

    public String getnoPol(){
        return nopol;
    }
    public int getKapasitas(){
        return kapasitas;
    }
}
class person{
    private String nama;

    public person(){

    }
    public person(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
}
class angkot extends mobil{
    private penumpang[] daftarPenumpang;

    public angkot (String nopol, String driver, int kapasitas){
        this.nopol = nopol;
        this.driver = driver;
        this.kapasitas = kapasitas;

    }
}