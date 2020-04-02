package cashierDir.Exceptions;


public class FailedToSanitizeException extends Throwable {

    public FailedToSanitizeException(String message){
        System.out.println("Failed to sanitize" + message);
    }

}
