
import java.util.Scanner;
import java.io.BufferedReader;
public class App {
    public static void main(String[] args) {
        char[] inputtedStringInChar;


        Scanner myObj = new Scanner(System.in);
        String myStringEncrypted = new String();

        System.out.println("Enter the plaintext please");

        String stringLength = myObj.nextLine();
        String stringToLower=stringLength.toLowerCase();
        inputtedStringInChar=stringToLower.toCharArray();
        System.out.println("Do you want to decrypt or encrypt?Write encrypt if you want to encrypt and decrypt for decrypting");
        String decryptOrEncrypt = myObj.nextLine();
       System.out.println(decryptOrEncrypt);
        System.out.println("Enter the key please");
        String intLength = myObj.nextLine();
        int n=Integer.parseInt(intLength);


        if(decryptOrEncrypt.equals("encrypt")){
            Encrypt myStringToEncrypt=new Encrypt(inputtedStringInChar,n);
            myStringEncrypted=myStringToEncrypt.EncryptInput();
            System.out.println(myStringEncrypted);
        }
       else if(decryptOrEncrypt.equals("decrypt")){
            Decrypt myStringToDecrypt=new Decrypt(stringLength);
            myStringEncrypted=myStringToDecrypt.DecryptInput(inputtedStringInChar,n);
            System.out.println(myStringEncrypted);
        }
       else
        {
            System.out.println("invalid entry");
        }










    }





    }
