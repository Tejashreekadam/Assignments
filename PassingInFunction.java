import java.util.Arrays;

public class PassingInFunction {
    public static void main(String[] args) {

         int []nums ={2,3,4,5,6};
        System.out.println(Arrays.toString(nums));
        change (nums);
        System.out.println(Arrays.toString(nums));
    }
    static void  change(int []arr) { // change in array mutable
        arr[0]=99;
    }
}
