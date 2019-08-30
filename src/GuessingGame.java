import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        double secretNum = Math.random();
        double rounded = Math.ceil(secretNum * 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println(secretNum);
        boolean input = true;
        while(input) {
            System.out.println("Enter your guessing ");
            int userInput = Integer.parseInt(scanner.nextLine());
            if (rounded == userInput) {
                System.out.println("You guessed it right");
                System.exit(0);
            } else
            {
                if(rounded>userInput){
                    System.out.println("Small");
                }
                else if(rounded<userInput){
                    System.out.println("big");
                }

            }
                System.out.println("Better luck again");
            System.out.println(rounded);
            System.out.println("Do you wish to guess a Number : y");
             input=scanner.nextLine().equalsIgnoreCase("y");
        }
    }
}
