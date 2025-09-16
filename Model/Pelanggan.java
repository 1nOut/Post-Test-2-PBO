package model;

public class Pelanggan {
    private String nama;
    private int durasi;
    private int nomorPC;
    private int hargaPerJam = 6000;

    public Pelanggan(String nama, int durasi, int nomorPC) {
        this.nama = nama;
        this.durasi = durasi;
        this.nomorPC = nomorPC;
    }

    public String getNama() {
        return nama;
    }

    public int getDurasi() {
        return durasi;
    }

    public int getPcNomor() {
        return nomorPC;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public void setPcNomor(int pcNomor) {
        this.nomorPC = pcNomor;
    }

    public int getTotalBayar() {
        return durasi * hargaPerJam;
    }

    public String tampilData() {
        return "Nama: " + nama + 
               " | PC: " + nomorPC + 
               " | Durasi: " + durasi + " jam" + 
               " | Total: Rp" + getTotalBayar();
    }
}
