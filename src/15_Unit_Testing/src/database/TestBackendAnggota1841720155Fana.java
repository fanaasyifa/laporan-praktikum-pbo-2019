package database;

import database.Anggota1841720155Fana;
import database.Kategori1841720155Fana;

public class TestBackendAnggota1841720155Fana {

    public static void main(String[] args) {
        Anggota1841720155Fana anggota1 = new Anggota1841720155Fana("Fana", "Landungsari", "085766566560");
        Anggota1841720155Fana anggota2 = new Anggota1841720155Fana("Udean", "Batu", "085331456789");
        Anggota1841720155Fana anggota3 = new Anggota1841720155Fana("Ella", "Kepanjen", "081445335267");
        
        anggota1.saveFana();
        anggota2.saveFana();
        anggota3.saveFana();
       
        // test update
        anggota2.setAlamatFana("Probolinggo");
        anggota2.saveFana();

        // test delete
        anggota3.deleteFana();

        // test select all
        for (Anggota1841720155Fana a : new Anggota1841720155Fana().getAllFana()) {
            System.out.println("Nama: " + a.getNamaFana()+ ", Alamat: " + a.getAlamatFana()
                    + ", Telepon: "+ a.getTeleponFana());
        }

        // test search
        for (Anggota1841720155Fana a : new Anggota1841720155Fana().searchFana("udean")) {
            System.out.println("Nama: " + a.getNamaFana()+ ", Alamat: " + a.getAlamatFana()
                    + ", Telepon: "+ a.getTeleponFana());
        }
    }
}
