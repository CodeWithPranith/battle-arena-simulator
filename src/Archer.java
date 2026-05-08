import java.util.Random;

public class Archer extends GameCharacter{

    Random random = new Random();

    Archer(String name, int health, int damage, int level){
        super(name,health,damage,level);
    }

    @Override
    void attack(GameCharacter enemy){
        int multiAttack = random.nextInt(1,101);
        if(this.canAttack(enemy)){
            System.out.println(this.name + " Shoots arrows at " + enemy.name);
                enemy.takeDamage(damage);
            if(multiAttack <= 30) {
                System.out.println(this.name + " Shoots a second arrow " + enemy.name);
                enemy.takeDamage(damage);
            }
            System.out.println();

        }
    }

}
