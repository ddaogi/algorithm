import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        Map<String, Integer> nameToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nameToIndex.put(friends[i], i);
        }

        int[][] giftHistory = new int[n][n];
        int[] giftScore = new int[n];

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giver = nameToIndex.get(parts[0]);
            int receiver = nameToIndex.get(parts[1]);

            giftHistory[giver][receiver]++;
            giftScore[giver]++;
            giftScore[receiver]--;
        }

        int[] received = new int[n]; 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;

                if (giftHistory[i][j] > giftHistory[j][i]) {
                    received[i]++;
                } else if (giftHistory[i][j] == giftHistory[j][i]) {
                    if (giftScore[i] > giftScore[j]) {
                        received[i]++;
                    }
                }
            }
        }

        // 가장 많이 받은 선물 수 반환
        int max = 0;
        for (int r : received) {
            max = Math.max(max, r);
        }

        return max;
    }
}
