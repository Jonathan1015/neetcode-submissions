class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int left = 0;
        int right = len - 1;
        int[] result = {-1, -1};

        while (left < right) {
            int tempSum = numbers[left] + numbers[right];

            if (tempSum == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            } else if (tempSum > target) {
                right--;
            } else {
                left++;
            }
        }

        return result;
    }   
}
