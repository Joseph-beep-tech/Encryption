package models;

@SuppressWarnings("ALL")
public class Cipher {

    private String message;
    private int key;

    String letter = "abcdefghijklmnopqrstuvwxyz";
    String encryptedMessage = " ";

    public Cipher(String message, int Key) {
        this.message = message;
        this.key = Key;
    }

    public String getMessage() {
        return message;
    }

    public int getKey() {
        return key;
    }

    // Encryption Logic
    public String encryptMessage(){
        String encryptedText = message.toLowerCase();

        for(int i = 0; i < encryptedText.length(); i++){
            int indexOfTextBeingEncrypted = letter.indexOf(encryptedText.charAt(i));
            int indexOfEncryption = (indexOfTextBeingEncrypted + key) % 26;
            char decryptionPlaintext = letter.charAt(indexOfEncryption);
            encryptedMessage += decryptionPlaintext;
        }
        return encryptedMessage;
    }
}
