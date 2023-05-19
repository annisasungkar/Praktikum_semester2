package tugas4;

public class hargaJaket {
    private static final int HARGA_A = 100000;
    private static final int HARGA_B = 125000;
    private static final int HARGA_C = 175000;

    public static int hitungHarga(String tipeJaket, int jumlah) {
        int hargaJaket = 0;

        switch (tipeJaket) {
            case "A":
                hargaJaket = HARGA_A;
                if (jumlah > 100) {
                    hargaJaket = 95000;
                }
                break;
            case "B":
                hargaJaket = HARGA_B;
                if (jumlah > 100) {
                    hargaJaket = 120000;
                }
                break;
            case "C":
                hargaJaket = HARGA_C;
                if (jumlah > 100) {
                    hargaJaket = 160000;
                }
                break;
            default:
                System.out.println("Tipe jaket tidak valid.");
                break;
        }

        return hargaJaket * jumlah;
    }
    public static void main(String[] args) {
        int totalHarga = hitungHarga("A", 50);
        System.out.println("Total harga jaket A (50 buah): Rp." + totalHarga);
    
        totalHarga = hitungHarga("B", 150);
        System.out.println("Total harga jaket B (150 buah): Rp." + totalHarga);
    
        totalHarga = hitungHarga("C", 200);
        System.out.println("Total harga jaket C (200 buah): Rp." + totalHarga);
    }
}