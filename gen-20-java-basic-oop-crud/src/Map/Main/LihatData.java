package Map.Main;

import Map.Interface.DataInterface;
import Map.POJO.DataSiswa;

import java.util.Scanner;

public class LihatData {

    private Scanner scan;
    private DataInterface<DataSiswa> dataInterface;

    public LihatData(Scanner scan, DataInterface<DataSiswa> dataInterface) {
        this.scan = scan;
        this.dataInterface = dataInterface;
    }

    public void execute() {
        System.out.println("Lihat Data Siswa");

        System.out.print("Masukkan NIS: ");
        Integer nis = scan.nextInt();

        DataSiswa dataSiswa = dataInterface.get(nis);

        if (dataSiswa != null) {
            System.out.println("NIS: " + dataSiswa.getNis());
            System.out.println("Nama: " + dataSiswa.getNama());
            System.out.println("Alamat: " + dataSiswa.getAlamat());
        } else {
            System.out.println("Data dengan NIS " + nis + " tidak ditemukan!");
        }
    }
}
