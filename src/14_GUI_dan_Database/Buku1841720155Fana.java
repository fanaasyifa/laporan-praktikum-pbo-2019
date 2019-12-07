/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Unero
 */
public class Buku1841720155Fana {
    private int idbuku;
    private Kategori1841720155Fana kategori = new Kategori1841720155Fana();
    private String judul;
    private String penerbit;
    private String penulis;

    public int getIdbuku() {
        return idbuku;
    }

    public void setIdbuku(int idbuku) {
        this.idbuku = idbuku;
    }

    public Kategori1841720155Fana getKategori() {
        return kategori;
    }

    public void setKategori(Kategori1841720155Fana kategori) {
        this.kategori = kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public Buku1841720155Fana() {
    }

    public Buku1841720155Fana(Kategori1841720155Fana kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }
    
    public Buku1841720155Fana getById(int id){
        Buku1841720155Fana buku = new Buku1841720155Fana();
        String sql = "SELECT "
                + "b.idbuku AS idbuku, "
                + "b.judul AS judul, "
                + "b.penerbit AS penerbit, " 
                + "b.penulis AS penulis, " 
                + "k.idkategori AS idkategori, " 
                + "k.nama AS nama, " 
                + "k.keterangan AS keterangan " 
                + "FROM buku AS b " 
                + "LEFT JOIN kategori AS k "
                + "ON b.idkategori = k.idkategori " 
                + "WHERE b.idbuku = '" + id + "'";
        
        ResultSet rs = DBHelper1841720155Fana.selectQueryFana(sql);
        
        try {
            while(rs.next()){
                buku = new Buku1841720155Fana();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategoriFana(rs.getInt("idkategori"));
                buku.getKategori().setNamaFana(rs.getString("nama"));
                buku.getKategori().setKeteranganFana(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return buku;
    }
    
    public ArrayList<Buku1841720155Fana> getAll(){
        ArrayList<Buku1841720155Fana> ListBuku = new ArrayList();
        String sql = "SELECT "
                + "b.idbuku AS idbuku, "
                + "b.judul AS judul, "
                + "b.penerbit AS penerbit, " 
                + "b.penulis AS penulis, " 
                + "k.idkategori AS idkategori, " 
                + "k.nama AS nama, " 
                + "k.keterangan AS keterangan " 
                + "FROM buku AS b " 
                + "LEFT JOIN kategori AS k "
                + "ON b.idkategori = k.idkategori";
        
        ResultSet rs = DBHelper1841720155Fana.selectQueryFana(sql);
        
        try {
            while(rs.next()){
                Buku1841720155Fana buku = new Buku1841720155Fana();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategoriFana(rs.getInt("idkategori"));
                buku.getKategori().setNamaFana(rs.getString("nama"));
                buku.getKategori().setKeteranganFana(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return ListBuku;
    }
    
    public ArrayList<Buku1841720155Fana> search(String keyword){
        ArrayList<Buku1841720155Fana> ListBuku = new ArrayList();
        String sql = "SELECT "
                + "b.idbuku AS idbuku, "
                + "b.judul AS judul, "
                + "b.penerbit AS penerbit, " 
                + "b.penulis AS penulis, " 
                + "k.idkategori AS idkategori, " 
                + "k.nama AS nama, " 
                + "k.keterangan AS keterangan " 
                + "FROM buku AS b " 
                + "LEFT JOIN kategori AS k "
                + "ON b.idkategori = k.idkategori "
                + "WHERE b.judul LIKE '%" + keyword + "%' "
                + "OR b.penerbit LIKE '%" + keyword + "%' "
                + "OR b.penulis LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper1841720155Fana.selectQueryFana(sql);
        
        try {
            while(rs.next()){
                Buku1841720155Fana buku = new Buku1841720155Fana();
                buku.setIdbuku(rs.getInt("idbuku"));
                buku.getKategori().setIdKategoriFana(rs.getInt("idkategori"));
                buku.getKategori().setNamaFana(rs.getString("nama"));
                buku.getKategori().setKeteranganFana(rs.getString("keterangan"));
                buku.setJudul(rs.getString("judul"));
                buku.setPenerbit(rs.getString("penerbit"));
                buku.setPenulis(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        return ListBuku;
    }
    
    public void save(){
        if(getById(idbuku).getIdbuku() == 0){
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                    + "'" + this.judul + "', "
                    + "'" + this.getKategori().getIdKategoriFana() + "', "
                    + "'" + this.penulis + "', "
                    + "'" + this.penerbit + "' "
                    + ")";
            this.idbuku = DBHelper1841720155Fana.insertQueryGetIdFana(SQL);
        } else {
            String SQL = "UPDATE buku SET "
                    + "judul = '" + this.judul + "', "
                    + "idkategori = '" + this.getKategori().getIdKategoriFana() + "', "
                    + "penulis = '" + this.penulis + "', "
                    + "penerbit = '" + this.penerbit + "' "
                    + "WHERE(idbuku = '" + this.idbuku + "')";
            DBHelper1841720155Fana.executeQueryFana(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper1841720155Fana.executeQueryFana(SQL);
    }
}
