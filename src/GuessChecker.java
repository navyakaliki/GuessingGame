public class GuessChecker {
    private final int secretNum;

    public GuessChecker(int maxValue) {
        this.secretNum = randomIntMaker(maxValue);
    }

    public boolean checkGuess(int userGuess) {
        if (secretNum == userGuess) {
            System.out.println("You guessed it right");
            return false;
        } else {
            if (secretNum > userGuess) {
                System.out.println("Guess is Small");
            } else if (secretNum < userGuess) {
                System.out.println("Guess is big");
            }
            System.out.println("Try again");
        }
        return true;
    }

    private int randomIntMaker(int maxValue) {
        double secretNum = Math.random();
        return (int) Math.ceil(secretNum * maxValue);
    }


}