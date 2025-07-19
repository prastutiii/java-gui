/*Department Class accepts 4 new parameters along with the parameters of super class, sets and stores its values
 * it also calculates discount price and selling price and displays it
 * Author's name: Prastuti Acharya, 23056304
 */
public class Department extends Store
{ 
    //Declaring attributes of the class with private access modifier
    private String productName;
    private double markedPrice;
    private double sellingPrice;
    private boolean isInSales;
    
    //Constructor method
    public Department(int storeID, String storeName, String location, 
    String openingHour, double totalSales, double totalDiscount, 
    String productName, double markedPrice)
    {
        //Calling super class constructor
        super(storeID, storeName, location, openingHour);
        super.setTotalSales (totalSales);
        super.setTotalDiscount (totalDiscount);
        
        //Initializing the values 
        this.isInSales = true;
        this.sellingPrice = 0.0;
        
        this.productName = productName;
        this.markedPrice = markedPrice;
    }
    
    //Accessor method
    public String getProductName()
    {
        return this.productName;
    }
    
    public double getMarkedPrice()
    {
        return this.markedPrice;
    }
    
    public double getSellingPrice()
    {
        return this.sellingPrice;
    }
    
    public boolean getIsInSales()
    {
        return this.isInSales;
    }
    
    //Mutator method
    public void setMarkedPrice(double markedPrice)
    {
        this.markedPrice = markedPrice;
    }
    
    //Calculation of Discount Price
    public double calculateDiscountPrice(boolean isInSales, double markedPrice)
    {
       double discount = 0.0;
       /*Checking the initial condition
        * Using nested if condition (only executes the condition if initial condition is true)
        * Setting the value of discount */
        if (isInSales == true) {
           if (markedPrice >= 5000){
               discount += 0.20;
           }
           else if (markedPrice < 5000 && markedPrice >= 3000) {
               discount += 0.10;
           }
           else if (markedPrice < 3000 && markedPrice >= 1000) {
               discount += 0.05;
           }
           else{
               discount += 0.0;
           }
           }
        else{
        }
       
       //Calling mutator method from super class
       super.setTotalDiscount (markedPrice * discount);
       
       //Calculating selling price
       this.sellingPrice = markedPrice - (markedPrice * discount);
       
       //Setting isInSales to false
       this.isInSales = false;
       
       return (this.sellingPrice);
    }
    
    //Display method
    public void display()
    {
        //Calling the diplay method of super class
        super.display();
        
        System.out.println ("Product Name: " + productName);
        
        //checking the given condition
        if (isInSales == true) {
            System.out.println ("Marked Price: " + markedPrice);
        }
        else{
            System.out.println ("Selling Price: " + sellingPrice);
        }
    }
}
        
