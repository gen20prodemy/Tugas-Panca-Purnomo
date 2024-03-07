import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Keranjang {

    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);

        // Mendaftar nama buah
        ArrayList<Beli> daftarbuah = new ArrayList<>();
        System.out.println("Masukkan nama buah: ");
        String namabuah;
        while(true) {
            namabuah = scan.nextLine();
            if (namabuah.isEmpty()) {
                break;
            }
            daftarbuah.add(new Beli(namabuah));
        }

        // Menampilkan daftar nama buah
        System.out.println("Daftar Buah yang dibeli: ");
        // Iterasi
        for (Beli buah : daftarbuah) {
            System.out.println(buah.getNamabuah());
        }

        // Menampilkan salah satu nama buah
        System.out.println("Nomor buah dari daftar: ");
        int nomor;
        try {
            nomor = scan.nextInt();
            Beli nomorbuah = daftarbuah.get(nomor);
            System.out.println();
            System.out.println("Salah satu buah yang dibeli: " + nomorbuah.getNamabuah());
        }
        catch (IndexOutOfBoundsException iob) {
            System.out.println("Indeks di luar jangkauan");
        }

        // Mengubah ArrayList ke HashSet
        HashSet<Beli> hashsetbuah = new HashSet<>(daftarbuah);

        // Menampilkan nama buah dari HashSet
        System.out.println("Daftar buah: ");
        for (Beli buah : hashsetbuah) {
            System.out.println(buah.getNamabuah());
        }

    }
}
