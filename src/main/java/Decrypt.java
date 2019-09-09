public class Decrypt {
    private char[] inputtedString;
    private char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private int i, j,key,inputtedPosition, outputNumber;
    private char[] answerInChar=new char[1000];


    public Decrypt(char[] inputtedString,int inputtedPosition) {
        this.inputtedString = inputtedString;
        this.inputtedPosition=inputtedPosition;

    }

    public char[] getInputtedString() {
        return this.inputtedString;
    }

    public int getInputtedPosition()
    {
        return this.inputtedPosition;
    }

    public String DecryptInput() {

        for (i = 0; i < inputtedString.length; i++) {

            for (j = 0; j < alphabet.length; j++) {
                if (inputtedString[i] == alphabet[j]) {
                    key = j;
                    key = (key - inputtedPosition)%26;

                    answerInChar[i] = alphabet[key];

                }
                else if(inputtedString[i]==' ') {
                    answerInChar[i]= ' ';

                }


            }

        }
        String answerReturned=new String(answerInChar);



        return (answerReturned);
    }

}
