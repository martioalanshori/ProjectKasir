package com.mycompany.kasirproject;

public class KasirProject {
    // 4. Enum Types: Mendefinisikan kategori produk
    enum KategoriProduk {
        MAKANAN("Makanan"), 
        MINUMAN("Minuman"), 
        ELEKTRONIK("Elektronik");

        private final String deskripsi;

        KategoriProduk(String deskripsi) {
            this.deskripsi = deskripsi;
        }

        public String getDeskripsi() {
            return deskripsi;
        }
    }

    static class Produk {
        // 1. Wrapper Class: Menggunakan Integer
        private String nama;
        private Integer harga; // 💡 Wrapper Class

        public Produk(String nama, int harga) {
            this.nama = nama;
            // 2. Autoboxing: Konversi primitif ke wrapper
            this.harga = harga; // 💡 Autoboxing
        }

        // 3. Unboxing: Mengonversi wrapper ke primitif
        public int getHarga() {
            return harga; // 💡 Unboxing otomatis
        }
    }

    public static void main(String[] args) {
        // Demonstrasi konsep
        Produk[] produk = {
            new Produk("Nasi Goreng", 25000),
            new Produk("Es Teh", 5000)
        };

        // Operasi dengan wrapper
        Integer totalBayar = 0; // 💡 Wrapper Class
        for (Produk p : produk) {
            totalBayar += p.getHarga(); // 💡 Autoboxing & Unboxing
        }

        System.out.println("Total Bayar: Rp " + totalBayar);
    }
}