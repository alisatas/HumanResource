package hasRepeatedCharacters;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inputString = "This is an algorithm to make a new word with words that has repeated characters";
        String result = shuffleCharactersAndCombineWords(inputString);
        System.out.println("Randomized characters word: " + result);
    }

    public static String shuffleCharactersAndCombineWords(String inputString) {
        ArrayList<String> wordsWithRepeatedCharacters = new ArrayList<>();
        String[] words = inputString.split("\\s+");

        int count = 0;
        for (String word : words) {
            if (hasRepeatedCharacters(word)) {
                char[] charArray = word.toCharArray();
                ArrayList<Character> charList = new ArrayList<>();
                for (char c : charArray) {
                    charList.add(c);
                }
                Collections.shuffle(charList);
                StringBuilder shuffledWord = new StringBuilder();
                for (char c : charList) {
                    shuffledWord.append(c);
                }

                wordsWithRepeatedCharacters.add(shuffledWord.toString());
                count++;

                if (count == 2) {
                    break; //
                }
            }
        }
        return String.join("", wordsWithRepeatedCharacters);
    }
    public static boolean hasRepeatedCharacters(String word) {
        HashSet<Character> uniqueCharacters = new HashSet<>();

        for (char c : word.toCharArray()) {
            if (!uniqueCharacters.add(c)) {
                return true;
            }
        }

        return false;
    }
}