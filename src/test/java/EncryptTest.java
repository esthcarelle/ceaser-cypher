import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void getChar_getsInputtedChar_hi() {
       Encrypt testEncrypt = new Encrypt(new char[]{'h', 'i'}, 2);
        assertEquals(new char[]{'h', 'i'}, testEncrypt.getInputtedString());
    }

    @Test
    public void getChar_getsInputtedKey_2() {
        Encrypt testEncrypt = new Encrypt(new char[]{'h', 'i'}, 2);
        assertEquals(2, testEncrypt.getInputtedPosition());
    }

    @Test
    public void EncryptInput_What_string(){
        Encrypt inputtedString=new Encrypt(new char[]{'h', 'i'},2);
        assertEquals("jk",inputtedString.EncryptInput());
    }


}