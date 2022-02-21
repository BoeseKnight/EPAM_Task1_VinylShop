package by.epam.Lamashka.VinylShop.View;

import by.epam.Lamashka.VinylShop.Controller.Controller;

public class AdminView extends View {
    public AdminView(Controller controller) {
        super(controller);
        this.options= new String[]{"1-ADD PRODUCT", "2-DELETE PRODUCT"};
    }

    @Override
    public void show() {
        printOptions();
    }
}
