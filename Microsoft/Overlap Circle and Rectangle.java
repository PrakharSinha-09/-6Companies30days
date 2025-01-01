class Overlap {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {

        // Finding the closest point to the circle within the rectangle
        int close_Xaxis = Math.max(x1,Math.min(x2,xCenter));
        int close_Yaxis = Math.max(y1,Math.min(y2,yCenter));

        // Calculating the distance between the circle's center and this closest point
        int distanceX = xCenter - close_Xaxis;
        int distanceY = yCenter - close_Yaxis;

        // Checking if the circle is within the rectangle. If not, return false.
        if(distanceX * distanceX + distanceY*distanceY <= radius*radius)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Overlap sol = new Overlap();
        System.out.println(sol.checkOverlap(1, 0, 0, 1, -1, 3, 1));
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)

//Problem Link : https://leetcode.com/problems/circle-and-rectangle-overlapping/description/