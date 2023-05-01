package tugaspemlan2;
//Ananda Annisa Sungkar
//225150701111033

class lingkaran {
        private double jariJari;
    
        public lingkaran(double jariJari) {
            this.jariJari = jariJari;
        }
    
        public double getJariJari() {
            return jariJari;
        }
    
        public void setJariJari(double jariJari) {
            this.jariJari = jariJari;
        }

        public double hitungLuas() {
            return Math.PI * jariJari * jariJari;
        }

        public double diameter() {
            return jariJari*2;
        }
}
