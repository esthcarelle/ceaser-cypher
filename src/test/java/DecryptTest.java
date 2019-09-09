import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void getChar_getsInputtedChar_hi() {
        Decrypt testDecrypt =new  Decrypt (new char[]{'h', 'i'}, 2);
        assertEquals(new char[]{'h', 'i'}, testDecrypt.getInputtedString());
    }

    @Test
    public void getChar_getsInputtedKey_2() {
        Decrypt testDecrypt = new Decrypt(new char[]{'h', 'i'}, 2);
        assertEquals(2, testDecrypt.getInputtedPosition());
    }

    @Test
    public void EncryptInput_What_string(){
        Decrypt inputtedString=new Decrypt(new char[]{'j', 'k'},2);
        assertEquals("hi",inputtedString.DecryptInput());
    }

}