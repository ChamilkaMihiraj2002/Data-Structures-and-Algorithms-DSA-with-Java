public class Demo {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,5, 7, 9, 11, 13, 14, 19};
        int target = 2;

        int result = linearSearch(nums, target);
        int result1 = binarySearch(nums, target);
//        int result = binarySearch(nums, target,0, nums.length); // Binary Search

        if (result1 != -1)
            System.out.println("Element found at Index : " + result1);
        else
            System.out.println("Element not found");
    }

    // Linear Search
    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by Linear : " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by Linear : " + steps);
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int steps = 0;

        while(left <= right) {
            steps++;
            int mid = (left + right)/2;

            if (nums[mid] == target) {
                System.out.println("Steps taken by Binary : " + steps);
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Steps taken by Binary : " + steps);
        return -1;
    }

    // Binary Search with recursive
    public static int binarySearch(int[] nums, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, left+1,right);
            } else {
                return binarySearch(nums, target, left,right-1);
            }
        }
        return -1;
    }
}
