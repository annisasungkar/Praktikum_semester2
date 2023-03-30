package tugas3;

import java.util.Scanner;

public class mainhero {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("======================================");
        System.out.println("         PERMAINAN ADU HERO ");
        System.out.println("======================================");

        hero satu = new hero ();
        System.out.print("Masukkan nama hero 1     : ");
        satu.setName(input.nextLine());
        System.out.print("Masukkan attack hero 1   : ");
        satu.setAtk(input.nextDouble());
        System.out.print("Masukkan hitpoint hero 1 : ");
        satu.setHp(input.nextDouble());
        System.out.println();
        System.out.println("=============INFO HERO 1==============");
        satu.display();

        System.out.print("Masukkan nama hero 2     : ");
        String name = input.next();
        System.out.print("Masukkan attack hero 2   : ");
        double atk = input.nextDouble();
        System.out.print("Masukkan hitpoint hero 2 : ");
        double hp = input.nextDouble();
        System.out.println();
        System.out.println("==============INFO HERO 2==============");
        hero dua = new hero(name, atk, hp);
        dua.display();

        int i = 1;
        while (satu.getHp() > 0 && dua.getHp() > 0){
            System.out.println("==============RONDE KE-" + i++ + "===============");
            satu.tanding(dua);
            if(dua.getHp() > 0){
                dua.tanding(satu);
            }

        }
        if(satu.getHp() <= 0){
            akhir(dua.getName());
        }
        else {
            akhir(satu.getName());
        }
    }
    public static void akhir (String name){
        System.out.println(name + " MENANG");
        System.out.println();
        System.out.println("[Pertandingan telah selesai]");
        System.out.println();
    }
}
