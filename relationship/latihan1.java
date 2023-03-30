package relationship;

import javax.lang.model.util.ElementScanner14;

class mobil {
    orang driver;
    public mobil (String driverName, String driverSIM){
        this.driver.nama = driverName;
        this.driver.sim = driverSIM;
    }
}
    class angkot extends mobil{

        public angkot(String driverName, String driverSIM) {
            super(driverName, driverSIM);
            //TODO Auto-generated constructor stub
        }
    }
    class bus extends mobil{

        public bus(String driverName, String driverSIM) {
            super(driverName, driverSIM);
            //TODO Auto-generated constructor stub
        }

    }


class orang {
    String sim;
    String naikAngkot;
    String naikBus;

    // public static void main(String[] args) {
    //     orang[] s = new orang[3];

    //     s[0] = new orang();
    //     s[0].setnama("Toto");
    //     s[0].setsim("A");

    //     s[1] = new orang();
    //     s[1].setnama("Udin");
    //     s[1].setsim("C");
    // }

    // private void setnama(String string) {
    // }

    // private void setsim(String string) {
    // }

}
    class driverBus extends orang{
        if (sim = "B"){
            System.out.println("Lulus");
        }
        else{
            System.out.println("Tidak lulus");
        }

    }
    class driverAngkot extends orang{
        if(sim="A"){
            System.out.println("Lulus");
        }
        else {
            System.out.println("Tidak lulus");
        }

    }
    class penumpang extends orang{
        public static void main(String[] args) {
            penumpang[] s = new penumpang[2];
            s[0] = new penumpang();
            s[0].setNama("Toto");

            s[1] = new penumpang();
            s[1].setNama("Udin");

            s[2] = new penumpang();
            s[2].setNama("Qori");


            
            //     orang[] s = new orang[3];
        
            //     s[0] = new orang();
            //     s[0].setnama("Toto");
            //     s[0].setsim("A");
        
            //     s[1] = new orang();
            //     s[1].setnama("Udin");
            //     s[1].setsim("C");
            // }
        }
        private void setNama(String string) {
        }
    }



public class latihan1 {
    // System.out.println("=======================================================================================");
    //     System.out.println("Kategori Buku       : " + kategori);
    //     System.out.println("Judul Buku          : " + judul);
    //     System.out.println("Penulis             : " + penulis);
    //     System.out.println("Tersedia            : " + jumlahBuku);
    //     System.out.println("Sinopsis            : " + sinopsis);
    //     System.out.println("Total Kata Sinopsis : " + jumlahKataSinopsis);
    //     System.out.println("=======================================================================================");
}
