package main;

import service.Warnet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Warnet service = new Warnet();
        int pilihan = 0;

        do {
            System.out.println("\n=== WARNET GIMANG (6000/Jam)  ===");
            System.out.println("1. Tambah Pelanggan");
            System.out.println("2. Lihat Pelanggan");
            System.out.println("3. Ubah Data Pelanggan");
            System.out.println("4. Hapus Data Pelanggan");
            System.out.println("5. Cari Pelanggan");
            System.out.println("6. Keluar");

            // Validasi input menu
            System.out.print("Pilih menu: ");
            if (!input.hasNextInt()) {
                System.out.println("Input harus berupa angka!");
                input.nextLine(); // Membuang input salah
                continue;
            }

            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan < 1 || pilihan > 6) {
                System.out.println("Pilihan tidak valid. Silakan pilih angka 1-6.");
                continue;
            }

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = input.nextLine();

                    // Validasi durasi
                    System.out.print("Masukkan durasi (jam): ");
                    if (!input.hasNextInt()) {
                        System.out.println("Durasi harus berupa angka!");
                        input.nextLine();
                        break;
                    }
                    int durasi = input.nextInt();

                    // Validasi nomor PC
                    System.out.print("Masukkan nomor PC: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Nomor PC harus berupa angka!");
                        input.nextLine();
                        break;
                    }
                    int pcNomor = input.nextInt();
                    input.nextLine();

                    service.tambahPelanggan(nama, durasi, pcNomor);
                    break;

                case 2:
                    service.lihatPelanggan();
                    break;

                case 3:
                    service.lihatPelanggan();
                    System.out.print("Masukkan nomor pelanggan yang ingin diubah: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Nomor pelanggan harus berupa angka!");
                        input.nextLine();
                        break;
                    }
                    int noUbah = input.nextInt();
                    input.nextLine();

                    System.out.print("Nama baru: ");
                    String namaBaru = input.nextLine();

                    System.out.print("Durasi baru (jam): ");
                    if (!input.hasNextInt()) {
                        System.out.println("Durasi harus berupa angka!");
                        input.nextLine();
                        break;
                    }
                    int durasiBaru = input.nextInt();

                    System.out.print("Nomor PC baru: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Nomor PC harus berupa angka!");
                        input.nextLine();
                        break;
                    }
                    int pcNomorBaru = input.nextInt();
                    input.nextLine();

                    service.ubahPelanggan(noUbah - 1, namaBaru, durasiBaru, pcNomorBaru);
                    break;

                case 4:
                    service.lihatPelanggan();
                    System.out.print("Masukkan nomor pelanggan yang ingin dihapus: ");
                    if (!input.hasNextInt()) {
                        System.out.println("Nomor pelanggan harus berupa angka!");
                        input.nextLine();
                        break;
                    }
                    int noHapus = input.nextInt();
                    input.nextLine();
                    service.hapusPelanggan(noHapus - 1);
                    break;

                case 5:
                    System.out.print("Masukkan nama pelanggan yang dicari: ");
                    String keyword = input.nextLine();
                    service.cariPelanggan(keyword);
                    break;

                case 6:
                    System.out.println("Terima kasih, program selesai.");
                    break;
            }
        } while (pilihan != 6);

        input.close();
    }
}
