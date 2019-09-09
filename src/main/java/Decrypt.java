public class Decrypt {
    private char[] inputtedStringInChar;
    private char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private String inputtedString;
    private int i, j,key,l, outputNumber;
    private char[] answerInChar=new char[100];


    public Decrypt(String inputtedString) {
        this.inputtedString = inputtedString;


    }

    public char[] ChangeIntoChar() {
        inputtedStringInChar = inputtedString.toCharArray();
        return inputtedStringInChar;
    }

    public String DecryptInput(char[] inputtedStringInChar,int n) {

        for (i = 0; i < inputtedStringInChar.length; i++) {

            for (j = 0; j < alphabet.length; j++) {
                if (inputtedStringInChar[i] == alphabet[j]) {
                    key = j;
                    key = (key - n)%26;

                    answerInChar[i] = alphabet[key];

                }
                else if(inputtedStringInChar[i]==' ') {
                    answerInChar[i]= ' ';

                }


            }

        }
        String aa=new String(answerInChar);



        return (aa);
    }

}
