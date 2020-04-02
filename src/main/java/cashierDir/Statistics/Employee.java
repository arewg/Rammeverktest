package cashierDir.Statistics;
import cashierDir.Storage.Item;
import cashierDir.Person;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Employee extends Person {

    private String id;
    private ArrayList<Item> itemsSold = new ArrayList<>();
    private float sales;
    private float budget;
    private Date dateSold;

    public Employee(String firstName, String lastname, String email, int phoneNumber) {
        super(firstName, lastname, email, phoneNumber);
        // Får utgitt id i databasen
        this.id = "";
    }


    public void setSales(float sales) {
        this.sales = sales;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Item> getItemsSold() {
        System.out.println();
        return itemsSold;
    }

    public float getSales() {
        System.out.println();
        return sales;
    }

    public float getBudget() {
        System.out.println();
        return budget;
    }

    public Date getDateSold() {
        System.out.println();
        return dateSold;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public void setItemsSold(ArrayList<Item> itemsSold) {
        this.itemsSold = itemsSold;
    }

    public void setDateSold(Date dateSold) {
        this.dateSold = dateSold;
    }

}
