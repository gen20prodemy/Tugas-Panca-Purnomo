public class Obat extends Produk {
    public Obat(String namaproduk, double harga) {
        super(namaproduk, harga);
    }

    @Override
    public void tampilproduk() {
        super.tampilproduk();
        Kategoriproduk kategori = new Jenis();
        System.out.println("Kategori: "+ kategori.getNamakategori());
    }

}
