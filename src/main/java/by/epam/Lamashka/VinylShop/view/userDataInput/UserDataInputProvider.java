package by.epam.Lamashka.VinylShop.view.userDataInput;

import java.util.HashMap;
import java.util.Map;

public class UserDataInputProvider {
    private Map<Integer, UserDataInput> userDataInputMap=new HashMap<>();
    public UserDataInputProvider(){
        userDataInputMap.put(1, new AuthorizationInput());
        userDataInputMap.put(2, new AuthorizationInput());
        userDataInputMap.put(3, new PasswordChangeInput());

    }
    public UserDataInput getUserDataInput(Integer parameters){
        return userDataInputMap.get(parameters);
    }
}
