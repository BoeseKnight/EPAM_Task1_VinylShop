package by.epam.Lamashka.VinylShop.Controller.Command;

import by.epam.Lamashka.VinylShop.View.View;
import javafx.util.Pair;

public interface Command {
  Pair<String, View> execute(String parameters);
}
