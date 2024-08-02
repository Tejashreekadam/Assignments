import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empid =in.nextInt();
        String department = in.next();

        switch (empid){
            case 1:
                System.out.println("tejashree");
                break;
            case 2:
                System.out.println("nikita");
            case 3:
                System.out.println("emp number 3");
                switch (department){
                    case "IT" :
                        System.out.println("IT DEPARTMENT");
                        break;
                    case "MSW":
                        System.out.println("msw department");
                        break;
                    default:
                        System.out.println("enter valid dep");
                }
            default:
                System.out.println("enter correct empid");
        }
    }
}
