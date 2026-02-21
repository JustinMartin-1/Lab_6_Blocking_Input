import java.util.Random;
import java.util.Scanner;


void main() {
    double randomNum;
    double userNum;
    boolean done = false;
    String trash;
    Scanner in = new Scanner(System.in);

    do {
        randomNum = Math.random() * 10;
        System.out.print("Enter a number between 0 and 10: ");
        if (in.hasNextDouble()) {
            userNum = in.nextDouble();
            in.nextLine();
            if (userNum < randomNum) {
                System.out.println("Your number is too low.");
            } else if (userNum > randomNum) {
                System.out.println("Your number is too high.");
            } else {
                System.out.println("Congratulations! You guessed the number!");
            }
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }
        System.out.print("Do you want to play again? (Y/N): ");
        done = in.nextLine().equals("N");
    } while (!done);

}