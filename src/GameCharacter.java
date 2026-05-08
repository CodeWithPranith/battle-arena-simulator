public abstract class GameCharacter {

    String name;
    private int health;
    private int maxHealth;
    static int aliveCount;
    int damage;
    int level;
    boolean alive;

    GameCharacter(String name, int maxHealth, int damage, int level){
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.damage = damage;
        this.level = level;
        this.alive = true;
        aliveCount++;
    }

    abstract void attack(GameCharacter enemy);

    void takeDamage(int amount){
        this.health =Math.max(0,this.health-amount);
        System.out.println(this.name+" took "+ amount +" damage");
        if (this.health == 0){
            this.alive = false;
            aliveCount--;
            System.out.println(this.name +" has been defeated");
        }
    }

    void heal(int amount){
        if(!this.alive){
            System.out.println("Cannot heal dead character");
            return;
        }
        else if(amount <=0 ){
            System.out.println("Invalid Heal Amount");
            return;
        }
        else if(this.health >= this.maxHealth ) {
            System.out.println(this.name+" Health is already "+this.health);
            return;
        }
        this.health = Math.min(this.health + amount, this.maxHealth);
        System.out.println("Healed! Current health: " + this.health);

    }

    boolean canAttack(GameCharacter enemy){
        if(this == enemy){
            System.out.println("Cannot Attack Yourself");
            return false;
        }
        else if(!this.alive){
            System.out.println("Dead characters cannot attack");
            return false;
        }
        else if(!enemy.alive){
            System.out.println(this.name +" cannot attack " + enemy.name +" because they are defeated");
            return false;
        }
        return true;
    }

    void showStats(){
        System.out.println("Name: "+this.name);
        System.out.println("Health: "+this.health);
        System.out.println("Damage: "+this.damage);
        System.out.println("Level: "+this.level);
        System.out.println("Alive: "+this.alive);
    }
    
}
