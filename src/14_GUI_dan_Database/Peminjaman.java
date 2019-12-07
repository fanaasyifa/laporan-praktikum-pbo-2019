/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Unero
 */
public class Peminjaman {
    private int idPeminjaman;
    private Anggota1841720155Fana anggota = new Anggota1841720155Fana();
    private Buku1841720155Fana buku = new Buku1841720155Fana();

    private String tanggalPinjam;
    private String tanggalKembali;

    public int getIdPeminjaman() {
        return idPeminjaman;
    }

    public void setIdPeminjaman(int idPeminjaman) {
        this.idPeminjaman = idPeminjaman;
    }

    public Anggota1841720155Fana getAnggota() {
        return anggota;
    }

    public void setAnggota(Anggota1841720155Fana anggota) {
        this.anggota = anggota;
    }

    public Buku1841720155Fana getBuku() {
        return buku;
    }

    public void setBuku(Buku1841720155Fana buku) {
        this.buku = buku;
    }

    public String getTanggalPinjam() {
        return tanggalPinjam;
    }

    public void setTanggalPinjam(String tanggalPinjam) {
        this.tanggalPinjam = tanggalPinjam;
    }

    public String getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(String tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman() {}

    public Peminjaman(Anggota1841720155Fana anggota,Buku1841720155Fana buku,String tanggalPinjam, String tanggalKembali) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.tanggalKembali = tanggalKembali;
    }

    public Peminjaman getById(int id) {
        Peminjaman peminjaman = new Peminjaman();
        ResultSet rs = DBHelper1841720155Fana.selectQueryFana("SELECT"
                + " p.idpeminjaman AS idpeminjaman,"
                + " p.tanggalpinjam AS TanggalPinjam,"
                + " p.tanggalkembali AS TanggalKembali,"
                + " a.idanggota AS idAnggota, "
                + " a.nama AS nama,"
                + " a.alamat AS alamat,"
                + " a.telepon AS telepon,"
                + " b.idbuku AS idBuku, "
                + " b.judul AS judul,"
                + " b.penerbit AS penerbit,"
                + " b.penulis AS penulis"
                + " FROM peminjaman AS p"
                + " LEFT JOIN anggota AS a on a.idanggota = p.idanggota"
                + " LEFT JOIN buku AS b on b.idbuku = p.idbuku"
                + " WHERE p.idpeminjaman= '" + id + "'");
        try {
            while (rs.next()) {
                peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalKembali(rs.getString("tanggalkembali"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalpinjam"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }

    public ArrayList<Peminjaman> getAll() {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720155Fana.selectQueryFana("SELECT "
                + " p.idpeminjaman AS idpeminjaman, "
                + " p.tanggalpinjam AS TanggalPinjam,"
                + " p.tanggalkembali AS TanggalKembali, "
                + " a.idanggota AS idAnggota, "
                + " a.nama AS nama,"
                + " a.alamat AS alamat,"
                + " a.telepon AS telepon,"
                + " b.idbuku AS idBuku, "
                + " b.judul AS judul,"
                + " b.penerbit AS penerbit,"
                + " b.penulis AS penulis"
                + " FROM peminjaman AS p "
                + " left join anggota AS a on a.idanggota = p.idanggota "
                + " left join buku AS b on b.idbuku = p.idbuku");
        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.setIdPeminjaman(rs.getInt("idpeminjaman"));
                peminjaman.getAnggota().setIdanggota(rs.getInt("idanggota"));
                peminjaman.getAnggota().setNama(rs.getString("nama"));
                peminjaman.getAnggota().setAlamat(rs.getString("alamat"));
                peminjaman.getAnggota().setTelepon(rs.getString("telepon"));
                peminjaman.getBuku().setIdbuku(rs.getInt("idbuku"));
                peminjaman.getBuku().setJudul(rs.getString("judul"));
                peminjaman.getBuku().setPenerbit(rs.getString("penerbit"));
                peminjaman.getBuku().setPenulis(rs.getString("penulis"));
                peminjaman.setTanggalKembali(rs.getString("tanggalkembali"));
                peminjaman.setTanggalPinjam(rs.getString("tanggalpinjam"));

                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListPeminjaman;
    }

    public ArrayList<Peminjaman> searchIdAnggota(String keyword) {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper1841720155Fana.selectQueryFana("SELECT "
                + " nama as nama"
                + " FROM anggota "
                + " WHERE idanggota = '" + keyword + "' ");
        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.anggota.getNama();

                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }

    public ArrayList<Peminjaman> searchIdBuku(String keyword) {
        ArrayList<Peminjaman> ListPeminjaman = new ArrayList();

        ResultSet rs = DBHelper1841720155Fana.selectQueryFana("SELECT "
                + " judul AS judul,"
                + " FROM buku"
                + " where idbuku = '" + keyword + "' ");
        try {
            while (rs.next()) {
                Peminjaman peminjaman = new Peminjaman();
                peminjaman.buku.getJudul();

                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListPeminjaman;
    }

    public void save() {
        if (getById(idPeminjaman).getIdPeminjaman() == 0) {
            String SQL = "INSERT INTO peminjaman (idanggota ,idbuku,tanggalpinjam,tanggalkembali) VALUES("
                    + " '" + this.getAnggota().getIdanggota()+ "', "
                    + " '" + this.getBuku().getIdbuku() + "', "
                    + " '" + this.tanggalPinjam + "', "
                    + " '" + this.tanggalKembali + "' "
                    + " )";
            this.idPeminjaman = DBHelper1841720155Fana.insertQueryGetIdFana(SQL);
        } else {
            String SQL = "UPDATE peminjaman set "
                    + " judul = '" + this.getAnggota().getIdanggota() + "', "
                    + " nama = '" + this.getBuku().getIdbuku() + "', "
                    + " tanggalPinjam = '" + this.tanggalPinjam + "', "
                    + " tanggalKembali = '" + this.tanggalKembali + "', "
                    + " WHERE idpeminjaman = '" + this.idPeminjaman + "'";
            DBHelper1841720155Fana.executeQueryFana(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM buku where idpeminjaman = '" + this.idPeminjaman + "'";
        DBHelper1841720155Fana.executeQueryFana(SQL);
    }
}
