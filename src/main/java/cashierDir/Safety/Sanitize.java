package cashierDir.Safety;

import cashierDir.Exceptions.FailedToSanitizeException;

import java.util.ArrayList;

public class Sanitize {

    public static String santizeString (String toSanitize){

        return toSanitize.replaceAll("[^A-Z.Æ.Ø.Åa-z.æ.ø.å0-9 ]", "");
    }

    public static void sanitizeSeveralStrings (ArrayList<String> list) throws FailedToSanitizeException {

        ArrayList<String> newList = new ArrayList<String>();
        ArrayList<String> oldLengths = new ArrayList<String>();

        oldLengths.addAll(list);

        for (String str : list){
            String sanitized = santizeString(str);

            newList.add(sanitized);
        }

        for (int i = 0; i < list.size(); i++){
            if (oldLengths.get(i).length() != newList.get(i).length()){
                System.out.println(oldLengths.get(i));
                System.out.println(newList.get(i));
                throw new FailedToSanitizeException("");
            }
        }
    }
}
