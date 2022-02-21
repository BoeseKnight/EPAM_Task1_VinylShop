package by.epam.Lamashka.VinylShop.View;

public class CustomerView extends View {
    public CustomerView(){
        options=new String[]{"1-ADD PRODUCT TO BASKET","2-BUY"};
    }
    @Override
    public void show() {
        printOptions();
    }
}
