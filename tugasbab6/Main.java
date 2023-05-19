package tugasbab6;

public class Main {
    public static void main(String[] args) {

        Manusia A = new Manusia("Alfath", true, "317107011122", true);
        System.out.println(A);
        System.out.println();

        Manusia B = new Manusia("Flava", false, "317107011133", true);
        System.out.println(B);
        System.out.println();

        Manusia C = new Manusia("Saca", false, "317107011155", false);
        System.out.println(C);
        System.out.println();

        MahasiswaFILKOM satu = new MahasiswaFILKOM("Claudia Caca", false, "317107005560", false, "225150701111011", 2.9);
        System.out.println(satu);
        System.out.println();

        MahasiswaFILKOM dua = new MahasiswaFILKOM("Rifadh Afdul", true, "317105403399", false, "2251507075477", 3.4);
        System.out.println(dua);
        System.out.println();

        MahasiswaFILKOM tiga = new MahasiswaFILKOM("Ananda Annisa Sungkar", false, "317104506794", false, "225150701111033", 3.9);
        System.out.println(tiga);
        System.out.println();

        Pekerja pekerja1 = new Pekerja("Yusri", true, "3171608956", true, 1000.0, 2, 2021, 3, 19);
        System.out.println(pekerja1);
        System.out.println();
    
        Pekerja pekerja2 = new Pekerja("Toto", true, "31710760897", false, 1000.0, 0, 2014, 4, 14);
        System.out.println(pekerja2);
        System.out.println();
    
        Pekerja pekerja3 = new Pekerja("Tata", false, "31710699873", true, 1000.0, 10, 2003, 5, 19);
        System.out.println(pekerja3);
        System.out.println();

        Manager D = new Manager("HRD", "Apri", true, "317106807431", true, 7500, 3, 2008, 1, 2);
        System.out.println(D);
        System.out.println();
    }
}
