package unittesting;

import unittest.MessageProcessor1841720155Fana;
import org.junit.Assert;
import org.junit.Test;

public class MessageProcessor1841720155FanaTest {

    MessageProcessor1841720155Fana mProcessor;

    public MessageProcessor1841720155FanaTest() {
        mProcessor = new MessageProcessor1841720155Fana();
        mProcessor.setSenderFana("Ronaldo");
        mProcessor.setRecipientFana("Rafael");
        mProcessor.setMessageFana("Whats up bro?");
    }

    @Test
    public void testShowMessage() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo. \nThe message as follows : "
                + "Whats up bro?";
    }

}
