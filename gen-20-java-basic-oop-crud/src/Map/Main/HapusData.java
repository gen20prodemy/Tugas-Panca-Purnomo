package Map.Main;

import Map.Interface.DataInterface;
import Map.POJO.DataSiswa;

import java.util.Scanner;

public class HapusData {

    private Scanner scan;
    private DataInterface<DataSiswa> dataInterface;

    public HapusData(Scanner scan, DataInterface<DataSiswa> dataInterface) {
        this.scan = scan;
        this.dataInterface = dataInterface;
    }

    public void execute() {
        System.out.println("Hapus Data Siswa");

        System.out.print("Masukkan NIS: ");
        Integer nis = scan.nextInt();

        DataSiswa dataSiswa = dataInterface.get(nis);

        if (dataSiswa != null) {
            System.out.println("Data ditemukan!");

            System.out.print("Yakin ingin menghapus data dengan NIS " + nis + " y(ya)? ");
            String konfirmasi = scan.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                dataInterface.delete(nis);
                System.out.println("Data dengan NIS " + nis + " berhasil dihapus!");
            } else {
                System.out.println("Penghapusan data dibatalkan!");
            }
        } else {
            System.out.println("Data dengan NIS " + nis + " tidak ditemukan!");
        }
    }
}
