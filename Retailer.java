/*Retailer Class accepts 4 new parameters along with parameters of super class, sets and stores its values
 * it calculates loyalty point and removes products older than 1 year and displays it
 * Author's name: Prastuti Acharya, 23056304
 */
public class Retailer extends Store
{
    //Declaring attributes of the class with private access modifier
    private int vatInclusivePrice;
    private int loyaltyPoint;
    private boolean isPaymentOnline;
    private String purchasedYear;
    
    //Creating a constructor
    public Retailer(int storeID, String storeName, String location, 
    String openingHour, double totalSales, double totalDiscount, 
    int vatInclusivePrice, boolean isPaymentOnline, String purchasedYear)
    {
        //Calling constructor from super class
        super(storeID, storeName, location, openingHour);
        super.setTotalSales (totalSales);
        super.setTotalDiscount (totalDiscount);
        
        //Initializing the values
        this.vatInclusivePrice = vatInclusivePrice;
        this.isPaymentOnline = isPaymentOnline;
        this.purchasedYear = purchasedYear;
        this.loyaltyPoint = 0;
    }
    
    //Accessor method
    public int getVatInclusivePrice() 
    {
        return this.vatInclusivePrice;
    }
    
    public int getLoyaltyPoint() 
    {
        return this.loyaltyPoint;
    }
    
    public boolean getIsPaymentOnline() 
    {
        return this.isPaymentOnline;
    }
    
    public String getPurchasedYear() 
    {
        return this.purchasedYear;
    }
    
    //Mutator method
    public void setIsPaymentOnline(boolean isPaymentOnline)
    {
        this.isPaymentOnline = isPaymentOnline;
    }
    
    //Calculating Loyalty Point
    public double setLoyaltyPoint(boolean isPaymentOnline, int vatInclusivePrice) 
    {
        //If-else condition
        if (isPaymentOnline == true) { 
            this.loyaltyPoint = (vatInclusivePrice * 1/100);
        }
        
        else {
        }
        return (this.loyaltyPoint);
    }
    
    //Removing the product if the following condition is satisfied
    public void removeProduct() 
    {
        if (loyaltyPoint == 0 && (purchasedYear.equals("2020") || 
        purchasedYear.equals("2021") || purchasedYear.equals("2022"))) {
            this.vatInclusivePrice = 0;
            this.loyaltyPoint = 0;
            this.isPaymentOnline = false; 
        }
        else{
        }
    }
    
    //Display method
    public void display() 
    {
        if (vatInclusivePrice == 0){
            //Calling display method from super class
            super.display();
            System.out.println ("This product has been removed");
        }
        else{
            super.display();
            System.out.println ("VAT Inclusive Price: " + vatInclusivePrice);
            System.out.println ("Loyalty Point: " + loyaltyPoint);
            System.out.println ("Purchased Year: " + purchasedYear);
        }
    }
}