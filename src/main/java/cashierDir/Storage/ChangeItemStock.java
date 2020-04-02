package cashierDir.Storage;

public final class ChangeItemStock {

    public static int stockLessThan;
    public static boolean checkRestockNecessary;

    public static void reduceStock(Item item, int reduceBy){

        int newNumberInStock = item.getNumberInStock() - reduceBy;

        if(reduceBy > 0 && reduceBy < 500) {
            item.setNumberInStock(newNumberInStock);
        }
        if (checkRestockNecessary != false) {
            isRestockNecessary(item);
        }
        if (newNumberInStock <= 0){
            if (!item.getStatus().equals("Sold out")) {
                ChangeItemStatus.change(item, "Sold out");
            }
        }
    }

    private static void isRestockNecessary(Item item){
        if (item.getNumberInStock() < stockLessThan){
            //Gi tilbakemelding på at antallet begynner å bli lite, og at en bestilling kan være lurt, satt til 3.
            System.out.println("The stock of " + item.getName() + " is under " +
                    stockLessThan + ". Consider restocking.");
        }
    }


    public static void increaseStockForOneItem(Item item, int increaseBy) {
        if (increaseBy > 0 && increaseBy < 500) {
            int newNumberInStock = (item.getNumberInStock()) + increaseBy;
            item.setNumberInStock(newNumberInStock);
        }
    }

    //Hvis man vil endre på hvilket antall du vil at systemet skal si i fra om det er for lite eller ikke?
    public static void setStockLessThan(int stockLessThan) {
        ChangeItemStock.stockLessThan = stockLessThan;
    }
}
