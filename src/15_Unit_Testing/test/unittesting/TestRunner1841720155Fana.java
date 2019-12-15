package unittesting;

import database.Anggota1841720155FanaTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import database.Kategori1841720155FanaTest;

public class TestRunner1841720155Fana {

    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessor1841720155FanaTest.class);
        showMessageResult(mResult, MessageProcessor1841720155FanaTest.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Kategori1841720155FanaTest.class);
        showMessageResult(mResult, Kategori1841720155FanaTest.class.getSimpleName());
        
        mResult = new JUnitCore().runClasses(Anggota1841720155FanaTest.class);
        showMessageResult(mResult, Anggota1841720155FanaTest.class.getSimpleName());
    }

    private static void showMessageResult(Result mResult, String className) {
        if (mResult.wasSuccessful()) {
            System.out.format("The Result Test from %s : %s\n", className, mResult.wasSuccessful());
        } else {
            for (Failure failure : mResult.getFailures()) {
                System.out.println(failure);
            }
        }
    }
}
