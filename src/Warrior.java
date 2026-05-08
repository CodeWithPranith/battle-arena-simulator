import java.util.Random;

public class Warrior extends GameCharacter {
    Random random = new Random();
    Warrior(String name, int health, int damage, int level){
        super(name,health,damage,level);
    }

    @Override
    void takeDamage(int amount){
        int shield = random.nextInt(1,101);
        if (shield <= 20){
            System.out.println("Warrior shield activated");
            System.out.println(this.name +" blocked part of the damage!");
            super.takeDamage(amount/2);
        }
        else {
            super.takeDamage(amount);
        }
    }
    @Override
    void attack(GameCharacter enemy){
       if(this.canAttack(enemy)){
           System.out.println(this.name+ " Slashes "+ enemy.name +" with sword");
           enemy.takeDamage(damage);
           System.out.println();
       }

    }
}
