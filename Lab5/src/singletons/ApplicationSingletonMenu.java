package singletons;

public class ApplicationSingletonMenu {
    public static void main(String[] args) {
        SingletonMenu menu = SingletonMenu.getSingletonMenuInstance();
        SingletonMenu menu2 = SingletonMenu.getSingletonMenuInstance();

        System.out.println(menu.equals(menu2)); // intoarce true

        menu.addOption("Start");
        menu.addOption("Settings");
        menu.addOption("Quit");
        System.out.println(menu.getMenuOptions());

        menu.removeOption("Settings");
        System.out.println(menu.getMenuOptions());
    }
}
