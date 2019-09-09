public class Encrypt {

    private char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private char[] inputtedString;
    private int i, j,key,inputtedPosition, outputNumber;
    private char[] answerInChar=new char[100];


    public Encrypt(char [] inputtedString,int inputtedPosition) {
        this.inputtedString = inputtedString;
        this.inputtedPosition=inputtedPosition;




    }

    public char[] getInputtedString() {
        return this.inputtedString;
    }

    public int getInputtedPosition() {
        return this.inputtedPosition;
    }



    public String EncryptInput() {

        for (i = 0; i < inputtedString.length; i++) {

            for (j = 0; j < alphabet.length; j++) {
                if (inputtedString[i] == alphabet[j]) {
                    key = j;
                    key = (key + inputtedPosition)%26;

                    answerInChar[i] = alphabet[key];

                }
                else if(inputtedString[i]==' ') {
                    answerInChar[i]= ' ';

                }


            }

        }
        String aa=new String(answerInChar);



            return (aa);
        }


    }

