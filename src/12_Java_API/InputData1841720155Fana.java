/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet12.percobaan4;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class InputData1841720155Fana {
    ArrayList<Mahasiswa1841720155Fana> ListMahasiswa;

    public InputData1841720155Fana() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataFana(String Nim, String Nama, String Alamat) {
        Mahasiswa1841720155Fana mhs = new Mahasiswa1841720155Fana(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720155Fana> getDataFana() {
        return ListMahasiswa;
    }
}
