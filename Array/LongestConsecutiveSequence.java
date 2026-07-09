public class LongestConsecutiveSequence {
    public static int main(String[] args) {
        int longest = 0;

        int[] nums = null;
        for (int num : nums) {
            int current = num;
            int length = 1;

            try {
                while (contains(nums, current + 1)) {
                    current++;
                    length++;
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            longest = Math.max(longest, length);
        }

        return longest;
    }

    public static boolean contains(int[] nums, int target) {
        for (int num : nums) {
            if (num == target)
                return true;
        }
        return false;
    }
    }

