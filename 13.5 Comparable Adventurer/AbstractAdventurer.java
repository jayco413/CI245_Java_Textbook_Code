public abstract class AbstractAdventurer implements Comparable<AbstractAdventurer> {

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

    public int compareTo(AbstractAdventurer other) {
        // ADD YOUR CODE HERE -- compare based on getLevel()
        return 0;
    }
}
