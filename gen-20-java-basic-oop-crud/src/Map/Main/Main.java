package Map.Main;

import Map.Interface.DataInterface;
import Map.Interface.MapDataInterface;
import Map.POJO.DataSiswa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DataInterface<DataSiswa> dataInterface = new MapDataInterface();

        while (true) {
            menu();
            int pilihan = scan.nextInt();

            switch (pilihan) {
                case 1:
                    new TambahData(scan, dataInterface).execute();
                    break;
                case 2:
                    new LihatData(scan, dataInterface).execute();
                    break;
                case 3:
                    new UbahData(scan, dataInterface).execute();
                    break;
                case 4:
                    new HapusData(scan, dataInterface).execute();
                    break;
                case 5:
                    System.out.println("Selesai");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    private static void menu() {
        System.out.println(" CRUD Data Siswa ");
        System.out.println("1. Tambah Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Ubah Data");
        System.out.println("4. Hapus Data");
        System.out.println("5. Keluar");
        System.out.print("Pilih operasi: ");
    }
}
