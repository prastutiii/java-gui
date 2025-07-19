import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class StoreGUI{
    private JFrame frame;
    private JPanel panel;
    private JLabel departmentLabel, retailerLabel;
    private JLabel storeIdL, storeNameL, locationL, openingHourL, totalSalesL, totalDiscountL, productNameL, markedPL, storeIdL2, isInSalesL, storeIdL3, storeNameL2, locationL2, openingHourL2, totalSalesL2, totalDiscountL2, vatL, isPayOnlineL, purchasedYearL, storeIdL4, isPayOnlineL2;    
    private JTextField storeIdTF, storeNameTF, locationTF, openingHourTF, totalSalesTF, totalDiscountTF, productNameTF, markedPTF, storeIdTF2, storeIdTF3, storeNameTF2, locationTF2, openingHourTF2, totalSalesTF2, totalDiscountTF2, vatTF, storeIdTF4;     
    private JComboBox yearCB, monthCB, dayCB;
    private JCheckBox iisTrue, iisFalse, ipoTrue1, ipoFalse1, ipoTrue2, ipoFalse2;
    private JButton addDepartment, calculateDiscount, D_display, D_clear,addRetailer, R_display, R_clear, setLoyaltyPoint, removeProduct;
    private JSeparator divider;
    private JScrollPane scroll;
    
    public StoreGUI(){
        frame = new JFrame("23056304 Prastuti Acharya");
        frame.setSize (2000, 2000);
        frame.setLayout (null);
        
        panel = new JPanel ();
        panel.setPreferredSize(new Dimension(2000, 2000));
        panel.setLayout(null);
        panel.setBackground(new Color(230,246,199));
        frame.add(panel);
        
        departmentLabel = new JLabel ("DEPARTMENT");
        departmentLabel.setBounds(600, 60, 230, 30);
        Font font = new Font("Serif", Font.BOLD, 30);
        departmentLabel.setFont(font);
        panel.add(departmentLabel);
        
        storeIdL = new JLabel ("Store ID:");
        storeIdL.setBounds(300, 140, 70, 30);
        panel.add(storeIdL);
        
        storeIdTF = new JTextField();
        storeIdTF.setBounds(400,140, 150, 30);
        panel.add(storeIdTF);
        
        storeNameL = new JLabel("Store Name:");
        storeNameL.setBounds(830,140, 90, 20);
        panel.add(storeNameL);
        
        storeNameTF = new JTextField();
        storeNameTF.setBounds(930, 140, 150, 30);
        panel.add(storeNameTF);
        
        locationL = new JLabel("Location:");
        locationL.setBounds(300, 190,70, 20);
        panel.add(locationL);
        
        locationTF = new JTextField();
        locationTF.setBounds(400, 190, 150, 30);
        panel.add(locationTF);
        
        openingHourL = new JLabel("Opening Hour:");
        openingHourL.setBounds(830, 190, 90, 20);
        panel.add(openingHourL);
        
        openingHourTF = new JTextField();
        openingHourTF.setBounds(930, 190, 150, 30);
        panel.add(openingHourTF);
        
        totalSalesL = new JLabel("Total Sales:");
        totalSalesL.setBounds(300, 240, 70, 20);
        panel.add(totalSalesL);
        
        totalSalesTF = new JTextField();
        totalSalesTF.setBounds(400, 240, 150, 30);
        panel.add(totalSalesTF);
        
        totalDiscountL = new JLabel("Total Discount:");
        totalDiscountL.setBounds(830, 240, 90, 20);
        panel.add(totalDiscountL);
        
        totalDiscountTF = new JTextField();
        totalDiscountTF.setBounds(930, 240, 150, 30);
        panel.add(totalDiscountTF);
        
        productNameL = new JLabel("Product Name:");
        productNameL.setBounds(300, 290, 90, 20);
        panel.add(productNameL);
        
        productNameTF = new JTextField();
        productNameTF.setBounds(400, 290, 150, 30);
        panel.add(productNameTF);
        
        markedPL = new JLabel("Marked Price:");
        markedPL.setBounds(830, 290, 90, 20);
        panel.add(markedPL);
        
        markedPTF = new JTextField();
        markedPTF.setBounds(930, 290, 150, 30);
        panel.add(markedPTF);
        
        addDepartment = new JButton ("Add a Department");
        addDepartment.setBounds(570, 340, 240, 30);
        panel.add(addDepartment);
        
        storeIdL2 = new JLabel ("Store ID:");
        storeIdL2.setBounds(300, 410, 70, 20);
        panel.add(storeIdL2);
        
        storeIdTF2 = new JTextField ();
        storeIdTF2.setBounds(380, 410, 150, 30);
        panel.add(storeIdTF2);
        
        isInSalesL = new JLabel ("Is in Sales:");
        isInSalesL.setBounds(830, 410, 90, 20);
        panel.add(isInSalesL);
        
        iisTrue = new JCheckBox ("True");
        iisTrue.setBounds (930, 410, 70, 20);
        panel.add(iisTrue);
        
        iisFalse = new JCheckBox ("False");
        iisFalse.setBounds (1000, 410, 70, 20);
        panel.add(iisFalse);
        
        ButtonGroup iisGroup = new ButtonGroup();
        iisGroup.add(iisTrue);
        iisGroup.add(iisFalse);
        
        calculateDiscount = new JButton("Calculate Discount");
        calculateDiscount.setBounds(570, 460, 240, 30);
        panel.add(calculateDiscount);
        
        D_display = new JButton ("Display");
        D_display.setBounds(300, 500, 100, 30);
        panel.add(D_display);
        
        D_clear = new JButton ("Clear");
        D_clear.setBounds(980, 500, 100, 30);
        panel.add(D_clear);
        
        divider = new JSeparator();
        divider.setBounds(0,570, 1500, 30);
        panel.add(divider);
        
        retailerLabel = new JLabel ("RETAILER");
        retailerLabel.setBounds(600, 600, 230, 30);
        retailerLabel.setFont(font);
        panel.add(retailerLabel);
        
        storeIdL3 = new JLabel ("Store ID:");
        storeIdL3.setBounds(300, 680, 70, 20);
        panel.add(storeIdL3);
        
        storeIdTF3 = new JTextField ();
        storeIdTF3.setBounds(400, 680, 150, 30);
        panel.add(storeIdTF3);
        
        storeNameL2 = new JLabel("Store Name:");
        storeNameL2.setBounds(830,680, 90, 20);
        panel.add(storeNameL2);
        
        storeNameTF2 = new JTextField();
        storeNameTF2.setBounds(930, 680, 150, 30);
        panel.add(storeNameTF2);
        
        locationL2 = new JLabel("Location:");
        locationL2.setBounds(300, 730,70, 20);
        panel.add(locationL2);
        
        locationTF2 = new JTextField();
        locationTF2.setBounds(400, 730, 150, 30);
        panel.add(locationTF2);
        
        openingHourL2 = new JLabel("Opening Hour:");
        openingHourL2.setBounds(830, 730, 90, 20);
        panel.add(openingHourL2);
        
        openingHourTF2 = new JTextField();
        openingHourTF2.setBounds(930, 730, 150, 30);
        panel.add(openingHourTF2);
        
        totalSalesL2 = new JLabel("Total Sales:");
        totalSalesL2.setBounds(300, 780, 70, 20);
        panel.add(totalSalesL2);
        
        totalSalesTF2 = new JTextField();
        totalSalesTF2.setBounds(400, 780, 150, 30);
        panel.add(totalSalesTF2);
        
        totalDiscountL2 = new JLabel("Total Discount:");
        totalDiscountL2.setBounds(830, 780, 90, 20);
        panel.add(totalDiscountL2);
        
        totalDiscountTF2 = new JTextField();
        totalDiscountTF2.setBounds(930, 780, 150, 30);
        panel.add(totalDiscountTF2);
        
        vatL = new JLabel("VAT:");
        vatL.setBounds(300, 830, 70, 20);
        panel.add(vatL);
        
        vatTF = new JTextField();
        vatTF.setBounds(400, 830, 150, 30);
        panel.add(vatTF);
        
        isPayOnlineL = new JLabel("Is Payment Online:");
        isPayOnlineL.setBounds(830, 830, 120, 20);
        panel.add(isPayOnlineL);
        
        ipoTrue1 = new JCheckBox("True");
        ipoTrue1.setBounds (960, 830, 70, 20);
        panel.add(ipoTrue1);
        
        ipoFalse1 = new JCheckBox ("False");
        ipoFalse1.setBounds (1040, 830, 70, 20);
        panel.add(ipoFalse1);
        
        ButtonGroup ipoGroup1 = new ButtonGroup();
        ipoGroup1.add(ipoTrue1);
        ipoGroup1.add(ipoFalse1);
        
        purchasedYearL = new JLabel("Purchased year:");
        purchasedYearL.setBounds(510, 880, 120, 20);
        panel.add(purchasedYearL);
        
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        monthCB = new JComboBox<> (months);
        monthCB.setBounds (610, 880, 90, 25);
        panel.add(monthCB);
        
        String[] days = new String[32];
        for (int i = 0; i <= 31; i++){
            days [i] = String.valueOf (i + 1);
        }
        dayCB = new JComboBox<> (days);
        dayCB.setBounds(710, 880, 40, 25);
        panel.add(dayCB);
        
        String[] years = new String[6];
        for (int i = 0; i <= 5; i++){
            years[i] = String.valueOf(2020 + i);
        }
        yearCB = new JComboBox<> (years);
        yearCB.setBounds (760, 880, 70, 25);
        panel.add(yearCB);
        
        addRetailer = new JButton("Add Retailer");
        addRetailer.setBounds(570, 930, 240, 30);
        panel.add(addRetailer);
        
        R_display = new JButton ("Display");
        R_display.setBounds(300, 980, 100, 30);
        panel.add(R_display);
        
        R_clear = new JButton ("Clear");
        R_clear.setBounds(980, 980, 100, 30);
        panel.add(R_clear);
        
        storeIdL4 = new JLabel("Store ID:");
        storeIdL4.setBounds(300, 1050, 70, 20);
        panel.add(storeIdL4);
        
        storeIdTF4 = new JTextField();
        storeIdTF4.setBounds(400, 1050, 150, 30);
        panel.add(storeIdTF4);
        
        isPayOnlineL = new JLabel("Is Payment Online:");
        isPayOnlineL.setBounds(830, 1050, 120, 20);
        panel.add(isPayOnlineL);
        
        ipoTrue2 = new JCheckBox("True");
        ipoTrue2.setBounds (960, 1050, 70, 20);
        panel.add(ipoTrue2);
        
        ipoFalse2 = new JCheckBox ("False");
        ipoFalse2.setBounds (1040, 1050, 70, 20);
        panel.add(ipoFalse2);
        
        ButtonGroup ipoGroup2 = new ButtonGroup();
        ipoGroup2.add(ipoTrue2);
        ipoGroup2.add(ipoFalse2);
        
        setLoyaltyPoint = new JButton("Set Loyalty Point");
        setLoyaltyPoint.setBounds(400, 1100, 250, 30);
        panel.add(setLoyaltyPoint);
        
        removeProduct = new JButton("Remove Product");
        removeProduct.setBounds(770, 1100, 250, 30);
        panel.add(removeProduct);
        
        JScrollPane scroll = new JScrollPane(panel);
        scroll.setBounds(0, 0, 1500, 1500); 
        frame.add(scroll);
        
        ArrayList <Store> storeArr = new ArrayList<> (); 
        addDepartment.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                try{
                    if(storeIdTF.getText().equals("") || storeNameTF.getText().equals("") || locationTF.getText().equals("") || openingHourTF.getText().equals("") ||
                    totalSalesTF.getText().equals("") || totalDiscountTF.getText().equals("") || productNameTF.getText().equals("") || markedPTF.getText().equals("")){
                      JOptionPane.showMessageDialog(frame, "Empty fields found. Please fill in all the fields.");  
                    }
                    
                    int storeID = Integer.parseInt(storeIdTF.getText());
                    String storeName = storeNameTF.getText();
                    String location = locationTF.getText();
                    String openingHour = openingHourTF.getText();
                    int totalSales = Integer.parseInt(totalSalesTF.getText());
                    int totalDiscount = Integer.parseInt(totalDiscountTF.getText());
                    String productName = productNameTF.getText();
                    double markedPrice = Double.parseDouble(markedPTF.getText());
                    
                    boolean storeExists = false;
                    for (Store s : storeArr) {
                        if (s.getStoreID() == storeID) {
                            storeExists = true;
                            break;
                        }
                    }
                    
                    if (storeExists) {
                        JOptionPane.showMessageDialog(frame, "Store ID already exists. Please enter another Store ID.");
                        return;
                    }
                    else{
                        Department depObj = new Department(storeID, storeName, location, openingHour, totalSales, totalDiscount, productName, markedPrice);
                        storeArr.add(depObj);
                        JOptionPane.showMessageDialog(frame, "Department has been added successfully!");
                    }
                }
                catch(Exception e1){
                   JOptionPane.showMessageDialog(frame, "Something went wrong. Please enter valid values."); 
                }
            }
        });
        
        calculateDiscount.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                try{
                    if (storeIdTF2.getText().equals("") || iisGroup.getSelection() == null){
                        JOptionPane.showMessageDialog (frame, "Empty fields found. Please fill in all the fields.");
                    }
                    int storeId = Integer.parseInt(storeIdTF2.getText());
                    boolean isInSales = iisTrue.isSelected();
                    
                    for (Store s1: storeArr){
                        if (s1 instanceof Department){
                            Department depObj = (Department) s1;
                            double markedPrice = Double.parseDouble(markedPTF.getText());
                            double discountP = depObj.calculateDiscountPrice(isInSales, markedPrice);
                            JOptionPane.showMessageDialog(frame, "Total Discount Price is: " + discountP);
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(frame, "Store ID not found or not a Department.");
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(frame, "Something went wrong. Please enter valid values.");
                }
            }
        });
        
        D_display.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                try{
                    for (Store s2: storeArr){
                        if (s2 instanceof Department){
                            Department depObj2 = (Department) s2;
                            depObj2.display();
                        }
                    }

                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(frame, "Something went wrong. Please enter valid values.");
                }
            }
        });
        
        D_clear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                try{
                    storeIdTF.setText("");
                    storeNameTF.setText("");
                    locationTF.setText("");
                    openingHourTF.setText("");
                    totalSalesTF.setText("");
                    totalDiscountTF.setText("");
                    productNameTF.setText("");
                    markedPTF.setText("");
                    storeIdTF2.setText(""); 
                    iisGroup.clearSelection();
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(frame, "Something went wrong.");
                }
            }
        });
        
        addRetailer.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                try{
                    if(storeIdTF3.getText().equals("") || storeNameTF2.getText().equals("") || locationTF2.getText().equals("") || openingHourTF2.getText().equals("") || totalSalesTF2.getText().equals("") ||
                    totalDiscountTF2.getText().equals("") || vatTF.getText().equals("") || ipoGroup1.getSelection() == null || yearCB.getSelectedItem() == null){
                        JOptionPane.showMessageDialog(frame, "Empty fields found. Please fill in all the fields.");
                    }
                    int storeID3 = Integer.parseInt(storeIdTF3.getText());
                    String storeName2 = storeNameTF2.getText();
                    String location2 = locationTF2.getText();
                    String openingHour2 = openingHourTF2.getText();
                    int totalSales2 = Integer.parseInt(totalSalesTF2.getText());
                    int totalDiscount2 = Integer.parseInt(totalDiscountTF2.getText());
                    int vat = Integer.parseInt(vatTF.getText());
                    boolean isPayOnline = ipoTrue1.isSelected();
                    String purchasedYear = (String) yearCB.getSelectedItem();
                    
                    boolean storeExists = false;
                    for (Store s3 : storeArr) {
                        if (s3.getStoreID() == storeID3) {
                            storeExists = true;
                            break;
                        }
                    }
                    if (storeExists) {
                        JOptionPane.showMessageDialog(frame, "Store ID already exists. Please enter another Store ID.");
                        return;
                    }
                    else{
                        Retailer retObj = new Retailer(storeID3, storeName2, location2, openingHour2, totalSales2, totalDiscount2, vat, isPayOnline, purchasedYear);
                        storeArr.add(retObj);
                        JOptionPane.showMessageDialog(frame, "Retailer has been added successfully!");
                    }
                    
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(frame, "Something went wrong. Please enter valid values.");
                }
            }
        });
        
        R_display.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                try{
                    for (Store s4: storeArr){
                        if (s4 instanceof Retailer){
                            Retailer retObj2 = (Retailer) s4;
                            retObj2.display();
                        }
                    } 
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(frame, "Something went wrong. Please enter valid values.");
                }
            }
        });
        
        R_clear.addActionListener (new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e){
                try{
                    storeIdTF3.setText("");
                    storeNameTF2.setText("");
                    locationTF2.setText("");
                    openingHourTF2.setText("");
                    totalSalesTF2.setText("");
                    totalDiscountTF2.setText("");
                    vatTF.setText("");
                    ipoGroup1.clearSelection();
                    yearCB.setSelectedIndex(0);
                    monthCB.setSelectedIndex(0);
                    dayCB.setSelectedIndex(0);
                    storeIdTF4.setText("");
                    ipoGroup2.clearSelection();
                    
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(frame, "Something went wrong. Please enter valid values.");
                }
            }
        });
        
        setLoyaltyPoint.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    if(storeIdTF4.getText().equals("") || ipoGroup2.getSelection() == null){
                        JOptionPane.showMessageDialog (frame, "Something went wrong. Please enter valid values.");
                    }
                    int storeId4 = Integer.parseInt(storeIdTF4.getText());
                    boolean isPayOnline2 = ipoTrue2.isSelected();
                    
                    for (Store s5: storeArr){
                        if (s5 instanceof Retailer){
                            Retailer retObj2 = (Retailer) s5;
                            int vatP = Integer.parseInt(vatTF.getText());
                            double loyaltyP = retObj2.setLoyaltyPoint(isPayOnline2, vatP);
                            JOptionPane.showMessageDialog(frame, "Loyalty Point is: " + loyaltyP);
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(frame, "Store ID not found or not a Retailer.");}
                catch(Exception e1){
                    JOptionPane.showMessageDialog(frame, "Something went wrong. Please enter valid values.");
                }
            }
        });
        
        removeProduct.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    if(storeIdTF4.getText().equals("") || ipoGroup2.getSelection() == null){
                        JOptionPane.showMessageDialog (frame, "Something went wrong. Please enter valid values.");
                    }
                    int storeId4 = Integer.parseInt(storeIdTF4.getText());
                    
                    for (Store s6: storeArr){
                        if (s6 instanceof Retailer){
                            Retailer retObj3 = (Retailer) s6;
                            retObj3.removeProduct();
                            JOptionPane.showMessageDialog(frame, "Product removed successfully.");
                            return;
                        }
                    }
                    JOptionPane.showMessageDialog(frame, "Store ID not found or not a Retailer.");
                }
                catch(Exception e1){
                    JOptionPane.showMessageDialog(frame, "Something went wrong. Please enter valid values.");
                }
            }
        });
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible (true);
    }
    
    public static void main (String[] args){
        new StoreGUI();
    }
}