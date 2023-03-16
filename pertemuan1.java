import java.util.concurrent.CountDownLatch;

class buku {
    private String judul;
    private String penulis;
    private String kategori;
    private int jumlah;

    public void setjudul (string s){
        judul=s;
    }
    public void setpenulis (string s){
        penulis=s;
    }
    public void setjumlah (int i){
        jumlah=i;
    }
    public void setkategori (string s){
        kategori=s;
    }
    public void displayMassage(){
        System.out.println("Kategori buku" + kategori);
        System.out.println("Buku berjudul" + judul);
        System.out.println("Dengan penulis" + penulis);
        System.out.println("Jumlah buku" + jumlah);
    }
}
public class App{
    public static void main(String[] args) {
        buku satu = new buku();
        satu.setkategori("fiksi");
        satu.setjudul("Seni untuk bersikap bodo amat");
        satu.setpenulis("Toto");
        satu.setjumlah(1);

    }
}
    
