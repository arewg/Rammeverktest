package cashierDir.Storage;


public final class TransferItems {

    public void toStore(Item item, int numberOfItem, int storeId) throws TransferingToSameStoreException {

            int belongsToStoreBeforeTransaction = item.getBelongsToStoreId();

            if (belongsToStoreBeforeTransaction == storeId){
                throw new TransferingToSameStoreException("");
            }

            // Noe databasegreier for å øke Store som mottar sin stock
        // deretter fjerne fra avsenders stock.

    }
}
