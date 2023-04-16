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

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Issued_Car extends Car {
    
    private String damage_info;
    private double cost_repair;
    private JLabel headerLabel;
    private JLabel carModelLabel;
    private JLabel carModel1Label;
    private JLabel carTypeLabel;
    private JLabel carType1Label;
    private JLabel carSeatLabel;
    private JLabel carSeat1Label;
    private JLabel carRateLabel;
    private JLabel carRate1Label;
    private JLabel carDamageLabel;
    private JLabel carDamage1Label;
    private JLabel carRepairCostLabel;
    private JLabel carRepairCost1Label;

    public Issued_Car(String car_model, String car_type, int seater, Rate rate, String damage_info, double cost_repair) {
        super(car_model, car_type, seater, rate);
        this.damage_info = damage_info;
        this.cost_repair = cost_repair;
    }

    //define setter and getter for damage info
    public String getDamage_info(){
        return damage_info;
    }
    
    public void setDamage_info(String damage_info){
        this.damage_info=damage_info;
    }
   
    public double getCost_repair(){
        return cost_repair ;
    }
    public void setCost_repair(double cost_repair){
        this.cost_repair=cost_repair;
    }
    
    @Override
    public void displayCar() throws IOException {
        //create image for icon
        URL url = new URL ("https://p.kindpng.com/picc/s/7-78945_car-cartoon-icon-png-transparent-png.png");
        BufferedImage img = ImageIO.read(url);
        ImageIcon vicenzo = new ImageIcon(img);
        
        //create oanel for employee do
        JPanel panelIssuedeCar = new JPanel();
        //create frame for employee do 
        JFrame frameIssuedCar = new JFrame("Issued Car");
        frameIssuedCar.setSize(350, 320);
        frameIssuedCar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameIssuedCar.setLocationRelativeTo(null);
        frameIssuedCar.setIconImage(vicenzo.getImage());
        frameIssuedCar.add(panelIssuedeCar);
                                
        panelIssuedeCar.setLayout(null);
        
        headerLabel = new JLabel ("Issued Car Details");
        headerLabel.setBounds(50, 20, 200, 25);
        headerLabel.setFont(headerLabel.getFont().deriveFont(16.0f));
        headerLabel.setForeground(Color.DARK_GRAY);
        panelIssuedeCar.add(headerLabel);
        
        carModelLabel = new JLabel("Car Model");
        carModelLabel.setBounds(50,60,100,25);
        panelIssuedeCar.add(carModelLabel);
        
        carModel1Label = new JLabel(": "+getCar_model());
        carModel1Label.setBounds(160,60,180,25);
        panelIssuedeCar.add(carModel1Label);
        
        carTypeLabel = new JLabel("Car Type");
        carTypeLabel.setBounds(50,90,100,25);
        panelIssuedeCar.add(carTypeLabel);
        
        carType1Label = new JLabel(": "+getCar_type());
        carType1Label.setBounds(160,90,80,25);
        panelIssuedeCar.add(carType1Label);
        
        carSeatLabel = new JLabel("Seat Number");
        carSeatLabel.setBounds(50,120,100,25);
        panelIssuedeCar.add(carSeatLabel);
        
        carSeat1Label = new JLabel(": "+getSeater());
        carSeat1Label.setBounds(160,120,180,25);
        panelIssuedeCar.add(carSeat1Label);
        
        carRateLabel = new JLabel("Car Rating");
        carRateLabel.setBounds(50,150,100,25);
        panelIssuedeCar.add(carRateLabel);
        
        carRate1Label = new JLabel(": "+getRate());
        carRate1Label.setBounds(160,150,180,25);
        panelIssuedeCar.add(carRate1Label);
        
        carDamageLabel = new JLabel("Damage Info");
        carDamageLabel.setBounds(50,180,100,25);
        panelIssuedeCar.add(carDamageLabel);
        
        carDamage1Label = new JLabel(": "+getDamage_info());
        carDamage1Label.setBounds(160,180,180,25);
        panelIssuedeCar.add(carDamage1Label);
        
        carRepairCostLabel = new JLabel("Repair Cost");
        carRepairCostLabel.setBounds(50,210,100,25);
        panelIssuedeCar.add(carRepairCostLabel);
        
        carRepairCost1Label = new JLabel(": RM "+getCost_repair());
        carRepairCost1Label.setBounds(160,210,180,25);
        panelIssuedeCar.add(carRepairCost1Label);
        
        frameIssuedCar.setVisible(true);
        
    }
    
}
