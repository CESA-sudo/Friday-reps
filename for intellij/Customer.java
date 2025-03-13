public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    static int counter = 0;

    Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = counter++;
    }

    public String getFirstname(){
        return firstName;
    }
    public String getLastname(){
        return lastName;
    }
    public String getUsername(){
        return userName;
    }
    public int getId(){
        return id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.firstName = firstName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    @Override
    public String toString(){
        return"Customer ID: "+id+" First Name: "+firstName+" Last Name: "+lastName+" Username: "+userName;

    }

}
