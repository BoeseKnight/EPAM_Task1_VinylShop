package by.epam.Lamashka.VinylShop.View;

public abstract class View {
    protected String options[];
    public abstract void show();
    protected void printOptions(){
        for(String option: options){
            System.out.println(option);
        }
    }
}
