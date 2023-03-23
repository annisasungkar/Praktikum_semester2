package tugaspemlan1;

public class maincivitas {
    public static void main(String[] args) {
        //instansiasi 
        Dosen satu = new Dosen ("Adie Wijaya Alhusein", "Malang");
        satu.setNIDN(24610001);
        satu.setjabatan("Dosen S1 Ilmu Hukum");
        satu.displayDosen();

        Mahasiswa dua = new Mahasiswa("Ananda Annisa Sungkar", "Jakarta");
        dua.setNIM("225150701111033");
        dua.setIPK(3.9);
        dua.setSKS(20);
        dua.displayMahasiswa();

        Mahasiswa tiga = new Mahasiswa ("Yusuf Rahman Raafi", "Bandung");
        tiga.setNIM("225150701111042");
        tiga.setIPK(4.0);
        tiga.setSKS(20);
        tiga.displayMahasiswa();


        TenDik empat = new TenDik("Abdul Rohmat", "Nganjuk");
        empat.setnoInduk(4497);
        empat.setdivisi("Administrasi");
        empat.displayTendik();

        


    }
    
}
