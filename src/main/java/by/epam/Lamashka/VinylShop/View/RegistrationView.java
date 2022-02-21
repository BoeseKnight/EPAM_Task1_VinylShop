package by.epam.Lamashka.VinylShop.View;

import by.epam.Lamashka.VinylShop.Controller.Controller;

public class RegistrationView extends View {
    public RegistrationView(Controller controller) {
        super(controller);
        options=new String[]{"1-ENTER LOGIN","2-ENTER PASSWORD"};
    }
    @Override
    public void show() {
        printOptions();

    }
}
