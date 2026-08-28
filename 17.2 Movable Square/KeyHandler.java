import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public abstract class KeyHandler {

    private Scene scene = null;
    private ArrayList<KeyCode> activeKeys;

    private void setKeyActive(KeyCode kc) {
        if (!activeKeys.contains(kc)) {
            activeKeys.add(kc);
        }
    }

    private void setKeyInactive(KeyCode kc) {
        activeKeys.remove(kc);
    }

    public boolean isKeyActive(KeyCode kc) {
        return activeKeys.contains(kc);
    }

    public boolean isKeyComboActive(KeyCode kc1, KeyCode kc2) {
        return isKeyActive(kc1) && isKeyActive(kc2);
    }

    public boolean isKeyComboActive(KeyCode kc1, KeyCode kc2, KeyCode kc3) {
        return isKeyComboActive(kc1, kc2) && isKeyActive(kc3);
    }

    public void performKeyEffects() {
        if (scene == null) {
            scene = getScene();
            activeKeys = new ArrayList<KeyCode>();

            scene.setOnKeyPressed(e -> {
                setKeyActive(e.getCode());
            });

            scene.setOnKeyReleased(e -> {
                setKeyInactive(e.getCode());
            });
        }
        performKeyEffectsConcrete();
    }

    protected abstract void performKeyEffectsConcrete();

    protected abstract Scene getScene();
}
