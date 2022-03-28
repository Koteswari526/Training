import java.util.*;
class breakstatement{
    public static void m1()
    {
        // Initially loop is set to run from 0-9
        for (int i = 0; i < 10; i++) {
            // Terminate the loop when i is 5
            if (i == 5)
                break;
            System.out.println("i: " + i);
        }
        System.out.println("Out of Loop");
    }
}
public class switchandcontinue {
	public static void main(String args[])
    {
        breakstatement.m1();
		// For loop for iteration
        for (int i = 0; i <= 15; i++) {
 
            // Check condition for continue
            if (i == 10) {
 
                // Using continue statement to skip the
                // execution of loop when i==10 or i==12
                continue;
            }
            
            // Printing elements to show continue statement
            System.out.print(i + " ");
        }
    }
}

