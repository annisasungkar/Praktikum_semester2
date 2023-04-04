package tugaspemlan2;

public class mainobjek1 {
    public static void main(String[] args) {
        lingkaran objekLingkaranKepala = new lingkaran(10);
        persegiPanjang objekPersegiPanjangBadan = new persegiPanjang(40, 80);
        persegiPanjang objekPersegiPanjangTanganKiri = new persegiPanjang(20, 60);
        persegiPanjang objekPersegiPanjangTanganKanan = new persegiPanjang(20, 60);
        lingkaran objekLingkaranTelapakTanganKiri = new lingkaran(5);
        lingkaran objekLingkaranTelapakTanganKanan = new lingkaran(5);
        persegiPanjang objekPersegiPanjangKakiKiri = new persegiPanjang(20, 70);
        persegiPanjang objekPersegiPanjangKakiKanan = new persegiPanjang(20, 70);
        lingkaran objekLingkaranTelapakKakiKiri = new lingkaran(5);
        lingkaran objekLingkaranTelapakKakiKanan = new lingkaran(5);
    
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
