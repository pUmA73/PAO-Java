package singletons;

import java.util.ArrayList;
import java.util.List;

public class SingletonMenu {
    private static SingletonMenu menuInstance;
    private List<String> menuOptions = new ArrayList<>();

    // facem constructorul private pentru a nu putea fi instantiat
    private SingletonMenu() {}

    public static SingletonMenu getSingletonMenuInstance() {
        if(menuInstance == null) {
            menuInstance = new SingletonMenu();
        }
        return menuInstance;
    }

    public List<String> getMenuOptions() {
        return menuOptions;
    }

    public void addOption(String option) {
        menuOptions.add(option);
    }

    public void removeOption(String option) {
        menuOptions.removeIf(opt -> opt.equals(option));
    }
}
