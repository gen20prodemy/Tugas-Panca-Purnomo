package Map.Main;

import Map.Interface.DataInterface;
import Map.POJO.DataSiswa;

import java.util.Scanner;

public class UbahData {

    private Scanner scan;
    private DataInterface<DataSiswa> dataInterface;

    public UbahData(Scanner scan, DataInterface<DataSiswa> dataInterface) {
        this.scan = scan;
        this.dataInterface = dataInterface;
    }

    public void execute() {
        System.out.println("Ubah Data Siswa");

        System.out.print("Masukkan NIS: ");
        Integer nis = scan.nextInt();

        DataSiswa dataSiswa = dataInterface.get(nis);

        if (dataSiswa != null) {
            System.out.println("Data ditemukan!");

            System.out.print("Masukkan nama baru (tekan enter untuk tidak mengubah): ");
            String namaBaru = scan.next();

            System.out.print("Masukkan alamat baru (tekan enter untuk tidak mengubah): ");
            String alamatBaru = scan.next();

            if (!namaBaru.isEmpty()) {
                dataSiswa.setNama(namaBaru);
            }

            if (!alamatBaru.isEmpty()) {
                dataSiswa.setAlamat(alamatBaru);
            }

            dataInterface.update(nis, dataSiswa);
            System.out.println("Data dengan NIS " + nis + " berhasil diubah!");
        } else {
            System.out.println("Data dengan NIS " + nis + " tidak ditemukan!");
        }
    }
}
