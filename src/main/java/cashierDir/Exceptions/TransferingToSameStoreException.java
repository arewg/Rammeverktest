package cashierDir.Exceptions;

public class TransferingToSameStoreException extends Throwable {
    public TransferingToSameStoreException(String s) {
        System.out.println("Cannot transfer to same store");
    }
}
