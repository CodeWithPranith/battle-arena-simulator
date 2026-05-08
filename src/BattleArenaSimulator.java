import java.util.Random;

public class BattleArenaSimulator {
    public static void main (String[] args){

        int roundCounter = 1;
        Random random = new Random();

        Warrior warrior = new Warrior("Thor",100,30,2);
        Mage mage = new Mage("Shadow",90,40,1);
        Archer archer = new Archer("Hawkeye",120,35,3);

        GameCharacter[] characters = {warrior,mage,archer};


        while(GameCharacter.aliveCount != 1) {
            System.out.println("********");
            System.out.printf("Round %d \n",roundCounter);
            System.out.println("********");
            roundCounter++;

            for (int i = 0; i < characters.length; i++) {
                int randomCharacter = random.nextInt(0,characters.length);
                if (!characters[i].alive) {
                    continue;
                }
                else {
                    while (characters[i] == characters[randomCharacter] ||
                            !characters[randomCharacter].alive) {
                        randomCharacter = random.nextInt(0, characters.length);
                    }
                    characters[i].attack(characters[randomCharacter]);
                }
            }
        }

        for(GameCharacter character:characters){
            if(character.alive){
                System.out.println(character.name+" WINS THE BATTLE!!!");
                System.out.println();
                character.showStats();
                break;
            }   
        }

    }
}