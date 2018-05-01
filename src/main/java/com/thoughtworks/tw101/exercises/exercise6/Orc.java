import java.io.*;

class Orc implements Monster {
    int health;
    String name;

    Orc(String name){
        this.health = 20;
        this.name = name;
    }

    public int takeDamage(int amount){
        if (this.health == 0 || this.health - amount < 0){
            this.health = 0;
        } else {
            this.health -= amount;
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