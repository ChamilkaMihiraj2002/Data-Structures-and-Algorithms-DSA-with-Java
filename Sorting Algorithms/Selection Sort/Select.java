public class Select {
    public static void main(String[] args) {
        int[] nums = {6, 5, 2, 1, 8, 9, 4, 20};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("- Before sorting : ");
        for (int num: nums) {
            System.out.print(num + " ");
        }

        System.out.print("\n- Sorting Start : ");
        for(int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

            System.out.println();
            for (int num: nums) {
                System.out.print(num + " ");
            }
        }

        System.out.println("\n- After sorting : ");
        for (int num: nums) {
            System.out.print(num + " ");
        }
    }
}
