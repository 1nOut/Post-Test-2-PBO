package service;

import model.Pelanggan;
import java.util.ArrayList;

public class Warnet {
    private final ArrayList<Pelanggan> daftar = new ArrayList<>();

    // Constructor
    public Warnet() {
        daftar.add(new Pelanggan("Andi", 2, 1));
        daftar.add(new Pelanggan("Budi", 4, 2));
        daftar.add(new Pelanggan("Citra", 1, 3));
        daftar.add(new Pelanggan("Dewi", 3, 4));
        daftar.add(new Pelanggan("Eko", 5, 5));
        daftar.add(new Pelanggan("Farah", 2, 6));
    }

    // CREATE
    public void tambahPelanggan(String nama, int durasi, int nomorPC) {
        daftar.add(new Pelanggan(nama, durasi, nomorPC));
        System.out.println("Data berhasil ditambahkan!");
    }

    // READ
    public void lihatPelanggan() {
        if (daftar.isEmpty()) {
            System.out.println("Belum ada data pelanggan.");
        } else {
            System.out.println("\n=== Daftar Pelanggan ===");
            for (int i = 0; i < daftar.size(); i++) {
                System.out.println((i + 1) + ". " + daftar.get(i).tampilData());
            }
        }
    }

    // UPDATE
    public void ubahPelanggan(int index, String namaBaru, int durasiBaru, int nomorPCBaru) {
        if (index >= 0 && index < daftar.size()) {
            daftar.set(index, new Pelanggan(namaBaru, durasiBaru, nomorPCBaru));
            System.out.println("Data berhasil diubah!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // DELETE
    public void hapusPelanggan(int index) {
        if (index >= 0 && index < daftar.size()) {
            daftar.remove(index);
            System.out.println("Data berhasil dihapus!");
        } else {
            System.out.println("Nomor tidak valid.");
        }
    }

    // SEARCH
    public void cariPelanggan(String keyword) {
        boolean ketemu = false;
        for (Pelanggan p : daftar) {
            if (p.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(p.tampilData());
                ketemu = true;
            }
        }
        if (!ketemu) {
            System.out.println("Pelanggan tidak ditemukan.");
        }
    }
}
