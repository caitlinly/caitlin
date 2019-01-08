package sample;

public class Friend {
    private String firstName;
    private String lastName;

    Friend(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }

    //Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}
