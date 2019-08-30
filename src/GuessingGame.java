import java.util.ArrayList;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        double secretNum = Math.random();
        double rounded = Math.ceil(secretNum * 10);
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        while (true) {
            System.out.println("Enter your guessing ");
            int userInput = Integer.parseInt(scanner.nextLine());
            if (al.contains(userInput)) {
                System.out.println("guessed already");
            } else {
                al.add(userInput);
                System.out.println(al);
                {
                    if (rounded == userInput) {
                        System.out.println("You guessed it right");
                        System.out.printf("number of tries %d\n", count);
                        System.exit(0);
                    } else {
                        if (rounded > userInput) {
                            System.out.println("Guess is Small");
                        } else if (rounded < userInput) {
                            System.out.println("Guess is big");
                        }
                        count = count + 1;
                        System.out.println("Try again");
                    }
                }
            }
        }
    }
}