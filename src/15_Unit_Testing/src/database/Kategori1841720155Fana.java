package database;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Kategori1841720155Fana {

    private int mIdKategori;
    private String mNama;
    private String mKeterangan;

    public Kategori1841720155Fana() {

    }

    public Kategori1841720155Fana(String mNama, String mKeterangan) {
        this.mNama = mNama;
        this.mKeterangan = mKeterangan;
    }

    public Kategori1841720155Fana getByIdFana(int mId) {
        Kategori1841720155Fana mKat = new Kategori1841720155Fana();
        ResultSet mRs = DBHelper1841720155Fana.selectQueryFana("SELECT * FROM kategori "
                + "WHERE idkategori = '" + mId + "'");

        try {
            while (mRs.next()) {
                mKat = new Kategori1841720155Fana();
                mKat.setIdKategoriFana(mRs.getInt("idkategori"));
                mKat.setNamaFana(mRs.getString("nama"));
                mKat.setKeteranganFana(mRs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mKat;
    }

    public ArrayList<Kategori1841720155Fana> getAllFana() {
        ArrayList<Kategori1841720155Fana> mListKategori = new ArrayList();

        ResultSet mRs = DBHelper1841720155Fana.selectQueryFana("SELECT * FROM kategori");

        try {
            while (mRs.next()) {
                Kategori1841720155Fana mKat = new Kategori1841720155Fana();
                mKat.setIdKategoriFana(mRs.getInt("idkategori"));
                mKat.setNamaFana(mRs.getString("nama"));
                mKat.setKeteranganFana(mRs.getString("keterangan"));

                mListKategori.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListKategori;
    }

    public ArrayList<Kategori1841720155Fana> searchFana(String mKeyword) {
        ArrayList<Kategori1841720155Fana> mListKategori = new ArrayList();

        String mSql = "SELECT * FROM kategori WHERE "
                + " nama LIKE '%" + mKeyword + "%' "
                + " OR keterangan LIKE '%" + mKeyword + "%' ";

        ResultSet mRs = DBHelper1841720155Fana.selectQueryFana(mSql);

        try {
            while (mRs.next()) {
                Kategori1841720155Fana mKat = new Kategori1841720155Fana();
                mKat.setIdKategoriFana(mRs.getInt("idkategori"));
                mKat.setNamaFana(mRs.getString("nama"));
                mKat.setKeteranganFana(mRs.getString("keterangan"));

                mListKategori.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListKategori;
    }

    public void saveFana() {
        if (getByIdFana(mIdKategori).getIdKategoriFana() == 0) {
            String mSql = "INSERT INTO kategori (nama, keterangan) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mKeterangan + "' "
                    + " )";
            this.mIdKategori = DBHelper1841720155Fana.insertQueryGetIdFana(mSql);
        } else {
            String mSql = "UPDATE kategori SET "
                    + " nama = '" + this.mNama + "', "
                    + " keterangan = '" + this.mKeterangan + "' "
                    + " WHERE idkategori = '" + this.mIdKategori + "'";
            DBHelper1841720155Fana.executeQueryFana(mSql);
        }
    }

    public void deleteFana() {
        String mSql = "DELETE FROM kategori WHERE idkategori = '" + this.mIdKategori + "'";
        DBHelper1841720155Fana.executeQueryFana(mSql);
    }
    
    ArrayList<Kategori1841720155Fana> getByNamaAndKeteranganFana(String nama, String keterangan) {
        ArrayList<Kategori1841720155Fana> ListKategori = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length()>0) && (keterangan.trim().length()>0)){
            rs = DBHelper1841720155Fana.selectQueryFana("SELECT * FROM kategori Where nama = '"+
            nama +"' and keterangan = '"+ keterangan+"'");
        }else if ((nama.trim().length()>0) && (keterangan.trim().length()==0)){
            rs = DBHelper1841720155Fana.selectQueryFana("SELECT * FROM kategori Where nama = '"+
            nama+"'");
        }else {
            rs = DBHelper1841720155Fana.selectQueryFana("SELECT * FROM kategori Where keterangan = '"+ keterangan+"'");
        }
        try {
            while (rs.next()) {
                Kategori1841720155Fana kat = new Kategori1841720155Fana();
                kat.setIdKategoriFana(rs.getInt("idkategori"));
                kat.setNamaFana(rs.getString("nama"));
                kat.setKeteranganFana(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
    
    public String toString(){
        return mNama;
    }

    public int getIdKategoriFana() {
        return mIdKategori;
    }

    public void setIdKategoriFana(int mIdKategori) {
        this.mIdKategori = mIdKategori;
    }

    public String getNamaFana() {
        return mNama;
    }

    public void setNamaFana(String mNama) {
        this.mNama = mNama;
    }

    public String getKeteranganFana() {
        return mKeterangan;
    }

    public void setKeteranganFana(String mKeterangan) {
        this.mKeterangan = mKeterangan;
    }

}
