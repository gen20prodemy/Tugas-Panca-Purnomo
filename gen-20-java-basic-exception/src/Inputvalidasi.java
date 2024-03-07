
public class Inputvalidasi {
    // Exception menggunakan NumberFormatException
    static void pengecualianangka(String karakter) {
        try {
            int angka = Integer.parseInt(karakter);
            System.out.println(angka);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Salah format");
        }
    }

    // Exception menggunakan NullPointerException
    static void pengecualiankosong(String nama) {
        try {
            System.out.println("Hai " + nama.length());
        }
        catch (NullPointerException npe) {
            System.out.println("Tidak kenal");

        }
    }

    // Exception menggunakan ArrayIndexOutOfBoundsException
    static void pengecualianarray(int[] array) {
        try {
            System.out.println(array[5]);
        }
        catch (ArrayIndexOutOfBoundsException aio) {
            System.out.println("Indeks diluar jangkauan");
        }
        System.out.println("Selesai");
    }

    public static void main (String[] args) {
        String karakter = "password123";
        String nama = null;
        int[] array = {1, 2, 3};
        pengecualianangka(karakter);
        pengecualiankosong(nama);
        pengecualianarray(array);

    }
}
