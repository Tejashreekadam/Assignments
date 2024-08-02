public class patterens {
    public static void main(String[] args) {
        pattern1();
    }
    static void pattern1() {
        for (int row = 1; row <= 4 ; row++) {
            //for every row, run the col
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            //when one row is printed , we need to add newline
            System.out.println();
        }
    }
}

