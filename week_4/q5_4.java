package week_4;

public class q5_4 {
    class Main {
    static int[] rotateArray(int[] nums, int k) {

        int[] result = new int[nums.length];

        k = k % nums.length;

        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int[] result = rotateArray(nums, k);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
}
