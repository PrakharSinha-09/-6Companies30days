class Winner {
    public int findTheWinner(int n, int k) {
        int val=0;                     //initally
        for(int i=2;i<=n;i++)          //starting from the second one, as we have already considered the first one.
        {
            val=(val+k)%i;             //selecting next k friends and to avoid index out of bound.. doing % i.
        }

        return val+1;                  //returning winner.
    }

    public static void main(String[] args) {
        Winner sol = new Winner();
        System.out.println(sol.findTheWinner(5, 2));
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

// Problem Link: https://leetcode.com/problems/find-the-winner-of-the-circular-game/