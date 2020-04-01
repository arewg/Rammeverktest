package cashierDir;

import cashierDir.Statistics.Employee;
import cashierDir.Statistics.Store;
import cashierDir.Storage.Item;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        Item item = new Item.Builder().setName("bolle").build();
        Item item2 = new Item.Builder().setName("brus").build();
        Item item3 = new Item.Builder().setName("kake").build();
        Item item4 = new Item.Builder().setName("sjokolade").build();
        Item item5 = new Item.Builder().setName("jordbær").build();

        Date date = new Date();


        Employee employee = new Employee("blendi", "lastname", "email", 123);
        employee.getItemsSold().add(item);
        employee.getItemsSold().add(item2);

        Employee employe2 = new Employee("are", "aresen", "lol", 321);
        employe2.getItemsSold().add(item3);
        employe2.getItemsSold().add(item4);


/*
        Statistics<Employee> statistics = new Statistics<>();
        statistics.getAllData(employee);

        statistics.getAllData(employe2);
        employee.getDateHashMap().put(item, date);
        System.out.println(employee.getDateHashMap());

 */

        Store newStore = new Store("XXL");

        newStore.getEmployees().add(employee);
        newStore.getEmployees().add(employe2);

        employee.getDateHashMap().put(item, date);
        employee.getDateHashMap().put(item2, date);

        System.out.println(newStore.getEmployees());


    }
}
