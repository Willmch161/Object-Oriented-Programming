import java.util.Scanner;

public class StringManager {
    public static void main(String[] args) {
        System.out.print("Enter sentence: ");
        String in = new Scanner(System.in).nextLine();

        if (in.isBlank()) return;

        System.out.printf("""
            --- Output ---
            Total Characters: %d
            Total Words:      %d
            Uppercase:        %s
            Lowercase:        %s
            Reverse:          %s
            Vowels:           %d
            Consonants:       %d
            Palindrome:       %s
            """, 
            in.length(), StringProcessor.getWordCount(in), in.toUpperCase(), in.toLowerCase(),
            StringProcessor.reverse(in), StringProcessor.countVowels(in), 
            StringProcessor.countConsonants(in), StringProcessor.isPalindrome(in) ? "Yes" : "No");
    }
}