import java.util.Scanner;

public class Lab3 
{
    public static void main(String[] args) {
        // Scanner object sc created for reading input
        Scanner sc = new Scanner(System.in);
        // various grade variables are declared as double
        double homeWork = 0; 
        double midTerm = 0; 
        double finaExam = 0; 
        double weighted_Total = 0;
        int i = 0;
        // loop for inputing each grade
        while (i < 3) 
        {
            if (i == 0) {
                System.out.print("Enter your HOME WORK grade: ");
                homeWork = sc.nextDouble();
                // checking enterd value is in the domain or not
                if (homeWork >= 0 && homeWork <= 100) {
                    // increment loop variable
                    i++;
                } else {
                    // prompt to enter a valid grade
                    System.out.println("[ERR] Invalid input. Homework grade should be in [0,100]");
                }
            }
            if (i == 1) {
                System.out.print("Enter your MIDTERM grade: ");
                midTerm = sc.nextDouble();
                // checking enterd value is in the domain or not
                if (midTerm >= 0 && midTerm <= 100) {
                    // increment loop variable
                    i++;
                } else {
                    // prompt to enter a valid grade
                    System.out.println("[ERR] Invalid input.MID TERM  grade should be in [0,100]");
                }
            }
            if (i == 2) {
                System.out.print("Enter your FINAL grade: ");
                finalExam = sc.nextDouble();
                // checking enterd value is in the domain or not
                if (finalExam >= 0 && finalExam <= 200) {
                    // increment loop variable
                    i++;
                } else {
                    // prompt to enter a valid grade
                    System.out.println("[ERR] Invalid input.FINAL grade should be in [0,100]");
                }
            }
        }
        // calculating weighted total
        weighted_Total = (finalExam / 200 * 50) + (midTerm * 0.25) + (homeWork * 0.25);
        // printing weighted total
        System.out.println("[INFO] Student's Weighted Total is " + weighted_Total);
        // checking weighted total is greater than or equals to 50
        if (weighted_Total >= 50)
            // print PASSED message
            System.out.print("[INFO] Student PASSED the class");
        else
            // print FAILED message
            System.out.print("[INFO] Student FAILED the class");
    }
}

    

