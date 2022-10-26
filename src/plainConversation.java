import java.util.Scanner;
public class plainConversation {
    public static void main(String[] args) {
        System.out.println("What's your age");

        Scanner userAge = new Scanner(System.in);
        String userAgeI = userAge.next(); // convert to string
        double userAgeS = Double.valueOf(userAgeI); // convert to double

        if (userAgeS >= 0 && userAgeS <= 6) {System.out.println("Home, walk and kindergarten.");}
        else if (userAgeS <= 17 && userAgeS > 6) {System.out.println("You probably go to school");}
        else if (userAgeS > 17 && userAgeS <= 22) {System.out.println("You probably go to the university");}
        else if (userAgeS > 22 && userAgeS <= 60) {System.out.println("You probably work");}
        else if (userAgeS > 60) {System.out.println("You are probably retired");}
        else {System.out.println("Why did you put a negative number as your age?");}

        if (userAgeS >= 100) {System.out.println("You lived to a hundred, way to go!");}




    }
}
