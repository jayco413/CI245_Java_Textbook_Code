public class HelloWorldWindow extends JavaFXWindow {

    @Override
    protected String getStageTitle() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        HelloWorldWindow hww = new HelloWorldWindow();
        hww.runAsStartUpWindow();
    }
}
