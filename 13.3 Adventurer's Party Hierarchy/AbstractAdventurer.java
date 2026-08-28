import java.util.*;

public abstract class AbstractAdventurer {

    public abstract String getName();

    public abstract String getAbility();

    public abstract int getLevel();

    public void defeatMonster() {
        System.out.printf("The %s defeated a monster using %s with %d damage!%n",
            getName(), getAbility(), getLevel());
    }

    public String toString() {
        return getName();
    }

    public static void main(String[] args) {
        List<AbstractAdventurer> adventurers = new ArrayList<AbstractAdventurer>();
        adventurers.add(new Rogue());
        adventurers.add(new Wizard());
        adventurers.add(new Fighter());
        adventurers.add(new Barbarian());
        adventurers.add(new Knight());

        for (AbstractAdventurer adventurer : adventurers) {
            adventurer.defeatMonster();
        }
    }
}
