import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    
    public static void main(String[] args) {
        int startNum = 0;
        int endNUm = 50;
        int guessCount = 0;
        Scanner sc = new Scanner(System.in);

        int secretNum = (int) (Math.random() * ((startNum - endNUm) + 1) + endNUm);

        while(true) {
            System.out.println("Enter a number between " + startNum + " and " + endNUm);
            int userInput = sc.nextInt();
            //if (guessCount < left) {
                //guessCount++;
                if (userInput == secretNum) {
                    System.out.println("Congratulations! you got it right");
                    break;

                } else if (userInput > secretNum) {
                    System.out.println("No! Too large");
                    guessCount++;
                } else {
                    System.out.println("Nope! Too small");
                    guessCount++;
                }
                System.out.println("you took " + guessCount+ " guess");

        }

    }
}



