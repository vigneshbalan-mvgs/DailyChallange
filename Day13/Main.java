public class Main {

  public static void main(String[] args) {
    int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

    maxSubArray(nums);
    maxSubArray1(nums);

  }

  public static int maxSubArray(int[] nums) {
    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    int maxSum = nums[0];
    for (int i = 1; i < nums.length; i++) {
      dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
      System.out.println(dp[i]);
      maxSum = Math.max(maxSum, dp[i]);
      System.out.println(maxSum);
    }
    System.out.println("Max Sum is " + maxSum);
    return maxSum;
  }

  public static int maxSubArray1(int[] nums) {
    return maxSubArrayHelper(nums, 0, nums.length - 1);
  }

  private static int maxSubArrayHelper(int[] nums, int left, int right) {
    if (left == right)
      return nums[left];
    int mid = left + (right - left) / 2;
    int leftSum = maxSubArrayHelper(nums, left, mid);
    int rightSum = maxSubArrayHelper(nums, mid + 1, right);
    int crossSum = maxCrossingSum(nums, left, mid, right);
    return Math.max(leftSum, Math.max(rightSum, crossSum));
  }

  private static int maxCrossingSum(int[] nums, int left, int mid, int right) {
    int leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = mid; i >= left; i--) {
      sum += nums[i];
      leftMax = Math.max(leftMax, sum);
    }
    sum = 0;
    for (int i = mid + 1; i <= right; i++) {
      sum += nums[i];
      rightMax = Math.max(rightMax, sum);
    }
    return leftMax + rightMax;
  }

}
