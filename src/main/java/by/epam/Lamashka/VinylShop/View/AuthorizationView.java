package by.epam.Lamashka.VinylShop.View;

public class AuthorizationView extends View {
    public AuthorizationView() {
        options=new String[]{"1-ENTER LOGIN","2-ENTER PASSWORD"};
    }

    @Override
    public void show() {
        printOptions();
    }
}
