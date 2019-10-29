/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet9.abstractclass;

/**
 *
 * @author ASUS
 */
public class Program2_1841720155Fana {
    public static void main(String[] args){
        Rektor1841720155Fana pakRektor = new Rektor1841720155Fana();
        
        Mahasiswa1841720155Fana MahasiswaBiasa = new Mahasiswa1841720155Fana("Charlie");
        Sarjana1841720155Fana sarjanaCumlaude = new Sarjana1841720155Fana("Dini");
        PascaSarjana1841720155Fana masterCumlaude = new PascaSarjana1841720155Fana("Elok");
        
        MahasiswaBiasa.kuliahDikampusFana();
        pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
        sarjanaCumlaude.kuliahDikampusFana();
        pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
        masterCumlaude.kuliahDikampusFana();
        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
    }
}


