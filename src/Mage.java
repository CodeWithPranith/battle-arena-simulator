import java.util.Random;

public class Mage extends GameCharacter{

    Random random =new Random();
    Mage(String name, int health, int damage, int level){
        super(name,health,damage,level);
    }

    @Override
    void attack(GameCharacter enemy){
        int criticalAttack  = random.nextInt(1,101);
        if(this.canAttack(enemy)) {
            System.out.println(this.name + " Casts fireball at " + enemy.name);
            if(criticalAttack <= 25) {
                System.out.println("Critical attack landed");
                enemy.takeDamage(damage*2);
                System.out.println();
            }
            else{
                enemy.takeDamage(damage);
                System.out.println();
            }
        }
    }
}
