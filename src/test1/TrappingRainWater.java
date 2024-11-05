package test1;

public class TrappingRainWater {

    public static int trap(int[] height) {
    	// No water can be trapped
        if (height == null || height.length == 0) {
            return 0; 
        }

        int n = height.length;
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int waterTrapped = 0;

        // Use two pointers to traverse the elevation map
        while (left < right) {
            if (height[left] < height[right]) {
                
                if (height[left] >= leftMax) {
                    leftMax = height[left]; 
                } else {
                    waterTrapped += leftMax - height[left]; 
                }
                left++; 
            } else {
                
                if (height[right] >= rightMax) {
                    rightMax = height[right]; 
                } else {
                    waterTrapped += rightMax - height[right]; 
                }
                right--; 
            }
        }

        return waterTrapped;
    }

    public static void main(String[] args) {
        // Test cases
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height2 = {3, 0, 2, 0, 4};

        System.out.println("Input: [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1] -> Trapped Water: " + trap(height1));
        System.out.println("Input: [3, 0, 2, 0, 4] -> Trapped Water: " + trap(height2));
    }
}
