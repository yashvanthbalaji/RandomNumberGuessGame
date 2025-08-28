import java.util.Scanner;
import java.util.Random;
public class RandomNum {
    public static void main (String []args)
    {
        Scanner scanner = new Scanner (System.in);
        Random random = new Random();
        System.out.print("How many attempts you need ?  ");
        int attempt = scanner.nextInt();
        System.out.print("Set the limit from = ");
        int fromlimit = scanner.nextInt();
        System.out.print("Set the limit to = ");
        int tolimit = scanner.nextInt();
        int a = random.nextInt((tolimit - fromlimit))+fromlimit; 

        System.out.println("Let's START! ALL THE BEST");
        boolean guess = false;


        for (int i =1;i<=attempt;i++)
        {
            System.out.print("\nAttempt " + i + "/" + attempt + " → Enter your guess: ");
            int b = scanner.nextInt();
            if (b<=tolimit && b>=fromlimit) {
                
            
            if(b==a)
            {
                System.out.println("Yeah you guessed it right");
                System.out.println("Attempts Used = "+i);
                guess = true ;
                break;
            }
            else if (b<a) {
                System.out.println("You are low");
            }
            else {
                System.out.println(" you are high");
            }
        }
        else{
            System.out.println("Please enter a number within the given range");
        }

        }
        
        if( !guess)
        {
            System.out.println(" Dont worry better luck next time");
            System.out.println(" The correct answer is = "+ a);
        }

        scanner.close();

    }
}
