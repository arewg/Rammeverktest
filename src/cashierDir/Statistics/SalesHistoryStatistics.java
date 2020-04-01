package cashierDir.Statistics;

import cashierDir.Storage.Item;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class SalesHistoryStatistics<T> {

    private LocalDate date;
    private float sales;
    private float budget;
    private Item item;

    public LocalDate getDate() {
        return date;
    }

    public float getSales() {
        return sales;
    }

    public Item getItem() {
        return item;
    }

    public float getBudget() {
        return budget;
    }
}
