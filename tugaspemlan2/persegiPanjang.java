package tugaspemlan2;

public class persegiPanjang {
        private double panjang;
        private double lebar;
    
        public persegiPanjang(double panjang, double lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }
    
        public double getPanjang() {
            return panjang;
        }
    
        public void setPanjang(double panjang) {
            this.panjang = panjang;
        }
    
        public double getLebar() {
            return lebar;
        }
    
        public void setLebar(double lebar) {
            this.lebar = lebar;
        }
    
        public double hitungLuas() {
            return panjang * lebar;
        }
}
