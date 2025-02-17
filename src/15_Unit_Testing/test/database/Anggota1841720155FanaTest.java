/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Oktavian
 */
public class Anggota1841720155FanaTest extends TestCase{
    Anggota1841720155Fana mInstance;

    public Anggota1841720155FanaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        mInstance = new Anggota1841720155Fana("Fana", "Lumajang", "085456725425");
        System.out.format("Start Testing : %s \n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    @Test
    public void testSearchFana() {
        System.out.println("search test anggota");
        String keyword = "Fana";
        ArrayList<Anggota1841720155Fana> result = mInstance.searchFana(keyword);
        ArrayList<Anggota1841720155Fana> expResult = mInstance.getByNamaAndAlamatFana(keyword, "");
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSaveFana() {
        System.out.println("save test anggota");
        this.mInstance.saveFana();
        ArrayList<Anggota1841720155Fana> expResult = mInstance.getByNamaAndAlamatFana(mInstance.getNamaFana(), mInstance.getAlamatFana());
        assertTrue(expResult.size()>0);
    }

}
