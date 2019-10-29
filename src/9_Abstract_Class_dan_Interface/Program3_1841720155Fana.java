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
public class Program3_1841720155Fana {
    public static void main(String[] args){
        Rektor1841720155Fana pakRektor = new Rektor1841720155Fana();
        
        //Mahasiswa1841720155Fana MahasiswaBiasa = new Mahasiswa1841720155Fana("Charlie");
        Sarjana1841720155Fana sarjanaCumlaude = new Sarjana1841720155Fana("Dini");
        Pascasarjana2_1841720155Fana masterCumlaude = new Pascasarjana2_1841720155Fana("Elok");
        
        //MahasiswaBiasa.kuliahDikampusLintang();
        //pakRektor.beriSertifikatCumlaude(masterCumlaude);
        //sarjanaCumlaude.kuliahDikampusLintang();
        //pakRektor.beriSertifikatCumlaude(MahasiswaBiasa);
        //masterCumlaude.kuliahDikampusLintang();
        //pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
        
        pakRektor.beriSertifikatMawapresFana(masterCumlaude);  
    }
}
