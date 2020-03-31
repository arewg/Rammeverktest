package cashierDir.Statistics;
import cashierDir.Storage.Item;
import cashierDir.Person;


import java.time.LocalDate;
import java.util.ArrayList;

public class Employee extends Person {

    private int he2;
    private String id;
    private ArrayList<Item> itemsSold;
    private float sales;
    private float budget;
    private LocalDate dateSold;
    private ArrayList<String> arrayList;



    public Employee(String firstName, String lastname, String email, int phoneNumber) {
        super(firstName, lastname, email, phoneNumber);
        // Får utgitt id i databasen
        this.id = "";
        itemsSold = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public ArrayList<Item> getItemsSold() {
        return itemsSold;
    }

    public float getSales() {
        return sales;
    }

    public float getBudget() {
        return budget;
    }

    public LocalDate getDateSold() {
        return dateSold;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }
}
