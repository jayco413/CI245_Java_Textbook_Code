public class RunnableDemo {

    static class MyRunnable implements Runnable {
        public void run() {
            // code to run on the thread goes here
        }
    }

    public static void main(String[] args) {
        Runnable task = new MyRunnable();
        Thread thread = new Thread(task);
        thread.start();

        Thread anonymousThread = new Thread(new Runnable() {
            public void run() {
                // code to run on the thread goes here
            }
        });
        anonymousThread.start();
    }
}
