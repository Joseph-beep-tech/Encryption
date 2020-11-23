package models;

@SuppressWarnings("ALL")
public class Decipher {
    private final String mEncryptedLetter;
    private final int key;
    String Letter = "awesome";
    String DecryptedWord = " ";

    public Decipher(String EncryptedLetter, int key){
        this.mEncryptedLetter = EncryptedLetter;
        this.key = key;
    }


    public String getEncryptedMessage(){
        return this.mEncryptedLetter;
    }
    public int getKey(){
        return this.key;
    }

    // looping through variable letter,getting index of each character
    public String decryptingMessage(){
        mEncryptedLetter.toLowerCase();

        for (int i = 0; i < Letter.length(); i++){
            int indexOfCode = Letter.indexOf(Letter.charAt(i));
            int indexOfDecryption = (indexOfCode - key) % 26;
            if (indexOfDecryption < 0)
            {
                indexOfDecryption = Letter.length() - indexOfDecryption;
            }
            char decryptedLetter= Letter.charAt(indexOfDecryption);
            DecryptedWord += decryptedLetter;
        }
        return DecryptedWord;
    }
}