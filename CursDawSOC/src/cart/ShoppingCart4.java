package cart;

public class ShoppingCart4 {

    public static void main(String[] args) {
        // local variables
        String custName = "Mary Smith";
        int llarg = 4;
               
        
        //Declare and initialize the items String array
        String[] Camisa = new String[llarg];


        // Change message to show the number of items purchased.
        String message = custName + " wants to purchase a "+ Camisa.length + " items.";

        System.out.println(message);
        
        // Print an element from the items array.  
        System.out.println("element 4 del array: "+Camisa[3]);
        
    }

}
