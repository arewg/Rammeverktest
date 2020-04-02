package cashierDir.Storage;


import cashierDir.Safety.Sanitize;


public final class ChangeItemStatus {

    public static void change (Item item, String newStatus){

        String sanitizedStatus = Sanitize.santizeString(newStatus);

        if (newStatus.equals(sanitizedStatus)){
            if (item.getStatus().equals(sanitizedStatus)){
                return;
            }
            item.setStatus(sanitizedStatus);
        }
    }
}
