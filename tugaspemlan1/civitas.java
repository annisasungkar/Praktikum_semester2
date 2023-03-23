package tugaspemlan1;

// Ananda Annisa Sungkar (225150701111033)

class civitas{
    public String nama;
    public String asal;
    
    public civitas (String nama, String asal){
        this.nama = nama;
        this.asal = asal;
    }
}
class Dosen extends civitas{
    private int NIDN;
    private String jabatan;

    public Dosen(String nama, String asal) {
        super(nama,asal);
    }
    //setter
    public void setNIDN(int NIDN){
        this.NIDN = NIDN;
    }
    public void setjabatan(String jabatan){
        this.jabatan=jabatan;
    }
    //getter
    public int getNIDN() {
        return NIDN;
    }
    public String getjabatan(){
        return jabatan;
    }
    public void displayDosen(){
        System.out.println("==========================================");
        System.out.println("Nama Lengkap      : " + nama);
        System.out.println("Asal Daerah       : " + asal);
        System.out.println("NIDN              : " + NIDN);
        System.out.println("Jabatan           : " + jabatan);
        System.out.println("==========================================");
        System.out.println();
     }
}
class Mahasiswa extends civitas{
    private String NIM;
    private double IPK;
    private int SKS;

    public Mahasiswa(String nama, String asal) {
        super(nama, asal);
    }
    //setter
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    public void setIPK(double IPK){
        this.IPK = IPK;
    }
    public void setSKS(int SKS){
        this.SKS = SKS;
    }
    //getter
    public String getNIM() {
        return NIM;
    }
    public double getIPK(){
        return IPK;
    }
    public int getSKS(){
        return SKS;
    }
    public void displayMahasiswa(){
        System.out.println("==========================================");
        System.out.println("Nama Lengkap      : " + nama);
        System.out.println("Asal Daerah       : " + asal);
        System.out.println("NIM               : " + NIM);
        System.out.println("IPK               : " + IPK);
        System.out.println("Jumlah SKS        : " + SKS);
        System.out.println("==========================================");
        System.out.println();
    }
}
class TenDik extends civitas{
    private int noInduk;
    private String divisi;

    public TenDik(String nama, String asal) {
        super(nama, asal);
    }
    //setter
    public void setnoInduk(int noInduk){
        this.noInduk = noInduk;
    }
    public void setdivisi(String divisi){
        this.divisi = divisi;
    }
    //getter
    public int getnoInduk() {
        return noInduk;
    }
    public String getdivisi(){
        return divisi;
    }
    public void displayTendik(){
        System.out.println("==========================================");
        System.out.println("Nama Lengkap      : " + nama);
        System.out.println("Asal Daerah       : " + asal);
        System.out.println("Nomor Induk       : " + noInduk);
        System.out.println("Divisi            : " + divisi);
        System.out.println("==========================================");
        System.out.println();
    }
}