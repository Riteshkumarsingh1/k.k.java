import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // String fruit = in.next();

        // if (fruit.equals("Mango")) {
        // System.out.println("King of fruit");
        // }
        // if (fruit.equals(apple)) {
        // System.out.println("a sweet red fruit");

        // The `switch` statement in the provided Java code is used to check the value
        // of the `fruit`
        // variable and execute different code blocks based on the value. It is an
        // alternative to using
        // multiple `if-else` statements for such scenarios. Each `case` represents a
        // possible value of
        // the `fruit` variable, and the corresponding code block is executed when the
        // value matches
        // the `case`. The `default` case is executed when none of the specified cases
        // match the value
        // of `fruit`.
        //

        // Q:Print days of week.........
        // int day = in.nextInt();
        // switch (day) {
        // case 1 -> System.out.println("Monday");
        // case 2 -> System.out.println("Tuesday");
        // case 3 -> System.out.println("Wednesday");
        // case 4 -> System.out.println("Thursday");
        // case 5 -> System.out.println("Friday");
        // case 6 -> System.out.println("saturday");
        // case 7 -> System.out.println("Sunday");
        // default -> System.out.println("Invalid Day");
        // }

        // int day = in.nextInt();
        // switch (day) {
        // case 1:
        // case 2:
        // case 3:
        // case 4:
        // case 5:
        // System.out.println("Weekday");
        // break;
        // case 6:
        // case 7:
        // System.out.println("Weekend");
        // break;
        // }

        // int day = in.nextInt();
        // switch (day) {
        // case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
        // case 6, 7 -> System.out.println("Weekend");
        // default -> System.out.println("Invalid Day");
        // }

        // Q: Employee and Department...........
        int employeid = in.nextInt();
        in.nextLine();
        String department = in.nextLine();
        switch (employeid) {
            case 1:
                System.out.println("Ritesh");
                break;
            case 2:
                System.out.println("Rajan");
                break;
            case 3:
                System.out.println("Sajan");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "CSE":
                        System.out.println("CSE Department");
                        break;
                    case "DS":
                        System.out.println("DS Department");
                        break;
                    default:
                        System.out.println("No Department exagrated:");

                }
                break;
            default:
                System.out.println("Employee Mentioned is Abscent:");
                break;
        }
    }
}
