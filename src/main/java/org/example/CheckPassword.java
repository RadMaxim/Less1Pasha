package org.example;

public class CheckPassword {
    //124546elkrfei
    //elkrfei
    //esrvewrvукпукпукпукпукпукп
    //esrvewrv
    public static boolean checkPassword(String password){
        if (password.length()<=0 ||password.length()>30){
            System.err.println("Error, this password is a very short or long");
            return false;
        }
        if (password.length()-password.replaceAll("[0-9]","").length()<3){
            System.err.println("Error: This password has less 3 number");
            return false;
        }
        if (password.replaceAll("[А-Яа-я]","").length()!=password.length()){
            System.err.println("Error, This password has russia letter...");
            return false;
        }

        return true;

    }
}
