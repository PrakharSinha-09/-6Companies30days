import java.util.Arrays;

class RussianDoll {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes , (a,b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int[] dp = new int[envelopes.length];
        int ans = 0;
        for (int[] env : envelopes) {
            int height = env[1];
            int left = Arrays.binarySearch(dp, 0, ans, height);
            if (left < 0) left = -left - 1;
            if (left == ans) ans++;
            dp[left] = height;
        }
        return ans;
    }

    public static void main(String[] args) {
        RussianDoll sol = new RussianDoll();
        int[][] envelopes = {{5,4},{6,4},{6,7},{2,3}};
        System.out.println(sol.maxEnvelopes(envelopes));
    }
}

// Time Complexity: O(nlogn)
// Space Complexity: O(n)

// Problem Link: https://leetcode.com/problems/russian-doll-envelopes/
