import java.util.*;
public class VowelOrConsonant {
    public static void main(String[] args) {
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any Vowel");
        ch = scanner.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is Vowel");
                break;
            default:
                System.out.println(ch + " is Consonant");
        }
    }
}
