package CodesOfJava;

//1. Reverse a String

public class ReverseString {

    public static void main(String[] args) {
    
    String str = "Automation";
    
    StringBuilder reversed = new StringBuilder(str).reverse();
    
    System.out.println(reversed);
    }
}

