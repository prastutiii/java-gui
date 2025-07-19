/*Store Class accepts 6 parameters, sets and stores the value and displays it.
 * Author's name: Prastuti Acharya, 23056304
 */
public class Store
{
    
    /*Declaring attributes of class
     *(declaring as private to apply encapsulation) */
    private String storeName;
    private String location;
    private String openingHour;
    private int storeID;
    private double totalSales;
    private double totalDiscount;
    
    //These four parameters are accepted by the constructor 
    public Store(int storeID, String storeName, String location, String openingHour)
    {
        
        //Initializing the value of totalSales and totalDiscount
        this.totalSales = 0.0;
        this.totalDiscount = 0.0;
        
        //Assigning parameter values
        this.storeID = storeID;
        this.storeName = storeName;
        this.location = location;
        this.openingHour = openingHour;
    }
    
    //Making corresponding accessor method(aka getter method) for each attribute
    
    public int getStoreID()
    {
        return this.storeID;
    }
    
    public String getStoreName()
    {
        return this.storeName;
    }
    
    public String getLocation()
    {
        return this.location;
    }
    
    public String getOpeningHour()
    {
        return this.openingHour;
    }
    
    public double getTotalSales()
    {
        return this.totalSales;
    }
    
    public double getTotalDiscount()
    {
        return this.totalDiscount;
    }
    
    //Creating a method to set total sales
    public void setTotalSales(double totalSales)
    {
        
        //To add the new value to the previous variable value
        this.totalSales = totalSales;
    }
    
    //Creating a method to set total discount
    public void setTotalDiscount(double totalDiscount)
    {
        
        //To add the new value to the previous variable value
        this.totalDiscount = totalDiscount;
    }
    
    //Creating a display method
    public void display()
    {
        //Displaying the attributes
        System.out.println ("Store ID: " + storeID);
        System.out.println ("Store Name: " + storeName);
        System.out.println ("Location: " + location);
        System.out.println ("Opening Hour: " + openingHour);
        
        //Checking whether the total sales and total discount is zero or not
        if (totalSales == 0.0){
            System.out.println ("Total Sales: Null");
        }
        else{
            //Displaying total sales
            System.out.println ("Total Sales: " + totalSales);
        }
        if (totalDiscount == 0.0){
            System.out.println ("Total Discount: Null");
        }
        else{
            System.out.println ("Total Discount: " + totalDiscount);
        }
    }
}
