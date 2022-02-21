package by.epam.Lamashka.VinylShop.View;

public class RegistrationView extends View {
    public RegistrationView() {
        options=new String[]{"1-ENTER LOGIN","2-ENTER PASSWORD"};
    }
    @Override
    public void show() {
        printOptions();
    }
}
