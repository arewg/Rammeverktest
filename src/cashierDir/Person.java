package cashierDir;

public  class Person {

    private String firstName;
    private String lastname;
    private String email;
    private int phoneNumber;


    //Legge til builderpattern
    public Person() {
    }

    public Person(String firstName, String lastname, String email, int phoneNumber) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                '}';
    }
}
