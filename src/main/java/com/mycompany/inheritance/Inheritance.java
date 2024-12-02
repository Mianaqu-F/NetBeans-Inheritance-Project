/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritance;

/**
 *
 * @author micha
 */
public class Inheritance {
    // Kelas induk
    static class Hewan {
        private String nama;
        private int umur;

        public Hewan(String nama, int umur) {
            this.nama = nama;
            this.umur = umur;
        }

        public void infoHewan() {
            System.out.println("Nama: " + nama);
            System.out.println("Umur: " + umur + " tahun");
        }
    }

    // Kelas anak: Kucing
    static class Kucing extends Hewan {
        private String jenisBulu;

        public Kucing(String nama, int umur, String jenisBulu) {
            super(nama, umur);
            this.jenisBulu = jenisBulu;
        }

        @Override
        public void infoHewan() {
            super.infoHewan();
            System.out.println("Jenis Bulu: " + jenisBulu);
        }
    }

    // Kelas anak: Anjing
    static class Anjing extends Hewan {
        private String ras;

        public Anjing(String nama, int umur, String ras) {
            super(nama, umur);
            this.ras = ras;
        }

        @Override
        public void infoHewan() {
            super.infoHewan();
            System.out.println("Ras: " + ras);
        }
    }

    // Method utama
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Milo", 2, "Anggora");
        Hewan anjing = new Anjing("Rex", 4, "Golden Retriever");

        System.out.println("== Informasi Kucing ==");
        kucing.infoHewan();

        System.out.println("\n== Informasi Anjing ==");
        anjing.infoHewan();
    }
}

