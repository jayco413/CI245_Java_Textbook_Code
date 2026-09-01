import java.util.*;

public class BattleSimulator {

    public static void main(String[] args) {
        TreeSet<Entity> adventurers = new TreeSet<>();
        TreeSet<Entity> monsters = new TreeSet<>();

        adventurers.add(new Wizard());
        adventurers.add(new Rogue());
        adventurers.add(new Fighter());
        adventurers.add(new Barbarian());
        adventurers.add(new Knight());
        adventurers.add(new Elf());

        monsters.add(new Troll());
        monsters.add(new Ogre());
        monsters.add(new Goblin());
        monsters.add(new Wyrm());
        monsters.add(new Sorcerer());

        while (!adventurers.isEmpty() && !monsters.isEmpty()) {
            Entity strongestAdventurer = adventurers.last();
            Entity strongestMonster = monsters.last();

            strongestAdventurer.fight(strongestMonster);
            if (strongestAdventurer.getHP() <= 0) {
                adventurers.remove(strongestAdventurer);
            }
            if (strongestMonster.getHP() <= 0) {
                monsters.remove(strongestMonster);
            }
        }

        if (adventurers.isEmpty()) {
            System.out.println("Monsters have emerged victorious!");
        } else {
            System.out.println("Adventurers have successfully defended the realm!");
        }
    }
}
