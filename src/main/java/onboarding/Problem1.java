package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        try {
            validatePages(pobi);
            validatePages(crong);

            return getPageGameResult(pobi, crong);
        } catch (IllegalArgumentException e) {
            return -1;
        }
    }

    private static int getPageGameResult(List<Integer> pobi, List<Integer> crong) {
        int pobiScore = getPlayerScore(pobi);
        int crongScore = getPlayerScore(crong);

        if (pobiScore > crongScore) {
            return 1;
        } else if (pobiScore < crongScore) {
            return 2;
        }

        return 0;
    }

    private static Integer getPlayerScore(List<Integer> player) {
        int left = getPageScore(player.get(0));
        int right = getPageScore(player.get(1));

        int max = Math.max(left, right);

        return max;
    }

    private static int getPageScore(Integer pageNumber) {
        int plusScore = getPlus(pageNumber);
        int multipleScore = getMultiple(pageNumber);

        int max = Math.max(plusScore, multipleScore);

        return max;
    }

    private static int getPlus(Integer pageNumber) {
        int answer = 0;
        String pageValue = String.valueOf(pageNumber);

        for (int i = 0; i < pageValue.length(); i++) {
            int value = Character.getNumericValue(pageValue.charAt(i));
            answer += value;
        }

        return answer;
    }

    private static int getMultiple(Integer pageNumber) {
        int answer = 1;
        String pageValue = String.valueOf(pageNumber);

        for (int i = 0; i < pageValue.length(); i++) {
            int value = Character.getNumericValue(pageValue.charAt(i));
            answer *= value;
        }

        return answer;
    }

    private static void validatePages(List<Integer> player) {
        int difference = player.get(1) - player.get(0);

        if (difference != 1) {
            throw new IllegalArgumentException();
        }
    }
}