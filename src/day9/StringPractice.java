package day9;

public class StringPractice {

    public static void main(String[] args) {

        String name = new String("Karki");
        String name1 = new String("Karki");

        boolean isInSameMemoryLocation = name == name1; // never use for quality test in object
        System.out.println(isInSameMemoryLocation);

        boolean isInSameMemoryLocation1 = name.equals(name1); //always use .equals method
        System.out.println(isInSameMemoryLocation1);


        //Some important function of Strings

        String sentence = "A quick brown fox jumps over lazy dog";
        int lengthOfSentence= sentence.length();
        System.out.println(lengthOfSentence);

        //char character = sentence.charAt(12);
        //System.out.println(character);

        char character = sentence.charAt(sentence.length()-1);
        System.out.println(character);

        String emailSaved = "nani.nanisushma@gmail.com";
        String email = "  nani.nanisushma@gmail.com";

        boolean isBothEmailSame = emailSaved.equals(email);
        System.out.println(isBothEmailSame);

        String sanitizedEmail = email.trim();
        boolean isBothEmailSame1 = emailSaved.equals(sanitizedEmail);
        System.out.println(isBothEmailSame1);



        String emptyString = "    ";

        String sanitizedEmptyString = emptyString.trim();

        System.out.println("Empty :" +emptyString.isEmpty());
        //System.out.println("Blank:" +emptyString.isBlank());

        String usernameSaved = "Karki";
        String username = "karki";

        String usernameSavedLower = usernameSaved.toLowerCase();
        String userNameLower = username.toLowerCase();


        boolean isSame = usernameSaved.equalsIgnoreCase(username);
        System.out.println(isSame);

        boolean isSame1 = usernameSavedLower.equalsIgnoreCase(userNameLower);
        System.out.println(isSame1);







    }
}

