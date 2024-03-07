public class Produk {
    private String namaproduk;
    private double harga;

    public Produk(String namaproduk, double harga) {
        this.namaproduk = namaproduk;
        this.harga = harga;
    }

    public void setNamaproduk(String namaproduk) { this.namaproduk = namaproduk; }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getNamaproduk() {
        return namaproduk;
    }

    public double getHarga() {
        return getHarga();
    }

    public void tampilproduk() {
        System.out.println("Nama produk: " + namaproduk);
        System.out.println("Harga: " + harga);
    }

}
