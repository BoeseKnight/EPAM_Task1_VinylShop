package by.epam.Lamashka.VinylShop.controller.Command;

import by.epam.Lamashka.VinylShop.view.View;
import javafx.util.Pair;

public interface Command {
  Pair<String, View> execute(String parameters);
}
