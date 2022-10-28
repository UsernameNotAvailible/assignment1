import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // part1?
        int a; int b; int c; int d; String e; // some variables
        b = 40; c = 39;  e = "Some words here";
        System.out.print("a = ");/* No ln to write in the same line */ Scanner a1 = new Scanner (System.in); String a2 = a1.next(); a = Integer.valueOf(a2);
        System.out.print("d = "); Scanner d1 = new Scanner (System.in); String d2 = d1.next(); d = Integer.valueOf(d2); // one string since it's all basically defining one345 variable

        if ((a >= b && c < d) || (b == d && a != c)) {System.out.println("(a >= b and c < d) or (b == d and a != c)");} // some logic using relational operators
        else {if (b > a && d <= c) {System.out.println("b > a and d <= c");} // in one string since it's just println, and to be more compact
        else {System.out.println("Something else");}} // It can be reached
        if (e.equals("some random words")) { // won't print anything
            System.out.println("print nothing");
        }

        switch (e) {
            case "Constant expression required":
            case "whatever":
                System.out.println("Some words");
                break;
            case "nothing interesting":
                System.out.println("A word");
                break;
            default:
                System.out.println("No matches");
                break;


        }
    }
}