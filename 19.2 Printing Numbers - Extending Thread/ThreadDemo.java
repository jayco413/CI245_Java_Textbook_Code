public class ThreadDemo {

    static class MyThread extends Thread {
        public void run() {
            // code to run on the thread goes here
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
