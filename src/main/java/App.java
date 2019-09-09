
import java.util.Scanner;
import java.io.BufferedReader;
public class App {
    public static void main(String[] args) {
        char[] inputtedStringInChar;
        boolean programRunning = true;
        while(programRunning) {
            Scanner myObj = new Scanner(System.in);
            String myStringEncrypted = new String();
            System.out.println("Welcome to your encryption and decryption app!!Please follow instructions");
            System.out.println("Do you want to decrypt or encrypt?Write encrypt if you want to encrypt , decrypt for decrypting and exit for exiting");
            String decryptOrEncrypt = myObj.nextLine();
            if(decryptOrEncrypt.equals("exit")){
                System.out.println("thank you for joining us");
                programRunning=false;
            }
            else
            {
                System.out.println("Enter the plaintext please");
                String stringLength = myObj.nextLine();
                String stringToLower = stringLength.toLowerCase();
                inputtedStringInChar = stringToLower.toCharArray();

                System.out.println("Enter the key please");
                String intLength = myObj.nextLine();
                int n = Integer.parseInt(intLength);


                if (decryptOrEncrypt.equals("encrypt")) {
                    Encrypt myStringToEncrypt = new Encrypt(inputtedStringInChar, n);
                    myStringEncrypted = myStringToEncrypt.EncryptInput();
                    System.out.println("Your encrypted  string is:"+ myStringEncrypted);
                } else if (decryptOrEncrypt.equals("decrypt")) {
                    Decrypt myStringToDecrypt = new Decrypt(inputtedStringInChar, n);
                    myStringEncrypted = myStringToDecrypt.DecryptInput();
                    System.out.println("Your decrypted string is:"+ myStringEncrypted);
                }
                else if(decryptOrEncrypt.equals("exit")){
                    programRunning=false;

                }
                else {
                    System.out.println("invalid entry");
                }

            }


        }




    }





    }

