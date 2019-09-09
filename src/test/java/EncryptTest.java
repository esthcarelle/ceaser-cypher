import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void RunEncrypt_ToChar_Char() {
        Encrypt inputtedString=new Encrypt(new char[]{'h', 'i'},2);
        char[] hi={'h','i'};
        assertEquals(hi, inputtedString);

    }

    @Test
    public void EncryptInput_What_string(){
        Encrypt inputtedString=new Encrypt(new char[]{'h', 'i'},2);
        assertEquals("jk",inputtedString.EncryptInput());
    }
    @Test
    public void
}