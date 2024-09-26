package sept.ex_20092024;

public class Lab063_Inter {
    public static void main(String[] args) {
        // find out the vowel by using java code:
        // 1. user input --> a to z or numbers or any words

        // 2. basic code -->
        // a, e, i, o, u --> vowel &
        // apart from this all are --> consonant

        // 3. write a code
        char ch = 'o';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("vowels");
        } else {
            System.out.println("consonants");
        }
    }
}
