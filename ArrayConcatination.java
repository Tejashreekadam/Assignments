public class ArrayConcatination {
    //array of concatination letcode question
    public static void main(String[] args) {

    }

    public int[] getConcatenation ( int[] nums){

        int n = nums.length;
            int[] ans = new int[2 * n];
            for (int i = 0; i < n; i++) {
                ans[i] = nums[i];
                ans[i + n] = nums[i];
            }
            return ans;

        }
    }
