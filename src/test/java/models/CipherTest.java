package models;
import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {
    Cipher testCypher = new Cipher("babyshark", 2);

    @Test
    public void newCipher_getMessage_IsString() {

        assertNotNull ( testCypher );
    }

    @Test
    public void newCypher_checksKey() {
        assertEquals( 2, testCypher.getKey());
    }

    @Test
    public void newCipher_checksFor_getMessage() {

        assertEquals("hello", testCypher.getMessage() );
    }

    @Test
    public void newCipher_checks_encryptedMessage() {
        assertEquals("dcdaujctm", testCypher.encryptMessage());
    }

    @Test
    public void if_getletter_returnString() {
        assertEquals("babyshark", testCypher.encryptMessage());
    }
}