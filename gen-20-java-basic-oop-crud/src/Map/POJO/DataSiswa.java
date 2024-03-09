package Map.POJO;

public class DataSiswa {
    private Integer nis;
    private String nama;
    private String alamat;

    //Set
    public void setNis(Integer nis) {
        this.nis = nis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    //Get
    public Integer getNis() {
        return nis;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

}
