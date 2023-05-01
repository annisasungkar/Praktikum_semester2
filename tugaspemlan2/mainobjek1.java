package tugaspemlan2;

public class mainobjek1 {
    public static void main(String[] args) {
        lingkaran objekLingkaranKepala = new lingkaran(14);
        persegiPanjang objekPersegiPanjangBadan = new persegiPanjang(40, 60);
        persegiPanjang objekPersegiPanjangTanganKiri = new persegiPanjang(20, 50);
        persegiPanjang objekPersegiPanjangTanganKanan = new persegiPanjang(20, 50);
        lingkaran objekLingkaranTelapakTanganKiri = new lingkaran(7);
        lingkaran objekLingkaranTelapakTanganKanan = new lingkaran(7);
        persegiPanjang objekPersegiPanjangKakiKiri = new persegiPanjang(20, 70);
        persegiPanjang objekPersegiPanjangKakiKanan = new persegiPanjang(20, 70);
        lingkaran objekLingkaranTelapakKakiKiri = new lingkaran(7);
        lingkaran objekLingkaranTelapakKakiKanan = new lingkaran(7);
    
        double luasTotal = objekLingkaranKepala.hitungLuas()
                    + objekPersegiPanjangBadan.hitungLuas()
                    + objekPersegiPanjangTanganKiri.hitungLuas()
                    + objekPersegiPanjangTanganKanan.hitungLuas()
                    + objekLingkaranTelapakTanganKiri.hitungLuas()
                    + objekLingkaranTelapakTanganKanan.hitungLuas()
                    + objekPersegiPanjangKakiKiri.hitungLuas()
                    + objekPersegiPanjangKakiKanan.hitungLuas()
                    + objekLingkaranTelapakKakiKiri.hitungLuas()
                    + objekLingkaranTelapakKakiKanan.hitungLuas();

        double tinggiBadanRobot = objekLingkaranTelapakKakiKanan.diameter()
                    + objekPersegiPanjangKakiKanan.getPanjang()
                    + objekPersegiPanjangBadan.getPanjang()
                    + objekLingkaranKepala.diameter();

        System.out.println();
        System.out.println("Luas Total Robot = " + luasTotal + "cm");
        System.out.println("Tinggi Badan Robot = " + tinggiBadanRobot +"cm");
        System.out.println();
    } 
}
