package tugaspemlan4;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class antrean {
    public static void main(String[] args) {
        // Membuat objek HashMap untuk daftar angkot dan daftar bus
        HashMap<String, String> daftarAngkot = new HashMap<>();
        HashMap<String, String> daftarBus = new HashMap<>();

        // Menambahkan angkot ke dalam daftar angkot
        daftarAngkot.put("Angkot 1", "Rute A");
        daftarAngkot.put("Angkot 2", "Rute B");
        daftarAngkot.put("Angkot 3", "Rute C");

        // Menambahkan bus ke dalam daftar bus
        daftarBus.put("Bus 1", "Rute X");
        daftarBus.put("Bus 2", "Rute Y");
        daftarBus.put("Bus 3", "Rute Z");

        // Membuat objek Queue untuk antrian angkot dan antrian bus
        Queue<String> antrianAngkot = new LinkedList<>();
        Queue<String> antrianBus = new LinkedList<>();

        // Menambahkan angkot ke dalam antrian angkot
        antrianAngkot.add("Angkot 1");
        antrianAngkot.add("Angkot 2");
        antrianAngkot.add("Angkot 3");

        // Menambahkan bus ke dalam antrian bus
        antrianBus.add("Bus 1");
        antrianBus.add("Bus 2");
        antrianBus.add("Bus 3");

        // Menampilkan daftar angkot
        System.out.println("Daftar Angkot:");
        for (String angkot : daftarAngkot.keySet()) {
            System.out.println(angkot + " - " + daftarAngkot.get(angkot));
        }

        // Menampilkan daftar bus
        System.out.println("\nDaftar Bus:");
        for (String bus : daftarBus.keySet()) {
            System.out.println(bus + " - " + daftarBus.get(bus));
        }

        // Menampilkan antrian angkot
        System.out.println("\nAntrian Angkot:");
        for (String angkot : antrianAngkot) {
            System.out.println(angkot);
        }

        // Menampilkan antrian bus
        System.out.println("\nAntrian Bus:");
        for (String bus : antrianBus) {
            System.out.println(bus);
        }
    }
}
