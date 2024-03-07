public class Kategoriproduk {
    private String namakategori;

    public Kategoriproduk (String namakategori) {
        this.namakategori = namakategori;
    }

    //public void setNamakategori(String namakategori) { this.namakategori = namakategori;}
    public String getNamakategori () {
        return namakategori;
    }

    @Override
    public String toString() {
        return namakategori;
    }
}
