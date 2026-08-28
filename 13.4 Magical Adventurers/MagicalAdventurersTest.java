import java.util.*;

public class MagicalAdventurersTest {

    public static void main(String[] args) {
        List<AbstractAdventurer> adventurers = new ArrayList<AbstractAdventurer>();

        adventurers.add(new Rogue());
        adventurers.add(new Wizard());
        adventurers.add(new Fighter());
        adventurers.add(new Barbarian());
        adventurers.add(new Knight());
        adventurers.add(new Elf());

        for (AbstractAdventurer adventurer : adventurers) {
            if (adventurer instanceof MagicalBeing) {
                MagicalBeing magicalAdventurer = (MagicalBeing) adventurer;
                magicalAdventurer.castSpell();
            }
            adventurer.defeatMonster();
            System.out.println();
        }
    }
}
