package cashierDir.Storage;


public class FailedToSanitizeException extends Throwable {

    public FailedToSanitizeException(String message){
        System.out.println("Failed to sanitize" + message);
    }

}
