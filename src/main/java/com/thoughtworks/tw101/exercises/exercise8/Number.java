import java.util.*;

class Number {
    int low;
    int high;
    int theGuess;
    boolean guessed;
    int numGuesses;
    ArrayList<Integer> myGuesses = new ArrayList<Integer>();

    Number(int low, int high){
        this.low = low;
        this.high = high;
        this.theGuess = pickNumber(low, high);
        this.guessed = false;
        this.numGuesses = 0;
        this.myGuesses = myGuesses;
    }

    public int pickNumber(int bottom, int top){
        int num = (int )(Math.random() * top + bottom);
        return num;
    }

    public int getNumber(){
        return this.theGuess;
    }

    public ArrayList aGuess(String guess){
        if (guess.contains("guess") || guess.contains("Guess"));
        return this.myGuesses;
    }

    public void aGuess(int num){
        if (!this.guessed){
            if (num < this.low || num > this.high){
                System.out.println("Sorry this number is out of the bounds. Your guess must be higher than " + this.low + " and lower than " + this.high + ".");
                return;
            }

            this.numGuesses++;
            printoutUserGuessResponse(num);
        }
    }

    private void printoutUserGuessResponse(int num) {
        if (num > this.theGuess){
            System.out.println("Your guess is too high. Guess lower.");
            this.myGuesses.add(num);
        } else if (num < this.theGuess){
            System.out.println("Your guess is too low. Guess higher.");
            this.myGuesses.add(num);
        } else {
            this.guessed = true;
            System.out.println("Congrats you guessed the number " + this.theGuess + ". It took you " + this.numGuesses + " attempts.");
            System.out.println("Your guesses were: " + this.myGuesses + ".");
        }
    }

    public boolean guessedYet(){
        return this.guessed;
    }
}