import app.Application;
import factories.GUIFactory;
import factories.MacOsFactory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factoryMac = new MacOsFactory();
        Application application = new Application(factoryMac);
        application.click();
        application.checked();
    }
}