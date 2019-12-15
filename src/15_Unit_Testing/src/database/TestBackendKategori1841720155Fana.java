package database;

import database.Kategori1841720155Fana;

public class TestBackendKategori1841720155Fana {

    public static void main(String[] args) {
        Kategori1841720155Fana kat1 = new Kategori1841720155Fana("Novel", "Koleksi buku novel");
        Kategori1841720155Fana kat2 = new Kategori1841720155Fana("Referensi", "Buku referensi ilmiah");
        Kategori1841720155Fana kat3 = new Kategori1841720155Fana("Komik", "Komik anak-anak");

        // test insert
        kat1.saveFana();
        kat2.saveFana();
        kat3.saveFana();

        // test update
        kat2.setKeteranganFana("Buku referensi");
        kat2.saveFana();

        // test delete
        kat3.deleteFana();
//
        // test select all
        for (Kategori1841720155Fana k : new Kategori1841720155Fana().getAllFana()) {
            System.out.println("Nama: " + k.getNamaFana()+ ", Ket: " + k.getKeteranganFana());
        }

        // test search
        for (Kategori1841720155Fana k : new Kategori1841720155Fana().searchFana("ilmiah")) {
            System.out.println("Nama: " + k.getNamaFana()+ ", Ket: " + k.getKeteranganFana());
        }
    }
}
