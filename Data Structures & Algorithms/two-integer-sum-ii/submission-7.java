class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int fast = 1;
        int slow = 0;
        int len = numbers.length;
        int[] result = {-1, -1};

        while (slow < len) {
            if (numbers[fast] + numbers[slow] == target) {
                result[0] = slow + 1;
                result[1] = fast + 1;
                return result;
            }

            // if (numbers[fast] + numbers[slow] > target) {
            //     slow++;
            // }
            
            if (fast >= len - 1) {
                fast = 0;
                slow++;
            } else {
                fast++;
            }
        }

        return result;
    }   
}
