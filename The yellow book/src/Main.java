import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\033[31mWelcome to the " + "\033[33myellow" + "\033[31m book!");
        Menu MainMenu = new Menu();
        List<profiles> allProfiles = new ArrayList<>();

        MainMenu.superMenu(allProfiles);

    }
}
