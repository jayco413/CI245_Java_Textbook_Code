public class MyExceptionDemo {

    static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }

    static void someMethod() throws MyException {
        throw new MyException("There was an error");
    }

    public static void anotherMethod() {
        try {
            someMethod();
        } catch (MyException e) {
            // handle it
        }
    }

    public static void main(String[] args) {
        anotherMethod();
    }
}
