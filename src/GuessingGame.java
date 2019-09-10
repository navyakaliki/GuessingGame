import java.util.ArrayList;
        import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        GuessChecker guessChecker=new GuessChecker(10);
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        ArrayList<Integer> al = new ArrayList<Integer>();
        boolean gameRunning= true;
        while (gameRunning) {
            System.out.println("Enter your guessing ");
            int userInput = Integer.parseInt(scanner.nextLine());
            if (al.contains(userInput)) {
                System.out.println("guessed already");
            } else {
                al.add(userInput);
                System.out.println(al);
                count = count + 1;
                gameRunning= guessChecker.checkGuess(userInput);
                }
            }
        System.out.printf("number of tries %d\n", count);
        }
    }
