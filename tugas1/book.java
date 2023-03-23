package tugas1;

public class book {
    private String kategori;
    private String judul;
    private String penulis;
    private int jumlah;

    public void setKategori(String s){
        kategori = s;
    }
    public void setJudul(String s){
        judul = s;
    }
    public void setPenulis(String s){
        penulis = s;
    }
    public void setJumlah(int i){
        jumlah = i;
    }
    public void displayMessage(){
        System.out.println("Kategori Buku   : " + kategori);
        System.out.println("Judul Buku      : " + judul);
        System.out.println("Penulis         : " + penulis);
        System.out.println("Tersedia        : " + jumlah);
    }
    public String getKategori() {
        return kategori;
    }
    public String getJudul() {
        return judul;
    }
    public String getPenulis() {
        return penulis;
    }
    public int getJumlah() {
        return jumlah;
    } 
}

