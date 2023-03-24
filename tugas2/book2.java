package tugas2;

class book2 {
    public String kategori;
    public String judul;
    public String penulis;
    public String sinopsis;
    public int jumlahBuku;
    public int jumlahKataSinopsis;

    public book2 (String kategori, String judul, String penulis, int jumlahBuku, String sinopsis){
        this.kategori = kategori;
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
        this.jumlahBuku = jumlahBuku;
        this.jumlahKataSinopsis = jumlahKataSinopsis(sinopsis);
    }
    public int jumlahKataSinopsis(String text){
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+");
        return words.length;
    }
    public book2 copy() {
        book2 copy = new book2(kategori, judul, penulis, jumlahBuku, sinopsis);
        return copy;
    }
    public void displayMessage(){
        System.out.println("=======================================================================================");
        System.out.println("Kategori Buku       : " + kategori);
        System.out.println("Judul Buku          : " + judul);
        System.out.println("Penulis             : " + penulis);
        System.out.println("Tersedia            : " + jumlahBuku);
        System.out.println("Sinopsis            : " + sinopsis);
        System.out.println("Total Kata Sinopsis : " + jumlahKataSinopsis);
        System.out.println("=======================================================================================");
    }
}