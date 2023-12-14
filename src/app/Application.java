package app;

import buttons.Button;
import checkboxes.Checkbox;
import factories.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckBox();
    }

    public void click(){
        button.click();
    }

    public void checked(){
        checkbox.checked();
    }
}
