import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        //creates and add new arraylist of customers into the instance customers
        customers.add(new Customer("John","Jones","JJ369"));
        customers.add(new Customer("Janet","Jackson","MJ6s"));
        customers.add(new Customer("Jexus","Krist","Aura01"));
        displayCustomers(customers);// call the display method in main to enable it

    }
    //makes a method that displays customers added into arraylist customers
    public static void displayCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer); //print out customer
        }

    }
}