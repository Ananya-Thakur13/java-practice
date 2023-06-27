public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int insertIndex = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[insertIndex] = num;
                insertIndex++;
            }
        }

        while (insertIndex < n) {
            nums[insertIndex] = 0;
            insertIndex++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        MoveZeroes solution = new MoveZeroes();
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}