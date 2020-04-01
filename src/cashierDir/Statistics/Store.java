package cashierDir.Statistics;

import java.util.ArrayList;

public class Store {
    private String storeID;
    private ArrayList<Employee> employees = new ArrayList<>();
    private int storeSale;
    private int storeBugdet;


    public Store(String storeID){
        this.storeID = storeID;
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


}
