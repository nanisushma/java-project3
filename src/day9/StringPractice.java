package day9;

import java.util.Arrays;

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


        String policyReturned = "UL100006,06000001 AL00006,";

        String firstPolicy = policyReturned.substring(0,8);
        System.out.println(firstPolicy);

        String secondPolicy = policyReturned.substring(10,18);
        System.out.println(secondPolicy);

        String thirdPolicy = policyReturned.substring(19,23);
        System.out.println(thirdPolicy);

        //Split

        String[] splittedPolicies = policyReturned.split(",");
        System.out.println(Arrays.toString(splittedPolicies));

        System.out.println(splittedPolicies[0]);
        System.out.println(splittedPolicies[01].trim());


        //
        //String ANB = "12 Months";
       // String[] ageArray = ANB.split( " ");
        //System.out.println(ageArray[0]);
       // System.out.println(ageArray[1].trim());

        String ANB = "12 Year";
        String[] ageArray = ANB.split( " ");
        System.out.println(ageArray[0]);
        System.out.println(ageArray[1].trim());

        //Compareto

        String a = "a";
        String e = "e";

        int compared = a.compareTo(e); // a-e

        System.out.println(compared);

        int compare = e.compareTo(a); // e-a (-, 0,+)

        System.out.println(compare);


        String b = "b";
        String B = "B";

        int compares = b.compareToIgnoreCase(e);//
        System.out.println(compared);

        String c = "Taman";
        String d = "Ram";

        int compared1 = c.compareToIgnoreCase(d);
        System.out.println(compared);

        String greeting = "Hello".concat("Taman").concat("How are you?").concat("How you doing?");
        System.out.println(greeting);

        String greetings = "Hi"+ "How was your day?" + "How is your work going?"; // we can use + sign as concat
        System.out.println(greetings);

        // Contents helps to find any data or word

        boolean isTamanContained =greetings.toLowerCase().contains("taman");
        System.out.println(isTamanContained);

        String number = String.valueOf(2); // When you use string value you can use any data type
        String numbers = 2 +""+3+""; //String value added with concat


        String fullName = "Taman Neupane";
        String verifiactionEmailLink = "http://somedomain.com/verify/asdsd414";
        String combineString = "Hello !" + fullName + "Welcome to our website" +"Please click on this link to verify your email address"+"verificationEmaillink";

        StringBuilder builder = new StringBuilder();
        builder.append("Hello !");
        builder.append(fullName);
        builder.append("Welcome to our website.");
        builder.append("please click on this link to verify your email address");
        builder.append("verificationEmailLink");

        String builderCombinedString = builder.toString();

        System.out.println(combineString);
        System.out.println(builderCombinedString);

















    }
}

