package Lab3;

public class Task7 {
    public static void main(String[] args) {
        int arraySize = 10;
        char[] alphabet = new char[arraySize];
        char firstLetter = 'a';

        showAlphabet(alphabet, firstLetter);
        System.out.println();
        showAlphabetReverse(alphabet);
    }

    public static void showAlphabet(char[] charArr, char letter) {
        for (int i = 0; i < charArr.length; i++){
            charArr[i] = letter;
            letter += 2;
            System.out.printf("%c ", charArr[i]);
        }
    }

    public static void showAlphabetReverse(char[] charArr) {
        for (int i = charArr.length - 1 ; i >= 0; i--){
            System.out.printf("%c ", charArr[i]);
        }
    }
}


