package database;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Anggota1841720155Fana {

    private int mIdAnggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720155Fana() {

    }

    public Anggota1841720155Fana(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public Anggota1841720155Fana getByIdFana(int mId) {
        Anggota1841720155Fana mKat = new Anggota1841720155Fana();
        ResultSet mRs = DBHelper1841720155Fana.selectQueryFana("SELECT * FROM anggota "
                + "WHERE idanggota = '" + mId + "'");

        try {
            while (mRs.next()) {
                mKat = new Anggota1841720155Fana();
                mKat.setIdAnggotaFana(mRs.getInt("idanggota"));
                mKat.setNamaFana(mRs.getString("nama"));
                mKat.setAlamatFana(mRs.getString("alamat"));
                mKat.setTeleponFana(mRs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mKat;
    }

    public ArrayList<Anggota1841720155Fana> getAllFana() {
        ArrayList<Anggota1841720155Fana> mListAnggota = new ArrayList();

        ResultSet mRs = DBHelper1841720155Fana.selectQueryFana("SELECT * FROM anggota");

        try {
            while (mRs.next()) {
                Anggota1841720155Fana mKat = new Anggota1841720155Fana();
                mKat.setIdAnggotaFana(mRs.getInt("idanggota"));
                mKat.setNamaFana(mRs.getString("nama"));
                mKat.setAlamatFana(mRs.getString("alamat"));
                mKat.setTeleponFana(mRs.getString("telepon"));

                mListAnggota.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListAnggota;
    }

    public ArrayList<Anggota1841720155Fana> searchFana(String mKeyword) {
        ArrayList<Anggota1841720155Fana> mListAnggota = new ArrayList();

        String mSql = "SELECT * FROM anggota WHERE "
                + " nama LIKE '%" + mKeyword + "%' "
                + " OR alamat LIKE '%" + mKeyword + "%' "
                + " OR telepon LIKE '%" + mKeyword + "%' ";

        ResultSet mRs = DBHelper1841720155Fana.selectQueryFana(mSql);

        try {
            while (mRs.next()) {
                Anggota1841720155Fana mKat = new Anggota1841720155Fana();
                mKat.setIdAnggotaFana(mRs.getInt("idanggota"));
                mKat.setNamaFana(mRs.getString("nama"));
                mKat.setAlamatFana(mRs.getString("alamat"));
                mKat.setTeleponFana(mRs.getString("telepon"));

                mListAnggota.add(mKat);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mListAnggota;
    }
    
    public void saveFana() {
        if (getByIdFana(mIdAnggota).getIdAnggotaFana()== 0) {
            String mSql = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + " '" + this.mNama + "', "
                    + " '" + this.mAlamat + "', "
                    + " '" + this.mTelepon + "' "
                    + " )";
            this.mIdAnggota = DBHelper1841720155Fana.insertQueryGetIdFana(mSql);
        } else {
            String mSql = "UPDATE anggota SET "
                    + " nama = '" + this.mNama + "', "
                    + " alamat = '" + this.mAlamat + "', "
                    + " telepon = '" + this.mTelepon + "' "
                    + " WHERE idanggota = '" + this.mIdAnggota + "'";
            DBHelper1841720155Fana.executeQueryFana(mSql);
        }
    }
    
    public void deleteFana() {
        String mSql = "DELETE FROM anggota WHERE idanggota = '" + this.mIdAnggota + "'";
        DBHelper1841720155Fana.executeQueryFana(mSql);
    }
    
    ArrayList<Anggota1841720155Fana> getByNamaAndAlamatFana(String nama, String alamat) {
        ArrayList<Anggota1841720155Fana> ListAnggota = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length()>0) && (alamat.trim().length()>0)){
            rs = DBHelper1841720155Fana.selectQueryFana("SELECT * FROM anggota Where nama = '"+
            nama +"' and alamat = '"+ alamat+"'");
        }else if ((nama.trim().length()>0) && (alamat.trim().length()==0)){
            rs = DBHelper1841720155Fana.selectQueryFana("SELECT * FROM anggota Where nama = '"+
            nama+"'");
        }else {
            rs = DBHelper1841720155Fana.selectQueryFana("SELECT * FROM anggota Where alamat = '"+ alamat+"'");
        }
        try {
            while (rs.next()) {
                Anggota1841720155Fana ang = new Anggota1841720155Fana();
                ang.setIdAnggotaFana(rs.getInt("idanggota"));
                ang.setNamaFana(rs.getString("nama"));
                ang.setAlamatFana(rs.getString("alamat"));
                ang.setTeleponFana(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public int getIdAnggotaFana() {
        return mIdAnggota;
    }

    public void setIdAnggotaFana(int mIdAnggota) {
        this.mIdAnggota = mIdAnggota;
    }

    public String getNamaFana() {
        return mNama;
    }

    public void setNamaFana(String mNama) {
        this.mNama = mNama;
    }

    public String getAlamatFana() {
        return mAlamat;
    }

    public void setAlamatFana(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getTeleponFana() {
        return mTelepon;
    }

    public void setTeleponFana(String mTelepon) {
        this.mTelepon = mTelepon;
    }

}
