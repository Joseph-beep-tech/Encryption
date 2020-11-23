import models.Cipher;
import models.Decipher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        boolean programRunning = true;

        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to Caesar Cipher. To encrypt type: ENCRYPT, to decrypt type: DECRYPT to exit the program type: EXIT ");

            try {
                String navigatingChoice = bufferedReader.readLine();
                switch (navigatingChoice) {
                    case "ENCRYPT": {
                        System.out.println ( "Enter the statement you want to encrypt: " );
                        String input = bufferedReader.readLine ();
                        System.out.println ( "Enter the desired (should be a number) key for encryption: " );
                        String key = bufferedReader.readLine ();
                        int encryptionKey = Integer.parseInt ( key );

                        Cipher newWordCipher = new Cipher ( input, encryptionKey );
                        String encryptedWord = newWordCipher.encryptMessage ();
                        System.out.println ( "Your encrypted message is: " + encryptedWord );

                        break;
                    }
                    case "DECRYPT": {
                        System.out.println ( "Enter the statement you want to decrypt: " );
                        String input = bufferedReader.readLine ();
                        System.out.println ( "Enter the desired (should be a number) key for decryption: " );
                        String key = bufferedReader.readLine ();
                        int decryptionKey = Integer.parseInt ( key );

                        Decipher newDecipher = new Decipher ( input, decryptionKey );
                        String decryptedWord = newDecipher.decryptingMessage ();
                        System.out.println ( "Your decrypted message is: " + decryptedWord );

                        break;
                    }
                    case "EXIT":
                        programRunning = false;
                        break;
                    default:
                        System.out.println ( "Please input the correct entries" );
                        break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}