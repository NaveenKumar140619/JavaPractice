


// creating class called Ticket
public class Ticket{

    // Creating calss Ticket with empty () constructor
   public Ticket() {
   }
    // Creating 3 private field variables in the class:  
    //- A field of type String called destination
    private String destination;

    //    - A field called price of type double
    private double price;

    //- A field called isReturn of type boolean
private boolean isReturn;

  // Add three methods to set the value of each field, called setDestination,
  // setPrice and setIsReturn.
public void setDestination (String destination){
    this.destination = destination;
}
public void price (double price){
    this.price = price;
}
public void isReturn( boolean isReturn){
    this.isReturn = isReturn;
}
  // Add a separate method to get the value of each field, called getDestination,
  // getPrice and getIsReturn.
public String getDestination (){
    return destination;
} 
public double getPrice(){
    return price;
}
public boolean getIsReturn(){
    return isReturn;
}
 
}