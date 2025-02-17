package database;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBHelper1841720155Fana {

    private static Connection sKoneksi;

    public static void bukaKoneksiFana() {
        if (sKoneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/dbperpus";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                sKoneksi = DriverManager.getConnection(url, user, password);
            } catch (Exception e) {
                System.out.println("Error koneksi!");
            }
        }
    }

    public static int insertQueryGetIdFana(String mQuery) {
        bukaKoneksiFana();
        int mNum = 0;
        int mResutl = -1;
        
        try {
            Statement mStmt = sKoneksi.createStatement();
            mNum = mStmt.executeUpdate(mQuery, Statement.RETURN_GENERATED_KEYS);
            
            ResultSet mRs = mStmt.getGeneratedKeys();
            
            if (mRs.next()) {
                mResutl = mRs.getInt(1);
            } 
            
            mRs.close();
            mStmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            mResutl = -1;
        }
        return mResutl;
    }

    public static boolean executeQueryFana(String mQuery) {
        bukaKoneksiFana();
        boolean mResult = false;
        
        try {
            Statement mStmt = sKoneksi.createStatement();
            mStmt.executeUpdate(mQuery);
            
            mResult = true;
            mStmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return mResult;
    }

    public static ResultSet selectQueryFana(String mQuery) {
        bukaKoneksiFana();
        ResultSet mRs = null;
        try {
            Statement mStmt = sKoneksi.createStatement();
            mRs = mStmt.executeQuery(mQuery);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mRs;
    }
}
