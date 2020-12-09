/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmanipulation;
import java.util.Scanner;

public class StringManipulation {
    static Scanner SC = new Scanner(System.in);
    static String StringManipulation;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Would you like to use the menu? :");   
        String Initiation = SC.nextLine();
        if (Initiation == "yes");
            System.out.println("Choose an option from the menu (1-7):         toLowerCase();\n" +
"        To Upper Case : 1           \n" +
"        To Lower Case : 2           \n" +
"        Equals : 3                  \n" +
"        Equals Ignore Case : 4      \n" +
"        Trim : 5                    \n" +
"        charAt : 6                  \n" +
"        Concatenation : 7           \n" +
"        Length : 8                  \n"); 
            StringManipulation = SC.nextLine();
            if (StringManipulation == "1"){
                toLowerCase();
            }
            else if (StringManipulation == "2"){ 
               toUpperCase();
            }
            else if (StringManipulation == "3"){
                equals();
            }
            else if (StringManipulation == "4"){
                equalsIgnoreCase(); 
            }
            else if (StringManipulation == "5"){
                trim();
            }
            else if (StringManipulation == "6"){
                charAt(); 
            }
            else if (StringManipulation == "7"){
                concat();
            }
            else if (StringManipulation == "8"){
                length();  
        }
    }
        
    public static void toLowerCase(){
	String s1 = "UPPERCASE";
	String s2 = s1.toLowerCase();
        System.out.println(s2);
    } //end of method
    
    public static void toUpperCase(){
	String s1 = "lowercase";
	String s2 = s1.toUpperCase();
        System.out.println(s2);
    } //end of method
    
    public static void equals(){
	String s1 = "password";
	
        if (s1.equals("Password")) {
        System.out.println("login successful");
        } else {
        System.out.println("login unsuccessful");
        }
    } //end of method
    
    public static void equalsIgnoreCase(){
	String s1 = "Yes";
	String s2 = "No";
	
        if (s1.equalsIgnoreCase("yes")) {
        System.out.println("Selection successful");
        } else if (s1.equalsIgnoreCase("no")) {
        System.out.println("Selection unsuccessful");
        } else {
        System.out.println("Something went wrong");
    } 
    } //end of method
    
    public static void trim(){
	String s1 = "  Yes  ";
	String s2;
	
        System.out.println(s1);
        s2 = s1.trim();

        System.out.println(s2);
        
    } //end of method
    public static void charAt(){
	String firstName = "John";
	String surname  = "Wayne";
	char initial = firstName.charAt(0);

        System.out.println("Hello, Mr " + initial + " "  + surname);
        
    } //end of method
    public static void concat(){
	String firstName = "John";
	String surname  = "Wayne";
        String concat = firstName.concat(" "  + surname);

        System.out.println(concat);
    } //end of method
    public static void length(){
	String password = "Special Password";
        System.out.println("is your password long enough?");

        if (password.length() > 20 ){
            System.out.println("yes, your password is long enough");
    } //end of method

    }
}


