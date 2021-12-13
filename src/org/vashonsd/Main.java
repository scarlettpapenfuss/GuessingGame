
package org.vashonsd;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
                Random rand = new Random () ;
                int numberToGuess = rand.nextInt (10);
                int numberOfTries = 0;
                Scanner input = new Scanner (System.in);
                int guess;
                boolean win = false;

                while (!win)    {

                    System.out.println("guess a number 1-10: ");
                    guess = input.nextInt();
                    numberOfTries++;

                    if (guess == numberToGuess)   {
                        win = true;
                    }
                    else if (guess < numberToGuess)  {
                        System.out.println("your guess is too low");
                    }
                    else if (guess > numberToGuess)  {
                        System.out.println("your guess is too high");

                    }
                }
                System.out.println("Correct!");
                System.out.println("# of tries: " + numberOfTries );

            }

        }









