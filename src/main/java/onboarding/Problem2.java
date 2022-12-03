package onboarding;


public class Problem2 {
    public static String solution(String cryptogram) {
        String answer = decoding(cryptogram);
        return answer;
    }

    private static String decoding(String cryptogram) {
        while (true) {
            String nextCryptogram = deleteDuplicate(cryptogram);
            if (isChange(nextCryptogram, cryptogram)) {
                break;
            }
            cryptogram = nextCryptogram;
        }
        String result = cryptogram;
        return result;
    }

    private static String deleteDuplicate(String cryptogram) {
        return "";
    }

    private static boolean isChange(String nextCryptogram, String cryptogram) {
        if (nextCryptogram.equals(cryptogram)) {
            return false;
        }
        return true;
    }
}
