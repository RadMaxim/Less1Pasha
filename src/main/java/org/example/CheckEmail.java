package org.example;

public class CheckEmail {
    public static boolean checkEmail(String email){
        if (email.contains("gmail.com") || email.contains(".com"))
        {
            System.err.println("Error: Email is not correct...");
            return false;
        }
        if (email.replaceAll("\\.","").length()==email.length())
        {
            System.err.println("Error: This string is not point....");
            return false;
        }
        if (email.replaceAll("@","").length()==email.length())
        {
            System.err.println("Error: This string is not @....");
            return false;
        }

        return true;
    }
}
