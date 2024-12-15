public class WordCharacterCount {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer";

        int words = 0;
        int charsWithoutSpaces = 0;
        int vowels = 0;
        int consonants = 0;

        String[] wordArray = input.split("\\s+");
        words = wordArray.length;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c != ' ') {
                charsWithoutSpaces++;
            }

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                consonants++;
            }
        }

        System.out.println("Words: " + words);
        System.out.println("Chars: " + charsWithoutSpaces);
        System.out.println("Vowel: " + vowels);
        System.out.println("Consonant: " + consonants);
    }
}
