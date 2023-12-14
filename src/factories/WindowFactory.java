package factories;

import buttons.Button;
import buttons.WindowsButton;
import checkboxes.Checkbox;

public class WindowFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return null;
    }
}
