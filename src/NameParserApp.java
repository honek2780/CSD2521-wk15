// Purpose: Write an application that parses full names into first and last
// name or first, middle, and last name, depending on whether the user enters
// a string consisting of two or three words. The output for the application
// should look something like the textbook.
// Kenna Hone
// November 22, 2021
// @author honek



public class NameParserApp {


    public static void main(String[] args) {
        
        String email;  
        int space;   
        int space2;
        String user; 
        String domain;  
        String host;
       
        email = "sample@google.com";
        space = email.indexOf('@');
        space2 = email.indexOf('.');
        user = email.substring(0, space);
        
        domain = email.substring(space2 + 1);
        host = email.substring(space + 1);

        System.out.println(user);
        System.out.println(domain);
        System.out.println(host);
        
    }

}

