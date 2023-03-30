package tugas3;

public class hero {
    private String name;
    private double hp;
    private double atk;

    public hero (String name, double hp, double atk){
        this.name = name;
        this.atk = atk;
        this.hp = hp;
    }
    
    public hero(){
    }
        public void setName (String name){
            this.name = name;
        }
        public void setAtk (double atk){
            this.atk = atk;
        }
        public void setHp (double hp){
            this.hp = hp;
        }
        public String getName(){
            return this.name;
        }
        public double getAtk(){
            return this.atk;
        }
        public double getHp(){
            return this.hp;
        }
    
    public void display(){
        System.out.println("Nama Hero     : " + this.name);
        System.out.println("Attack Hero   : " + this.atk);
        System.out.println("Hitpoint Hero : " + this.hp);
        System.out.println();
    }
    public void tanding (hero musuh){
        System.out.println(this.name + " menyerang " + musuh.name);
        System.out.println(musuh.name + " mendapat damage sebesar " + this.atk);

        musuh.menyerang(this.atk);
        System.out.println("hitpoint " + musuh.name + " tersisa " + musuh.hp);
        System.out.println();
        if(musuh.hp <= 0){
            System.out.println("==========HASIL PERTANDINGAN===========");
            System.out.println(musuh.name + " KALAH");
        }
    }
    public void menyerang(double atk){
        this.hp -= atk;
    }
}
