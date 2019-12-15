package database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Kategori1841720155FanaTest extends TestCase{
    
    Kategori1841720155Fana mInstance;

    public Kategori1841720155FanaTest() {
    
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        mInstance = new Kategori1841720155Fana("Comics", "Comic is combination words and picture");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    @Test
    public void testSearchFana() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori1841720155Fana> result = mInstance.searchFana(keyword);
        ArrayList<Kategori1841720155Fana> expResult = mInstance.getByNamaAndKeteranganFana(keyword, "");
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSaveFana() {
        System.out.println("save test");
        this.mInstance.saveFana();
        ArrayList<Kategori1841720155Fana> expResult = mInstance.getByNamaAndKeteranganFana(mInstance.getNamaFana(), mInstance.getKeteranganFana());
        assertTrue(expResult.size()>0);
    }
    
    
    
}
