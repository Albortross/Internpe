import java.util.Random;
import java.util.Scanner;;

public class GuessingNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100)+1;
        int attempt = 0;
        boolean hasGuessed = false;

        System.out.println("Guess a Number between 1 and 100");

        while(!hasGuessed){
            System.out.print("Enter Your Guess : ");

            int guess = scanner.nextInt();
            attempt++;

            if(guess == secretNumber){
    
                hasGuessed = true;
                System.out.println("Congratulations! You guessed the number " + secretNumber + " correctly in " + attempt + " attempt!");
            }else if (guess < secretNumber){
                System.out.println("Try a Higher number");
            }else{
                System.out.println("Try a Lower Number");
            }


        }

    }
}