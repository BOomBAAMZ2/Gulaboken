import java.util.Scanner;
import java.util.List;
public class removeprofile {

    private List<profiles> allProfiles;

    public removeprofile(List<profiles> allProfiles) {
        this.allProfiles = allProfiles;
    }

    public void removeMenu() {

        Scanner removeScan = new Scanner(System.in);

        while (true) {
            System.out.println("\033[36m1. Remove a profile. \n2. Exit to admin menu." + "\033[0m");

            if (removeScan.hasNextInt()) {
                int selection = removeScan.nextInt();

                if (selection == 1) {
                    System.out.println("Type in the name & lastname of the profile you want to remove");
                    String nameField = removeScan.next();
                    String lastnameField = removeScan.next();
                    for (profiles profile : allProfiles) {
                        if (profile.getName().equalsIgnoreCase(nameField) && profile.getLastname().equalsIgnoreCase(lastnameField)){
                            allProfiles.remove(profile);
                            System.out.println("Profile removed");
                            removeMenu();
                        }
                    }
                } else if (selection == 2) {
                    System.out.println("Exiting remove profile");
                    adminmenu.menuAdmin(allProfiles);
                }

            } else {
                System.out.println("\033[31mInvalid input. Please enter a number" + "\033[0m");
                removeScan.next();
            }
        }
    }
}
