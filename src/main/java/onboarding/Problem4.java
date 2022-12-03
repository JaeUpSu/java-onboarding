package onboarding;

public class Problem4 {
    private static final Character BLANK = ' ';
    private static final Character UPPER_START_ALPHA = 'A';
    private static final Character UPPER_END_ALPHA = 'Z';
    private static final Character LOWER_START_ALPHA = 'a';
    private static final Character LOWER_END_ALPHA = 'z';
    public static String solution(String word) {
        String answer = getReverseGame(word);
        return answer;
    }

    private static String getReverseGame(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            Character alpha = word.charAt(i);
            result += getReverseAlpha(alpha);
        }
        return result;
    }

    private static String getReverseAlpha(Character alpha) {
        if (alpha.equals(BLANK)) {
            return String.valueOf(alpha);
        }
        if (isUpperAlpha(alpha)) {
            return getReverse(alpha, UPPER_START_ALPHA, UPPER_END_ALPHA);
        }

        return getReverse(alpha, LOWER_START_ALPHA, LOWER_END_ALPHA);
    }

    private static String getReverse(Character alpha, Character start, Character end) {
        int difference = alpha - start;
        return String.valueOf((char) (end - difference));
    }
    private static boolean isUpperAlpha(Character alpha) {
        if (UPPER_START_ALPHA <= alpha && UPPER_END_ALPHA >= alpha) {
            return true;
        }
        return false;
    }
}
