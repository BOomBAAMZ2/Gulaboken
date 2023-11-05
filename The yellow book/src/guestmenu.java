import java.util.Scanner;
import java.util.List;
public class guestmenu {

    public static void menuGuest(List<profiles> allProfiles) {
        System.out.println("\033[35mYou are now in the guest menu" + "\033[0m");

        Scanner guestScan = new Scanner(System.in);
        guestsearch guestSearch = new guestsearch(allProfiles);

        while (true) {
            System.out.println("\033[0m1. Search for profiles. \n2. Exit to main menu" + "\033[0m");

            if (guestScan.hasNextInt()) {
                int selection = guestScan.nextInt();
                if (selection == 1) {
                    guestSearch.searchMenu();
                } else if (selection == 2) {
                    Menu.superMenu(allProfiles);
                }
            } else {
                System.out.println("Invalid input, please user numbers");
                guestScan.next();
            }
        }
    }
}
