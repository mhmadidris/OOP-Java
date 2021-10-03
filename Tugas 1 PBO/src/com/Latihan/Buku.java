package com.Latihan;

public class Buku {
    String judul;
    String pengarang;
    double harga;
    Buku(String judul, String pengarang, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    // Method set
    void setJudul(String judul) {
        this.judul = judul;
    }
    void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }
    void  setHarga(double harga) {
        this.harga = harga;
    }

    // Method get
    String getJudul() {
        return  judul;
    }
    String getPengarang() {
        return pengarang;
    }
    double getHarga() {
        return harga;
    }
}

class BukuMain{
    public static void main(String[] args) {
        // data buku
        Buku bk1 = new Buku("Harry Potter", "J.K.Rowling", 300000);
        Buku bk2 = new Buku("UML", "Ivar Jacobson", 400000);

        // Print buku 1
        System.out.println("Buku 1");
        System.out.println("Judul : " + bk1.getJudul());
        System.out.println("Pengarang : " + bk1.getPengarang());
        System.out.println("Pengarang : " + (int)bk1.getHarga());

        // Print buku 2
        System.out.println("\nBuku 2");
        System.out.println("Judul : " + bk2.getJudul());
        System.out.println("Pengarang : " + bk2.getPengarang());
        System.out.println("Pengarang : " + (int)bk2.getHarga());
    }
}
