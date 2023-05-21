package PRAKTIKUM_BAB7;

public class Main {
    public static void main(String[] args) {
        Kue[] kueList = new Kue[20];

        kueList[0] = new KuePesanan("Ulang tahun", 75000, 1.5);
        kueList[1] = new KueJadi("Brownies", 40000, 10);
        kueList[2] = new KueJadi("Pie Susu", 25000, 22);
        kueList[3] = new KueJadi("Kue Chiffon", 50000, 15);
        kueList[4] = new KuePesanan("Kue Muffin", 7000, 0.3);
        kueList[5] = new KuePesanan("Cup Cake", 15000, 0.5);
        kueList[6] = new KueJadi("Donat Kentang", 7000, 10);
        kueList[7] = new KuePesanan("Kue Sus", 4000, 0.4);
        kueList[8] = new KueJadi("Kue Lumpur", 3000, 10);
        kueList[9] = new KuePesanan("Cheese Cake", 45000, 0.6);
        kueList[10] = new KueJadi("Pancake", 11000, 5);
        kueList[11] = new KuePesanan("Martabak Mini", 3500, 0.4);
        kueList[12] = new KueJadi("Bika Ambon", 40000, 4);
        kueList[13] = new KueJadi("Marmer Cake", 42000, 8);
        kueList[14] = new KuePesanan("Serabi ", 5000, 0.3);
        kueList[15] = new KuePesanan("Lapis Legit", 102000, 1.5);
        kueList[16] = new KueJadi("Nagasari", 2500, 17);
        kueList[17] = new KuePesanan("Gemblong", 1500, 0.2);
        kueList[18] = new KuePesanan("Soes Coklat", 4000, 0.3);
        kueList[19] = new KueJadi("Macaroon", 11000, 13);

        double totalHarga = 0;
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        Kue kueHargaTerbesar = null;

        System.out.println();
        System.out.println("LIST PESANAN KUE");
        System.out.println();

        for (Kue kue : kueList) {
            if (kue == null || !(kue instanceof KuePesanan)) {
                continue;
            }

            System.out.println(kue);
            System.out.println("");
            double hargaKue = kue.hitungHarga();
            totalHarga += hargaKue;
            totalHargaKuePesanan += hargaKue;
            KuePesanan kuePesanan = (KuePesanan) kue;
            totalBeratKuePesanan +=
            kuePesanan.getBerat();

            if (kueHargaTerbesar == null || hargaKue > kueHargaTerbesar.hitungHarga()) {
                kueHargaTerbesar = kue;
            }
        }
        
        System.out.println("Kue Jadi:");

        for (Kue kue : kueList) {
          if (kue == null || !(kue instanceof KueJadi)) {
            continue;
          }

          System.out.println(kue);
          System.out.println("");
          double hargaKue = kue.hitungHarga();
          totalHarga += hargaKue;
          totalHargaKueJadi += hargaKue;
          KueJadi kueJadi = (KueJadi) kue;
          totalJumlahKueJadi += kueJadi.getJumlah();

          if (kueHargaTerbesar == null || hargaKue > kueHargaTerbesar.hitungHarga()) {
                kueHargaTerbesar = kue;
          }
        }

        System.out.println("============================================");
        System.out.println("Total Harga\t\t\t: " + totalHarga);
        System.out.println("Total Harga Kue Pesanan\t\t: " + totalHargaKuePesanan + "\nTotal Berat Kue Pesanan\t\t: " + totalBeratKuePesanan);
        System.out.println("Total Harga Kue Jadi\t\t: " + totalHargaKueJadi + "\nTotal Jumlah Kue Jadi\t\t: " + totalJumlahKueJadi);
        System.out.println("Kue dengan Harga Akhir Terbesar\t: " + kueHargaTerbesar.getNama() +"\nDengan Harga Total\t\t: " + kueHargaTerbesar.hitungHarga());
        System.out.println("============================================");

    }
}
