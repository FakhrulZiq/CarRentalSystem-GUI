/**
 *  ----------------------------------------------------------------
 *  @author :Group 11
 *  Program Name :Car Rental System
 *  Description  :To calculate the price.
 *  Creation Date:5/5/2021
 *  Modified date:None
 *  Version      :Version 1.00
 * ----------------------------------------------------------------
 * 
 */
package CarRentalSystem;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Available_Car extends Car{
    //define variable invoice
    private JLabel carModel;
    private JLabel CarType;
    private JLabel SeatNum;
    private JLabel CarRate;
    private JLabel CarPrice;
    private JLabel DayRent;
    private JLabel TotalPrice;
    //define instance variable 
    private double price;
    private int day;
    private JLabel headerLabel;
    private JLabel carModelLabel;
    private JLabel carModel1Label;
    private JLabel carTypeLabel;
    private JLabel carType1Label;
    private JLabel carSeatLabel;
    private JLabel carSeat1Label;
    private JLabel carRateLabel;
    private JLabel carRate1Label;
    private JLabel carPriceLabel;
    private JLabel carPrice1Label;

    public Available_Car(String car_model, String car_type, int seater, Rate rate) {
        super(car_model, car_type, seater, rate);
    }

    public Available_Car(String car_model, String car_type, int seater, Rate rate, double price) {
        super(car_model, car_type, seater, rate);
        this.price = price;
    }
    public Available_Car(String car_model, String car_type, int seater, Rate rate, double price, int day) {
        super(car_model, car_type, seater, rate);
        this.price = price;
        this.day = day;
    }
    
    //define setter and getter for price
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price=price;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    public void calculateRentPrice() {
        System.out.printf("\n======================================================\n\t\t\t      "
                + "Total price =  RM %,.2f\n======================================================\n", getPrice() * getDay());
    }
    
    public void displayInvois() {
        System.out.printf("Day Rent\t\t= %d", getDay());    
    }
    
    @Override
    public void displayCar() throws IOException {
        //create image for icon
        URL url = new URL ("https://p.kindpng.com/picc/s/7-78945_car-cartoon-icon-png-transparent-png.png");
        BufferedImage img = ImageIO.read(url);
        ImageIcon vicenzo = new ImageIcon(img);
        
        //create oanel for employee do
        JPanel panelAvailableCar = new JPanel();
        //create frame for employee do 
        JFrame frameAvailableCar = new JFrame("Available Car");
        frameAvailableCar.setSize(350, 270);
        frameAvailableCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameAvailableCar.setLocationRelativeTo(null);
        frameAvailableCar.setIconImage(vicenzo.getImage());
        frameAvailableCar.add(panelAvailableCar);
                                
        panelAvailableCar.setLayout(null);
        
        headerLabel = new JLabel ("Available Car Details");
        headerLabel.setBounds(50, 20, 200, 25);
        headerLabel.setFont(headerLabel.getFont().deriveFont(16.0f));
        headerLabel.setForeground(Color.DARK_GRAY);
        panelAvailableCar.add(headerLabel);
        
        carModelLabel = new JLabel("Car Model");
        carModelLabel.setBounds(50,60,100,25);
        panelAvailableCar.add(carModelLabel);
        
        carModel1Label = new JLabel(": "+getCar_model());
        carModel1Label.setBounds(160,60,180,25);
        panelAvailableCar.add(carModel1Label);
        
        carTypeLabel = new JLabel("Car Type");
        carTypeLabel.setBounds(50,90,100,25);
        panelAvailableCar.add(carTypeLabel);
        
        carType1Label = new JLabel(": "+getCar_type());
        carType1Label.setBounds(160,90,80,25);
        panelAvailableCar.add(carType1Label);
        
        carSeatLabel = new JLabel("Seat Number");
        carSeatLabel.setBounds(50,120,100,25);
        panelAvailableCar.add(carSeatLabel);
        
        carSeat1Label = new JLabel(": "+getSeater());
        carSeat1Label.setBounds(160,120,180,25);
        panelAvailableCar.add(carSeat1Label);
        
        carRateLabel = new JLabel("Car Rating");
        carRateLabel.setBounds(50,150,100,25);
        panelAvailableCar.add(carRateLabel);
        
        carRate1Label = new JLabel(": "+getRate());
        carRate1Label.setBounds(160,150,180,25);
        panelAvailableCar.add(carRate1Label);
        
        carPriceLabel = new JLabel("Price perDay");
        carPriceLabel.setBounds(50,180,100,25);
        panelAvailableCar.add(carPriceLabel);
        
        carPrice1Label = new JLabel(": RM "+getPrice());
        carPrice1Label.setBounds(160,180,180,25);
        panelAvailableCar.add(carPrice1Label);
        
        frameAvailableCar.setVisible(true);
        
    }

}
