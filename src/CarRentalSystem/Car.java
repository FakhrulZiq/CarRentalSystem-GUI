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

import java.io.IOException;
import javax.swing.*;

public abstract class Car extends JFrame{
    
    //define instace variable
    private String car_model;
    private String car_type;
    private int seater;
    private Rate rate;
    
    //define default constructor
    public Car(){
        
    }
    
    //define 2nd contructor
    public Car(String car_model, String car_type, int seater, Rate rate){
        //initialize contructor
        setCar_model(car_model);
        setCar_type(car_type);
        setSeater(seater);
        setRate(rate);
    }
    
    //define setter & getter
    public String getCar_model(){
        return (this.car_model);
    }
    
    public void setCar_model(String car_model){
        this.car_model = car_model;
    }
    
    public String getCar_type(){
        return (this.car_type);
    }
    
    public void setCar_type(String car_type){
        this.car_type = car_type;
    }
    
    public int getSeater(){
        return (this.seater);
    }
    
    public void setSeater(int seater){
        this.seater = seater;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }
    
    //display output  in capital letter
    public void displayCar() throws IOException {
        
    }
}
