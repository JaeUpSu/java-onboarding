package onboarding;


import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = decoding(cryptogram);
        return answer;
    }

    private static String decoding(String cryptogram) {
        while (true) {
            List<String> storage = getDuplicateStorage(cryptogram);
            String nextCryptogram = getDecoding(storage, cryptogram);
            if (!isChange(nextCryptogram, cryptogram)) {
                break;
            }
            cryptogram = nextCryptogram;
            if (cryptogram.isEmpty()) {
                break;
            }
        }
        String result = cryptogram;
        return result;
    }

    private static String getDecoding(List<String> storage, String cryptogram) {
        for (String words : storage) {
            cryptogram = cryptogram.replace(words, "");
        }
        return cryptogram;
    }

    private static List<String> getDuplicateStorage(String cryptogram) {
        List<String> storage = new ArrayList<>();
        String words = String.valueOf(cryptogram.charAt(0));
        for (int i = 1; i < cryptogram.length(); i++) {
            String currentWord = String.valueOf(cryptogram.charAt(i));
            if (words.contains(currentWord)) {
                words += currentWord;
                continue;
            }
            storage = addWords(storage, words);
            words = currentWord;
        }
        storage = addWords(storage, words);
        return storage;
    }

    private static List<String> addWords(List<String> storage, String words) {
        if (words.length() > 1) {
            storage.add(words);
        }
        return storage;
    }

    private static boolean isChange(String nextCryptogram, String cryptogram) {
        if (nextCryptogram.equals(cryptogram)) {
            return false;
        }
        return true;
    }
}
