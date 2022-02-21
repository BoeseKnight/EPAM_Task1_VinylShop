package by.epam.Lamashka.VinylShop.View;

public class AdminView extends View {
    public AdminView() {
        this.options= new String[]{"1-ADD PRODUCT", "2-DELETE PRODUCT"};
    }

    @Override
    public void show() {
        printOptions();
    }
}
