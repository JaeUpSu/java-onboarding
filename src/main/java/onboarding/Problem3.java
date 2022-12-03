package onboarding;

public class Problem3 {
    private static final Character THREE = '3';
    private static final Character SIX = '6';
    private static final Character NINE = '9';

    public static int solution(int number) {
        int answer = play369Game(number);
        return answer;
    }

    private static int play369Game(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            String numberWords = String.valueOf(i);
            if (is369Contains(numberWords)) {
                count += getClapsCount(numberWords);
            }
        }
        return count;
    }

    private static long getClapsCount(String numberWords) {
        return numberWords.chars()
                .filter(c -> isDivisible(c, 3))
                .count();
    }
    private static boolean isDivisible(int number, int byNumber) {
        return ((number - '0') % byNumber == 0) && (number - '0') > 0;
    }
    private static boolean is369Contains(String number) {
        return number.contains(THREE.toString())
                || number.contains(SIX.toString())
                || number.contains(NINE.toString());
    }
}
