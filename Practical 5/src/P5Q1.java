import java.util.Scanner;

public class P5Q1 {

    private static final String VOWELS = "aeiou";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.next();

        System.out.println("The word '" + word + "' contains: ");

        int[] occurrences = countVowels(word);

        for (int i = 0; i < occurrences.length; i++) {
            System.out.println(VOWELS.charAt(i) + ": " + occurrences[i]);
        }

        public static int[] countVowels(String str) {
            int[] occurrences = {0, 0, 0, 0, 0 };

            if (str == null || str.isEmpty()) 
                return occurrences;

            for (char ch: str.toCharArray()) 
            {
                int indexFound = VOWELS.indexOf(Character.toLowerCase(ch));
                if (indexFound != -1) 
                
                    occurrences[indexFound]++;
                
            }

            return occurrences;
            
        }
    }
}
