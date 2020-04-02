package main.java.cashierDir.Statistics;

import java.util.ArrayList;
import cashierDir.Statistics.Employee;

public class Store {
    private String storeID;
    private String name;
    private ArrayList<Employee> employees = new ArrayList<>();
    private int storeSale;
    private int storeBugdet;

    public Store(String storeID){
        this.storeID = storeID;
    }

    public final static class Builder{

        private String id;
        private String name;

        public Store.Builder setId(String id){
            this.id = id;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Store build() {
            return new Store(this);
        }
    }

    public Store(Store.Builder builder){
        this.storeID = builder.id;
        this.name = builder.name;
    }


    //Tar imot listen med ansatte til den spesifikke butikken og dersom ansatt finnes i listen returnerer den salgssummen til den ansatte
    public float getEmployeeSalesFromThisStore(ArrayList<Employee> employeesList, Employee employee ){
        if (employeesList.contains(employee)){
            return employee.getSales();
        }
        return 0;
    }

    public String getStoreID() {
        return storeID;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public int getStoreSale() {
        return storeSale;
    }

    public int getStoreBugdet() {
        return storeBugdet;
    }

    public void setStoreSale(int storeSale) {
        this.storeSale = storeSale;
    }

    public void setStoreBugdet(int storeBugdet) {
        this.storeBugdet = storeBugdet;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
