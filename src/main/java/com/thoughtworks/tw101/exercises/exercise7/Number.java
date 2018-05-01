import java.util.*;

class Number {
    int low;
    int high;
    int theGuess;
    boolean guessed;
    int numGuesses;

    Number(int low, int high){
        this.low = low;
        this.high = high;
        this.theGuess = pickNumber(low, high);
        this.guessed = false;
        this.numGuesses = 0;
    }

    public int pickNumber(int bottom, int top){
        int num = (int )(Math.random() * top + bottom);
        return num;
    }

    public int getNumber(){
        return this.theGuess;
    }

    public void aGuess(int num){
        if (!this.guessed){
            this.numGuesses++;
            if (num > this.theGuess){
                System.out.println("Your guess is too high. Guess lower.");
                return;
            } else if (num < this.theGuess){
                System.out.println("Your guess is too low. Guess higher.");
                return;
            } else {
                this.guessed = true;
                System.out.print("Congrats you guessed the number " + this.theGuess + ". It took you " + this.numGuesses + " attempts.");
                return;
            }
        } else {
            return;
        }
    }

    public boolean guessedYet(){
        return this.guessed;
    }

    public static void main(String[] args) {
        return;
    }
}