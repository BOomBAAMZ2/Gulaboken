import java.util.Scanner;
import java.util.List;
public class adminmenu {

    public static void menuAdmin(List<profiles> allProfiles) {
        System.out.println("\033[31mYou are now in the admin menu" + "\033[0m");

        Scanner adminScan = new Scanner(System.in);
        addprofile addProfile = new addprofile(allProfiles);
        searchprofile searchProfile = new searchprofile(allProfiles);
        removeprofile removeProfile = new removeprofile(allProfiles);
        updateprofile updateProfile = new updateprofile(allProfiles);

        while (true) {
            System.out.println("\033[0m1. Search for profiles. \n2. Add new profile. \n3. Remove a profile. \n4. Update profile information. \n5. View current profiles. \n6. Exit to main menu" + "\033[0m");

            if (adminScan.hasNextInt()) {

                int selection = adminScan.nextInt();

                if (selection == 1) {
                    System.out.println("Loading...");
                    Menu.performDelay(300);
                    System.out.println("Section: Search for profiles");
                    searchProfile.searchMenu();
                } else if (selection == 2) {
                    System.out.println("Loading...");
                    Menu.performDelay(300);
                    System.out.println("Section: Add new profile");
                    addProfile.addMenu();
                } else if (selection == 3) {
                    System.out.println("Loading...");
                    Menu.performDelay(300);
                    System.out.println("Section: Remove a profile");
                    removeProfile.removeMenu();
                } else if (selection == 4) {
                    System.out.println("Loading...");
                    Menu.performDelay(300);
                    System.out.println("Section: Update profile information");
                    updateProfile.updateMenu();
                } else if (selection == 5) {
                    System.out.println("Current profiles: ");
                    DisplayAllProfiles.displayProfiles(allProfiles);
                } else if (selection == 6) {
                    System.out.println("Exiting to main menu");
                    Menu.superMenu(allProfiles);
                } else {
                    System.out.println("\033[31mInvalid number selection. Please chose a valid option" + "\033[0m");
                }
            } else {
                System.out.println("\033[31mInvalid input. Please enter a number" + "\033[0m");
                adminScan.next();
            }
        }
    }
}
