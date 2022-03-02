package by.epam.Lamashka.VinylShop.view;

public class AdminView extends View {
  public AdminView() {
    this.options = new String[] {"1-ADD PRODUCT", "2-DELETE PRODUCT"};
  }

  @Override
  public View show() {
    printOptions();
    return null;
  }

  @Override
  protected String userDataInput() {
    return null;
  }

  @Override
  protected void printOptions() {
    super.printOptions();
  }


}
