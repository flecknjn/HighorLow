import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int ranGen = generator.nextInt(10) + 1;
        double numGuess = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("Guess the number: ");
            if(in.hasNextDouble()){
                numGuess = in.nextDouble();
                in.nextLine();
                if(numGuess <= 1){
                    System.out.println("\nYour guess needs to be between 1 and 10!");
                }
                else if (numGuess >= 10) {
                    System.out.println("\nYour guess must be between 1 and 10!");
                }
                else{
                    done = true;
                }
            }
            else{
                trash = in.nextLine();
                System.out.println("\nYou said your number was: " + trash);
                System.out.println("You have to enter a valid number!");
            }
        }while(!done);

        System.out.println("\nThe random number was: " + ranGen);

        if(numGuess == ranGen){
            System.out.println("\nWow! You nailed it!");
        }
        else if (numGuess > ranGen) {
            System.out.println("\nYou guessed too high :(");
        }
        else{
            System.out.println("\nYou guessed too low :(");
        }
    }
}