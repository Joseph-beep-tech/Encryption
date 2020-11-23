import models.Decipher;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecipherTest {
    Decipher testDecipher = new Decipher("PLAYER",3);
    @Test
    public void newDecipher_arrayIsString() {
        assertNotNull ( testDecipher );
    }
    @Test
    public void newDecipher_getMessage_isString(){
        assertEquals("PLAYER",testDecipher.getEncryptedMessage());
    }

    @Test
    public void newDecipher_checksFor_getKey() {
        assertEquals(3, testDecipher.getKey());
    }
    @Test
    public void newDecipher_checksFor_decryptionMessage(){
        assertEquals("wow", testDecipher.decryptingMessage());
    }
}
