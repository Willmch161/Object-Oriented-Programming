public class StringProcessor {
    public static int 
getWordCount (String s) {
    return s.trim().isEmpty() ? 0 : s.trim().split("\\s+").length;
}


    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static long
    countVowels(String s) {
        return 
    s.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }

    public static long
    countConsonants(String s) {
        return s.toLowerCase().chars().filter(c -> c >= 'a' && c <= 'z' && "aeiou".indexOf(c) < 0).count();
    }

    public static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
}

   