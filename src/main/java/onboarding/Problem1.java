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
        int pobiScore = 0; //getPlayerScore(pobi);
        int crongScore = 9; //getPlayerScore(crong);

        if (pobiScore > crongScore) {
            return 1;
        } else if (pobiScore < crongScore) {
            return 2;
        }

        return 0;
    }

    private static void validatePages(List<Integer> player) {
        int difference = player.get(1) - player.get(0);

        if (difference != 1) {
            throw new IllegalArgumentException();
        }
    }
}