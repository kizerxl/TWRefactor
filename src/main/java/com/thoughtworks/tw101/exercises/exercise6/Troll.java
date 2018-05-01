import java.io.*;

class Troll implements Monster {
    int health;
    String name;

    Troll(String name){
        this.health = 40;
        this.name = name;
    }

    public int takeDamage(int amount){
        if (this.health == 0 || this.health - (amount * .5) < 0){
            this.health = 0;
        } else {
            this.health -= (amount * .5);
        }

        return this.health;        
    }

    public void reportStatus(){
        System.out.println(this.name + " has " + this.health + " health points left.");
    }

    public static void main(String[] args) {
        return;
    }
}