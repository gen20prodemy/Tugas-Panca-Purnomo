package Map.Main;

import Map.Interface.DataInterface;
import Map.POJO.DataSiswa;

import java.util.Scanner;

public class TambahData {

    private Scanner scan;
    private DataInterface<DataSiswa> dataInterface;

    public TambahData(Scanner scan, DataInterface<DataSiswa> dataInterface) {
        this.scan = scan;
        this.dataInterface = dataInterface;
    }

    public void execute() {
        System.out.println("Tambah Data Siswa");

        System.out.print("Masukkan NIS: ");
        //try {
        Integer nis = scan.nextInt();

        System.out.print("Masukkan nama: ");
        String nama = scan.next();

        System.out.print("Masukkan alamat: ");
        String alamat = scan.next();

        DataSiswa dataSiswa = new DataSiswa();
        dataSiswa.setNis(nis);
        dataSiswa.setNama(nama);
        dataSiswa.setAlamat(alamat);

        dataInterface.add(dataSiswa);
        System.out.println("Data dengan NIS " + nis + " berhasil ditambahkan!");
    }
}
