public class Main {
    public static void main(String[] args) {
        Jenis jenis = new Jenis();
        Obat tablet = new Obat("Panadol", 15000);
        Obat botol = new Obat("Paracetamol", 5000);
        tablet.tampilproduk();
        System.out.println();
        botol.tampilproduk();
        System.out.println();

    }
}
