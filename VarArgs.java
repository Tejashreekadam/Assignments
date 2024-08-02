import java.util.Arrays;

public class VarArgs {
    //Variable Arguments
    public static void main(String[] args) {
    fun(23,4,5,6,7,7);
    }
    static void fun (int ...v)
    {
        System.out.println(Arrays.toString(v));
    }}
