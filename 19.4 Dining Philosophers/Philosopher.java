import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Philosopher extends Thread {

    private final Lock leftFork;
    private final Lock rightFork;
    private final int id;

    public Philosopher(int id, Lock leftFork, Lock rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // ADD YOUR CODE HERE -- think(), pick up both forks, eat(),
                // then put both forks back down
                Thread.sleep(0);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void think() throws InterruptedException {
        System.out.println("Philosopher " + id + " is thinking.");
        Thread.sleep(((int) (Math.random() * 1000)));
    }

    private void pickUpLeftFork() {
        // ADD YOUR CODE HERE, ONE LINE OF CODE
        System.out.println("Philosopher " + id + " picked up left fork.");
    }

    private void pickUpRightFork() {
        // ADD YOUR CODE HERE, ONE LINE OF CODE
        System.out.println("Philosopher " + id + " picked up right fork.");
    }

    private void eat() throws InterruptedException {
        System.out.println("Philosopher " + id + " is eating.");
        Thread.sleep(((int) (Math.random() * 1000)));
    }

    private void putDownForks() {
        // ADD YOUR CODE HERE, TWO LINES OF CODE
        System.out.println("Philosopher " + id + " put down both forks.");
    }

    public static void main(String[] args) {
        final int NUM_PHILOSOPHERS = 5;
        Lock[] forks = new ReentrantLock[NUM_PHILOSOPHERS];
        Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            forks[i] = new ReentrantLock();
        }

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            Lock leftFork = forks[i];
            Lock rightFork = forks[(i + 1) % NUM_PHILOSOPHERS];

            philosophers[i] = new Philosopher(i, leftFork, rightFork);
            philosophers[i].start();
        }
    }
}
