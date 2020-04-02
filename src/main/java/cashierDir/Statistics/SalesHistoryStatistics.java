package main.java.cashierDir.Statistics;

import java.time.LocalDate;

public class SalesHistoryStatistics<T> {

    private LocalDate date;
    private float sales;
    private float budget;
    private cashierDir.Storage.Item item;

    public LocalDate getDate() {
        return date;
    }

    public float getSales() {
        return sales;
    }

    public cashierDir.Storage.Item getItem() {
        return item;
    }

    public float getBudget() {
        return budget;
    }
}