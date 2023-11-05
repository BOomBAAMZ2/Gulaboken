import java.util.Scanner;
import java.util.List;
public class updateprofile {

    private List<profiles> allProfiles;

    public updateprofile(List<profiles> allProfiles){
        this.allProfiles = allProfiles;
    }

    public void updateMenu() {

        Scanner updateScan = new Scanner(System.in);

        while (true) {
            System.out.println("\033[36m1. Update a profile. \n2. Exit to admin menu." + "\033[0m");

            if (updateScan.hasNextInt()) {
                int selection = updateScan.nextInt();

                if (selection == 1) {
                    System.out.println("Type in the name & lastname of the profile you want to update");
                    String nameField = updateScan.next();
                    String lastnameField = updateScan.next();
                    for (profiles profile : allProfiles) {
                        if (profile.getName().equalsIgnoreCase(nameField) && profile.getLastname().equalsIgnoreCase(lastnameField)){
                            while (true) {
                                System.out.println("What information do you wanna update?");
                                System.out.println("\033[0m1. Name \n2. Lastname \n3. Age \n4. Town \n5. Postcode \n6. Streetname \n7. Phonenumber \n8. \033[31mExit to update profile" + "\033[0m");
                                int selection2 = updateScan.nextInt();
                                if (selection2 == 1){
                                    System.out.println("Type in the new name");
                                    String newName = updateScan.next();
                                    profile.setName(newName);
                                    System.out.println("\033[32mProfile name updated" + "\033[0m");

                            } else if (selection2 == 2){
                                    System.out.println("Type in the new lastname");
                                    String newLastname = updateScan.next();
                                    profile.setLastname(newLastname);
                                    System.out.println("\033[32mProfile lastname updated" + "\033[0m");

                                } else if (selection2 == 3){
                                    System.out.println("Type in the new age");
                                    int newAge = updateScan.nextInt();
                                    profile.setAge(newAge);
                                    System.out.println("\033[32mProfile age updated" + "\033[0m");

                                } else if (selection2 == 4){
                                    System.out.println("Type in the new town");
                                    String newTown = updateScan.next();
                                    profile.setTown(newTown);
                                    System.out.println("\033[32mProfile town updated" + "\033[0m");

                                } else if (selection2 == 5){
                                    System.out.println("Type in the new postcode");
                                    int newPostcode = updateScan.nextInt();
                                    profile.setPostcode(newPostcode);
                                    System.out.println("\033[32mProfile postcode updated" + "\033[0m");

                                } else if (selection2  == 6){
                                    System.out.println("Type in the new streetname");
                                    String newStreetname = updateScan.next();
                                    int newStreetnumber = updateScan.nextInt();
                                    profile.setStreetname(newStreetname);
                                    profile.setStreetnumber(newStreetnumber);
                                    System.out.println("\033[32mProfile streetname updated" + "\033[0m");

                                } else if(selection2 == 7){
                                    System.out.println("Type in the new phonenumber");
                                    int newPhonenumber = updateScan.nextInt();
                                    profile.setPhonenumber(newPhonenumber);
                                    System.out.println("\033[32mProfile phonenumber updated" + "\033[0m");

                                } else if(selection2 == 8){
                                    System.out.println("\033[31mExiting to update profile" + "\033[0m");
                                    updateMenu();
                                }
                            }
                        }
                    }
                } else if (selection == 2) {
                    adminmenu.menuAdmin(allProfiles);
                }
            } else {
                System.out.println("Invalid input, please select a number");
                updateScan.next();
            }
        }
    }
}
