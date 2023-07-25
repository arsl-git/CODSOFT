package javainternship;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // generte random number beteween 0 to 100
        int randomNumber = random.nextInt(101);

        int count = 0;////no of attempts made by user
        for (int i = 0; i < 10; i++) {
            System.out.println("enter the guess number by user");
            int userInput = sc.nextInt();
            if (userInput == randomNumber) {
                count++;
                int max = 10 - count;
                System.out.println("correct number ,YOU WIN");
                System.out.println("----------------------------------------");
                System.out.println("highScore: " + " " + max);
                System.out.println("----------------------------------------");
                break;
            }
            //if user entering the number is not in the range of 0 to 100 then dispaly error
            else if (userInput > 100) {
                System.out.println("error bound of range");
                break;
            }
            // if user input is greater then  random number it will dispaly guess number is too high
            else if (userInput > randomNumber) {
                System.out.println("TO HIGH");
                System.out.println("Guess lower nUmber");
                count++;
                System.out.println("chances left:" + " " + (10 - count));
                System.out.println("----------------------------------------");
            } else if (userInput < randomNumber) {
                System.out.println("TO LOW");
                System.out.println("Guess higher number");
                count++;
                System.out.println("chances left:" + " " + (10 - count));
                System.out.println("----------------------------------------");

            }


        }

    }
}
