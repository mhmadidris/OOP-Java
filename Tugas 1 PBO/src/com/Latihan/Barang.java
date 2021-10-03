package com.Latihan;

class Barang {
    String idProduk;
    String nama;
    double harga;

    // 3 parameter
    public Barang(String idProduk, String nama, double harga){
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    // 2 parameter
    public Barang(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;
    }

    // Method set
    void setNama (String nama) {
        this.nama = nama;
    }
    void setHarga (double harga) {
        this.harga = harga;
    }

    // Method get
    String getIdProduk () {
        return idProduk;
    }
    String getNama () {
        return nama;
    }
    double getHarga () {
        return harga;
    }
}


class BarangMain{
    public static void main(String[] args) {
        // data barang
        Barang brg1 = new Barang("BRG-001", "Tas Gucci");
        brg1.setHarga(1200);
        Barang brg2 = new Barang("BRG-002", "Printer Epson L355");
        brg2.setHarga(200);
        Barang brg3 = new Barang("BRG-003", "Koper", 150);
        Barang brg4 = new Barang("BRG-004", "Helm", 20);

        // menggunakan array
        String[] id = {brg1.getIdProduk(), brg2.getIdProduk(), brg3.getIdProduk(), brg4.getIdProduk()};
        String[] nm = {brg1.getNama(), brg2.getNama(), brg3.getNama(), brg4.getNama()};
        double[] hrg = {brg1.getHarga(), brg2.getHarga(), brg3.getHarga(), brg4.getHarga()};
        for (int i = 0; i < id.length; i++) {
            System.out.println(id[i] + "\t\t" + nm[i] + "\t\t\t" + hrg[i]);
        }

        // menghitung total harga
        double total = brg1.getHarga() + brg3.getHarga() + brg4.getHarga();
        System.out.println("\nTotal harga : " + (int)total);
    }
}