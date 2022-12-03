package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = getReverseGame(word);
        return answer;
    }

    private static String getReverseGame(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char alpha = word.charAt(i);
            result += getReverseAlpha(alpha);
        }
        return result;
    }

    private static String getReverseAlpha(char alpha) {
        return "";
    }
}
