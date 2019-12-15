package unittest;

public class MessageProcessor1841720155Fana {

    private String mSender, mRecipient, mMessage;

    public String getMessageFana() {
        return mMessage;
    }

    public String getRecipientFana() {
        return mRecipient;
    }

    public String getSenderFana() {
        return mSender;
    }

    public void setMessageFana(String message) {
        this.mMessage = message;
    }

    public void setRecipientFana(String recipient) {
        this.mRecipient = recipient;
    }

    public void setSenderFana(String sender) {
        this.mSender = sender;
    }

    public String messageFormatFana() {
        String message = String.format("Hai %s, you have message from %s. "
                + "\nThe message as follows : %s", this.mRecipient, this.mSender, this.mMessage);
        return message;
    }

    public void showMessageFana() {
        System.out.println(messageFormatFana());
    }

    public void setRecipient(String rafael) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
