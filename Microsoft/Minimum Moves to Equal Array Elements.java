import java.util.Arrays;

class MinimumMoves {
    public int minMoves2(int[] nums)
    {
        int n=nums.length;
        Arrays.sort(nums);
        
        int i=0;
        int j=n-1;

        int count=0;
        while(i<j)
        {
            count+=nums[j]-nums[i];
            i++;
            j--;
        }

        return count;
    }

    public static void main(String[] args) {
        MinimumMoves sol = new MinimumMoves();
        int[] nums = {1,2,3};
        System.out.println(sol.minMoves2(nums));
    }
}

// Time Complexity: O(n log n)
// Space Complexity: O(1)

// Problem Link: https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

// the approach of this problem seems very intuitive right!... as we know, numbers can be increased or decreased by 1.
