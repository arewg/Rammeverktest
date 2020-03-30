package cashierDir.Storage;

public final class ChangeItemStock {

    public static void reduceStock(Item item, int reduceBy){

        if(reduceBy > 0) {
            int newNumberInStock = item.getNumberInStock() - reduceBy;
            item.setNumberInStock(newNumberInStock);
        }
        isRestockNecessary(item);
    }

    private static void isRestockNecessary(Item item){
        if (item.getNumberInStock() < 3){
            //Gi tilbakemelding på at antallet begynner å bli lite, og at en bestilling kan være lurt.
        }
    }

    public static void increaseStockForOneItem(Item item, int increaseBy) {
        if (increaseBy > 0) {
            int newNumberInStock = (item.getNumberInStock()) + increaseBy;
            item.setNumberInStock(newNumberInStock);
        }
    }

    //Increase stock from arrived/complete order
    public static void increaseStockFromArrivedOrder (Order order) {
        //Iterates through and uses either of the two methods above.
    }

}
