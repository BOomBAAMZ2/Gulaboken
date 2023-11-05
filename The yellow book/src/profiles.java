
public class profiles {

    public String name;
    public String lastname;
    public int age;
    public String town;
    public int postcode;
    public String streetname;
    public int streetnumber;
    public int phonenumber;
    public int phonenumber2;

    public profiles(String name, String lastname, int age, String town, int postcode, String streetname, int streetnumber, int phonenumber, int phonenumber2){
        this.name=name;
        this.lastname=lastname;
        this.age=age;
        this.phonenumber=phonenumber;
        this.phonenumber2=phonenumber2;
        this.town=town;
        this.postcode=postcode;
        this.streetname=streetname;
        this.streetnumber=streetnumber;
    }

    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public int getAge() {
        return age;
    }
    public int getPhonenumber() {
        return phonenumber;
    }
    public int getPhonenumber2() {
        return phonenumber2;
    }
    public String getTown() {
        return town;
    }
    public String getStreetname() {
        return streetname;
    }
    public int getStreetnumber() {
        return streetnumber;
    }
    public int getPostcode() {
        return postcode;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setLastname(String newLastname) {
        lastname = newLastname;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void setTown(String newTown) {
        town = newTown;
    }

    public void setPostcode(int newPostcode) {
        postcode = newPostcode;
    }

    public void setStreetname(String newStreetname) {
        streetname = newStreetname;
    }
    public void setStreetnumber(int newStreetnumber) {
        streetnumber = newStreetnumber;
    }

    public void setPhonenumber(int newPhonenumber) {
        phonenumber = newPhonenumber;
    }
    public void setPhonenumber2(int newPhonenumber2) {
        phonenumber2 = newPhonenumber2;
    }
}
