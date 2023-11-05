import java.util.Scanner;
import java.util.List;

public class guestsearch {

    private List<profiles> allProfiles;

    public guestsearch(List<profiles> allProfiles) {
        this.allProfiles = allProfiles;
    }

    public void searchMenu() {

        Scanner search = new Scanner(System.in);

        while (true) {
            System.out.println("\033[33m1. Search for profile. \n2. Exit to guest menu" + "\033[0m");

            if (search.hasNextInt()) {
                int selection = search.nextInt();

                if (selection == 1) {
                    System.out.println("\033[34mType in the profile you want to search for" + "\033[0m");
                    System.out.println("\033[34mUse name, lastname or streetname" + "\033[0m");
                    String searchfield = search.next();
                    for (profiles profile : allProfiles) {
                        if (profile.getLastname().equalsIgnoreCase(searchfield) || profile.getName().equalsIgnoreCase(searchfield) || profile.getStreetname().equalsIgnoreCase(searchfield)) {
                            System.out.println("\033[31mProfile found:\033[0m");
                            System.out.println("\033[32mName: " + profile.getName() + "\033[0m");
                            System.out.println("\033[32mEmail: " + profile.getLastname() + "\033[0m");
                            System.out.println("\033[32mAge: " + profile.getAge() + "\033[0m");
                            System.out.println("\033[32mTown: " + profile.getTown() + "\033[0m");
                            System.out.println("\033[32mPostcode: " + profile.getPostcode() + "\033[0m");
                            System.out.println("\033[32mStreetname: " + profile.getStreetname() + "\033[0m");
                            System.out.println("\033[32mPhonenumber: " + profile.getPhonenumber() + "\033[0m");
                            if (profile.getPhonenumber2() == 0) {
                                continue;
                            } else {
                                System.out.println("\033[32mPhonenumber 2: " + profile.getPhonenumber2() + "\033[0m");
                            }
                        }
                    }

                } else if (selection == 2) {
                    System.out.println("Exiting search profile");
                    guestmenu.menuGuest(allProfiles);
                } else {
                    System.out.println("Invalid selection");
                }
            } else {
                System.out.println("Invalid input, please use numbers");
                search.next();
            }
        }
    }
}