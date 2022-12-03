package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = play369Game(number);
        return answer;
    }

    private static int play369Game(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            String numberWords = String.valueOf(number);
            count += getClapsCount(numberWords);
        }
        return count;
    }

    private static int getClapsCount(String numberWords) {
        return 0;
    }
}
