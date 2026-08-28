public class SynchronizedDemo {

    private static final Object resource1 = new Object();

    public static void main(String[] args) {
        synchronized (resource1) {
            // only one thread at a time can be inside this block
        }
    }
}
