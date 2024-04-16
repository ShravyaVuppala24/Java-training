package org.webservice;

public class WelcomeName {
    public static String printWelcomeName(String uname)
    {
        return "Welcome to Homepage "+uname;
    }
    public static String printWelcomeName(String uname, Integer uage)
    {
        return "Welcome to Homepage "+uname +" "+uage;
    }
}
