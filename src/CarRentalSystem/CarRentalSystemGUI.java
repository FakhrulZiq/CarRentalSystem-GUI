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

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.*;
public class CarRentalSystemGUI implements ActionListener{
    
    //innitialize booking car
    private static JButton buttonBookingCar, buttonPersona, buttonSaga, buttonEzora, buttonMyvi, buttonCivic;
    private static JLabel bookingLabel;
   //initialize variable for framePersonType
    private static JLabel picBannerLabel, identifyLabel; 
    private static JButton buttonEmployee, buttonCustomer;
    //initialize variable for frameLogin
    private static JLabel userlabel, passwordLabel, success,  picLabel, picWelcomeLabel; 
    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JButton button;
    //initialize variable for frameEmployeeDo
    private static JLabel greeting, NameLabel, PhonenoLabel, licencesLabel, errorText, errorLabel;
    private static JTextField NameText, PhonenoText, licencesText; 
    private static JButton buttonViewdetail, buttonView_aCarEmployee, buttonView_iCarEmployee, buttonAdd_aCarEmployee, buttonAdd_iCarEmployee;

            
    public static void main(String[] args) throws IOException{

        //create 50 element Car and Rate array
        Car cars[] = new Car [50];
        Rate rates[] = new Rate [50];
        
        //initialize array with Car and Rate
        rates[0] = new Rate (4.5);
        cars[0] = new Available_Car ("Persona", "Economy", 5, rates[0], 150.0);
        rates[1] = new Rate (4.3);
        cars[1] = new Available_Car ("Saga FLX", "Economy", 5, rates[1], 120.0);              
        rates[2] = new Rate (4.2);
        cars[2] = new Available_Car ("Ezora", "Family", 7, rates[2], 230.0);             
        rates[3] = new Rate (3.9);
        cars[3] = new Available_Car ("Myvi", "Compact", 5, rates[3], 110.0);               
        rates[4] = new Rate (4.7);
        cars[4] = new Available_Car ("Civic", "Economy", 5, rates[4], 190.0);
        
        rates[5] = new Rate (4.0);
        cars[5] = new Issued_Car ("Waja", "Economy", 5, rates[0], "Brake_Mulfunctioning", 250.00);
        rates[6] = new Rate (4.3);
        cars[6] = new Issued_Car ("Preve", "Economy", 5, rates[1], "Burn_Front_Lamp",120.0);              
        rates[7] = new Rate (4.2);
        cars[7] = new Issued_Car ("Bezza", "Economy", 5, rates[2], "Flat_Tyre", 230.0);             
        rates[8] = new Rate (4.9);
        cars[8] = new Issued_Car ("Alphard", "Family", 7, rates[3], "The_seat_is_torn", 110.0);               
        rates[9] = new Rate (4.8);
        cars[9] = new Issued_Car ("Serena", "Family", 7, rates[4], "Rear_brake_light_is_broken", 190.0); 
        
        //create image for icon
        URL url = new URL ("https://p.kindpng.com/picc/s/7-78945_car-cartoon-icon-png-transparent-png.png");
        BufferedImage img = ImageIO.read(url);
        ImageIcon vicenzo = new ImageIcon(img);
        //create icon for login
        URL urlLogin = new URL ("https://icon-library.com/images/icon-login/icon-login-4.jpg");
        BufferedImage imgLogin = ImageIO.read(urlLogin);
        Image pureLogin = imgLogin.getScaledInstance( 80, 80,  java.awt.Image.SCALE_SMOOTH ) ;  
        ImageIcon login = new ImageIcon(pureLogin);
        //create icon for employee and customer
        URL urlWelcome = new URL ("https://i.ibb.co/C9Fx36Y/WELCOME1.png");
        BufferedImage imgWelcome = ImageIO.read(urlWelcome);
        Image pureWelcome = imgWelcome.getScaledInstance( 500, 251,  java.awt.Image.SCALE_SMOOTH ) ;  
        ImageIcon welcome = new ImageIcon(pureWelcome);
        //create image for banner
        URL urlBanner = new URL ("https://i.ibb.co/tQBX9KP/HEADER.png");
        BufferedImage imgBanner = ImageIO.read(urlBanner);
        Image pureBanner = imgBanner.getScaledInstance( 1000, 333,  java.awt.Image.SCALE_SMOOTH ) ;  
        ImageIcon banner = new ImageIcon(pureBanner);
        //create image for perosna
        URL urlPersona = new URL ("https://cdn.wheel-size.com/automobile/body/proton-persona-2019-2021-1590136646.5205023.jpg");
        BufferedImage imgPersona = ImageIO.read(urlPersona);
        Image purePersona = imgPersona.getScaledInstance( 300, 200,  java.awt.Image.SCALE_SMOOTH ) ;  
        ImageIcon persona = new ImageIcon(purePersona);
        //create image for saga se
        URL urlSaga = new URL ("https://cdn.wheel-size.com/automobile/body/proton-saga-2010-2011-1590239026.6346345.jpg");
        BufferedImage imgSaga = ImageIO.read(urlSaga);
        Image pureSaga = imgSaga.getScaledInstance( 300, 200,  java.awt.Image.SCALE_SMOOTH ) ;  
        ImageIcon saga = new ImageIcon(pureSaga);
        //create image for ezora
        URL urlEzora = new URL ("https://cdn.wheel-size.com/automobile/body/proton-exora-2012-2021-1601882979.7923307.jpg");
        BufferedImage imgEzora = ImageIO.read(urlEzora);
        Image pureEzora = imgEzora.getScaledInstance( 300, 200,  java.awt.Image.SCALE_SMOOTH ) ;  
        ImageIcon ezora = new ImageIcon(pureEzora);
        //create image for mmyvi
        URL urlMyvi = new URL ("https://cdn.wheel-size.com/automobile/body/perodua-myvi-2017-2021-1591190558.397384.jpg");
        BufferedImage imgMyvi = ImageIO.read(urlMyvi);
        Image pureMyvi = imgMyvi.getScaledInstance( 300, 200,  java.awt.Image.SCALE_SMOOTH ) ;  
        ImageIcon myvi = new ImageIcon(pureMyvi);
        //create image for civic
        URL urlCivic = new URL ("https://assets.droom.my/uploads/category/Honda/20181016123020000000-2158444525566665217.jpg");
        BufferedImage imgCivic = ImageIO.read(urlCivic);
        Image pureCivic = imgCivic.getScaledInstance( 300, 200,  java.awt.Image.SCALE_SMOOTH ) ;  
        ImageIcon civic = new ImageIcon(pureCivic);
        
        //create panel inside frame
        JPanel panelPersonType = new JPanel();
        //create frame
        JFrame framePersonType = new JFrame ("Vicenzo Car Rental System");
        framePersonType.setSize(1000, 450);
        framePersonType.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        framePersonType.setLocationRelativeTo(null); // display fram at center of screen
        framePersonType.setIconImage(vicenzo.getImage());
        framePersonType.add(panelPersonType);
        
        panelPersonType.setLayout(null);
        
        picBannerLabel = new JLabel();
        picBannerLabel.setIcon(banner);
        picBannerLabel.setBounds(0,0,1000,333);
        panelPersonType.add(picBannerLabel);
        
        identifyLabel = new JLabel ("Login as?");
        identifyLabel.setBounds(500, 340, 100, 25);
        panelPersonType.add(identifyLabel);
        
//=========================================================             Employee          =============================================================================================//
        //button to login as employee
        buttonEmployee = new JButton("Employee");
        buttonEmployee.setBounds(400, 370, 100, 25);
        buttonEmployee.addMouseListener(new MouseAdapter() {
            Color color = buttonEmployee.getForeground();
            @Override
            public void mouseEntered(MouseEvent me) {
                color = buttonEmployee.getForeground();
                buttonEmployee.setBackground(Color.green); // change the color to green when mouse over a button
            }
            @Override
            public void mouseExited(MouseEvent me) {
            buttonEmployee.setBackground(color);
            }
        });
        buttonEmployee.addActionListener(new CarRentalSystemGUI(){
            @Override
            public void actionPerformed(ActionEvent who) {
                if (who.getSource() == buttonEmployee) {
                    framePersonType.dispose();
                    
                    //create panel login
                    JPanel panelLogin = new JPanel();
                    //create frame
                    JFrame frameLogin = new JFrame("Employee Login");
                    frameLogin.setSize(450, 300);
                    frameLogin.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    frameLogin.setLocationRelativeTo(null); // display fram at center of screen
                    frameLogin.setIconImage(vicenzo.getImage());
                    frameLogin.add(panelLogin);
        
                    panelLogin.setLayout(null);
        
                    picLabel = new JLabel();
                    picLabel.setIcon(login);
                    picLabel.setBounds(190,5,100,100);
                    panelLogin.add(picLabel);
                    
                    //add label "username" to panel
                    userlabel = new JLabel("Username");
                    userlabel.setBounds(50,110,80,25);
                    panelLogin.add(userlabel);
        
                    //create text field fpr username with lenght 20
                    userText = new JTextField(20);
                    userText.setBounds(140, 110, 250, 25);
                    panelLogin.add(userText);
                    
                    //add label "Password" to panel
                    passwordLabel = new JLabel("Password");
                    passwordLabel.setBounds(50,140,80,25);
                    panelLogin.add(passwordLabel);
        
                    //create password field for password that will censor the content
                    passwordText = new JPasswordField();
                    passwordText.setBounds(140, 140, 250, 25);
                    panelLogin.add(passwordText);
        
                    //create button if user click this it will verify username and password if right will appear another frame for employee do
                    button = new JButton("Login");
                    button.setBounds(288, 200, 100, 25);
                    button.addMouseListener(new MouseAdapter() {
                        Color color = button.getForeground();
                        @Override
                        public void mouseEntered(MouseEvent me) {
                            color = button.getForeground();
                            button.setBackground(Color.green); // change the color to green when mouse over a button
                        }
                        @Override
                        public void mouseExited(MouseEvent me) {
                            button.setBackground(color);
                        }
                    });
                    button.addActionListener(new CarRentalSystemGUI(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String user = userText.getText();
                            String password = passwordText.getText();
        
                            if (user.equals("fakhrul") && password.equals("fakhrul123")) {      //username and pssword validation
                                success.setText("Login Successful !! Hi, " + userText.getText());
                                
                                frameLogin.dispose();
                                
                                //create oanel for employee do
                                JPanel panelEmployeeDo = new JPanel();
                                //create frame for employee do 
                                JFrame frameEmployeeDo = new JFrame("Employee");
                                frameEmployeeDo.setSize(500, 660);
                                frameEmployeeDo.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                frameEmployeeDo.setLocationRelativeTo(null);
                                frameEmployeeDo.setIconImage(vicenzo.getImage());
                                frameEmployeeDo.add(panelEmployeeDo);
                                
                                panelEmployeeDo.setLayout(null);
                                
                                picWelcomeLabel = new JLabel();
                                picWelcomeLabel.setIcon(welcome);
                                picWelcomeLabel.setBounds(0,0,500,251);
                                panelEmployeeDo.add(picWelcomeLabel);
                                
                                //add greeting to panel
                                greeting = new JLabel ("Hi, "+userText.getText());
                                greeting.setBounds(70, 270, 200, 25);
                                panelEmployeeDo.add(greeting);
                                
                                //add label "username" to panel
                                NameLabel = new JLabel("Name");
                                NameLabel.setBounds(70,310,80,25);
                                panelEmployeeDo.add(NameLabel);
        
                                //create text field fpr username with lenght 20
                                NameText = new JTextField(20);
                                NameText.setBounds(160, 310, 250, 25);
                                panelEmployeeDo.add(NameText);
                                
                                PhonenoLabel = new JLabel("Phone No.");
                                PhonenoLabel.setBounds(70,340,80,25);
                                panelEmployeeDo.add(PhonenoLabel);
        
                                PhonenoText = new JTextField(10);
                                PhonenoText.setBounds(160, 340, 250, 25);
                                panelEmployeeDo.add(PhonenoText);
                                
                                errorLabel = new JLabel("");
                                errorLabel.setBounds(70,370,300,25);
                                panelEmployeeDo.add(errorLabel);
                                
                                    //////////////////////              Employee View Details        ////////////////////////////
                                    
                                buttonViewdetail = new JButton("View Details");
                                buttonViewdetail.setBounds(70, 400, 339, 25);
                                buttonViewdetail.addMouseListener(new MouseAdapter() {
                                    Color color = buttonViewdetail.getForeground();
                                    @Override
                                    public void mouseEntered(MouseEvent me) {
                                        color = buttonViewdetail.getForeground();
                                        buttonViewdetail.setBackground(Color.green); // change the color to green when mouse over a button
                                    }
                                    @Override
                                    public void mouseExited(MouseEvent me) {
                                        buttonViewdetail.setBackground(color);
                                    } 
                                });
                                
                                buttonViewdetail.addActionListener(new CarRentalSystemGUI(){
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        String name = NameText.getText();
                                        String phoneNo = PhonenoText.getText();
                                        
                                        if (!name.isEmpty() && (phoneNo.matches("\\d{3}[-\\.\\s]\\d{4}[-\\.\\s]\\d{4}") || phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))) {
                                            frameEmployeeDo.dispose();
                                            //create object employee
                                            try {
                                                displayEmployee(user, password, name, phoneNo);
                                            } catch (IOException ex) {
                                                Logger.getLogger(CarRentalSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        }
                                        else {
                                            UIManager um = new UIManager();
                                            um.put("OptionPane.messageForeground", Color.red);
                                            JOptionPane.showMessageDialog(null, "Fill in all blank\nor\nEnter a valid phone number exp: 012-3456 7890", "ERROR !!", JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                });
                                panelEmployeeDo.add(buttonViewdetail);
                                
   //--------------------------------------------------------               Available Car             ------------------------------------------------------------------------------------//
                                    //////////////////////               View Available Car         ////////////////////////////
                                    
                                buttonView_aCarEmployee = new JButton("View Available Car");
                                buttonView_aCarEmployee.setBounds(70, 440, 339, 25);
                                buttonView_aCarEmployee.addMouseListener(new MouseAdapter() {
                                    Color color = buttonView_aCarEmployee.getForeground();
                                    @Override
                                    public void mouseEntered(MouseEvent me) {
                                        color = buttonView_aCarEmployee.getForeground();
                                        buttonView_aCarEmployee.setBackground(Color.green); // change the color to green when mouse over a button
                                    }
                                    @Override
                                    public void mouseExited(MouseEvent me) {
                                        buttonView_aCarEmployee.setBackground(color);
                                    }
                                });
                                buttonView_aCarEmployee.addActionListener(new CarRentalSystemGUI(){
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        String name = NameText.getText();
                                        String phoneNo = PhonenoText.getText();
                                        
                                        if (!name.isEmpty() && (phoneNo.matches("\\d{3}[-\\.\\s]\\d{4}[-\\.\\s]\\d{4}") || phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))) {
                                            frameEmployeeDo.dispose();
                                            for (int i = 0; i < 5; i++){
                                                try {
                                                    cars[i].displayCar();
                                                } catch (IOException ex) {
                                                    Logger.getLogger(CarRentalSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } 
                                        }
                                        else {
                                            UIManager um = new UIManager();
                                            um.put("OptionPane.messageForeground", Color.red);
                                            JOptionPane.showMessageDialog(null, "Fill in all blank\nor\nEnter a valid phone number exp: 012-3456 7890", "ERROR !!", JOptionPane.ERROR_MESSAGE);
                                        }
                                        
                                    }
                                });
                                panelEmployeeDo.add(buttonView_aCarEmployee);  
                                
                                    //////////////////////               Add Available Car         ////////////////////////////
                                    
                                buttonAdd_aCarEmployee = new JButton("Add Available Car");
                                buttonAdd_aCarEmployee.setBounds(70, 480, 339, 25);
                                buttonAdd_aCarEmployee.addMouseListener(new MouseAdapter() {
                                    Color color = buttonAdd_aCarEmployee.getForeground();
                                    @Override
                                    public void mouseEntered(MouseEvent me) {
                                        color = buttonAdd_aCarEmployee.getForeground();
                                        buttonAdd_aCarEmployee.setBackground(Color.green); // change the color to green when mouse over a button
                                    }
                                    @Override
                                    public void mouseExited(MouseEvent me) {
                                        buttonAdd_aCarEmployee.setBackground(color);
                                    }
                                });
                                buttonAdd_aCarEmployee.addActionListener(new CarRentalSystemGUI(){
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        String name = NameText.getText();
                                        String phoneNo = PhonenoText.getText();
                                        
                                        if (!name.isEmpty() && (phoneNo.matches("\\d{3}[-\\.\\s]\\d{4}[-\\.\\s]\\d{4}") || phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))) {
                                            //exception handling for add available car
                                            String strElement = "", strSeater = "";
                                            int element = 0;
                                            boolean valid_element = true;
                                            do {
                                                try {
                                                    strElement = JOptionPane.showInputDialog(null, "How many car you want to add?", "Add AvailableCar", JOptionPane.QUESTION_MESSAGE);
                                                    element = Integer.parseInt(strElement);
                                                    valid_element = false;
                                                } catch (NumberFormatException ImmE) {
                                                    //element = Integer.parseInt(strElement);
                                                    JOptionPane.showMessageDialog(null, "ERROR !! Invalid input !! Try again...", "Add Available Car", JOptionPane.ERROR_MESSAGE);
                                                }
                                            }while (valid_element);

                                            //exception handling for add available car detail
                                            String car_model, car_type = "";
                                            int seater = 0, j = 5;
                                            double rate =0, price = 0;
                                            boolean valid_addCar = true;
                                            do {
                                                try {
                                                    do{
                                                        car_model = JOptionPane.showInputDialog(null, "Car " + (j-4) +" Model", "Add AvailableCar", JOptionPane.QUESTION_MESSAGE);
                                                        car_type = JOptionPane.showInputDialog(null, "Car " + (j-4) +" Type", "Add AvailableCar", JOptionPane.QUESTION_MESSAGE);
                                                        strSeater = JOptionPane.showInputDialog(null, "Car " + (j-4) +" Seater", "Add AvailableCar", JOptionPane.QUESTION_MESSAGE);
                                                        seater = Integer.parseInt(strSeater);
                                                        String strRate = JOptionPane.showInputDialog(null, "Car " + (j-4) +" Rate", "Add AvailableCar", JOptionPane.QUESTION_MESSAGE);
                                                        rate = Double.parseDouble(strRate);
                                                        String strPrice = JOptionPane.showInputDialog(null, "Car " + (j-4) +" Price per Day", "Add AvailableCar", JOptionPane.QUESTION_MESSAGE);
                                                        price = Double.parseDouble(strPrice);

                                                        //catch error if user input special caracter
                                                        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
                                                        
                                                        Matcher matcher = pattern.matcher(car_model);
                                                        boolean isStringContainsSpecialCharacter = matcher.find();
                                                        if(isStringContainsSpecialCharacter) throw new CatchNewError();
                                                        
                                                        Matcher matcher1 = pattern.matcher(car_type);
                                                        boolean isStringContainsSpecialCharacter1 = matcher1.find();
                                                        if(isStringContainsSpecialCharacter1) throw new CatchNewError();

                                                        valid_addCar = false;

                                                        rates [j] = new Rate (rate);
                                                        cars [j] = new Available_Car (car_model, car_type, seater, rates[j], price);
                                                        j++;
                                                    } while (j  < (element+5) );
                                                }catch (NumberFormatException ImmE) {
                                                    JOptionPane.showMessageDialog(null, "ERROR !! Invalid input !! Try again...", "Add Available Car", JOptionPane.ERROR_MESSAGE);
                                                } catch (CatchNewError ior) {
                                                    JOptionPane.showMessageDialog(null, ior.specialCaracter_errorMessage(), "Add Available Car", JOptionPane.ERROR_MESSAGE);

                                                }
                                            }while (j  < (element+5) || valid_addCar);

                                            frameEmployeeDo.dispose();
                                            for (int i = 0; i < (element+5); i++){
                                                try {
                                                    cars[i].displayCar();
                                                } catch (IOException ex) {
                                                    Logger.getLogger(CarRentalSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } 
                                        }
                                        else {
                                            UIManager um = new UIManager();
                                            um.put("OptionPane.messageForeground", Color.red);
                                            JOptionPane.showMessageDialog(null, "Fill in all blank\nor\nEnter a valid phone number exp: 012-3456 7890", "ERROR !!", JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                });
                                panelEmployeeDo.add(buttonAdd_aCarEmployee);
                                
 //--------------------------------------------------------               Issued Car             ------------------------------------------------------------------------------------//
                                    //////////////////////               View Issued Car         ////////////////////////////
                                    
                                buttonView_iCarEmployee = new JButton("View Issued Car");
                                buttonView_iCarEmployee.setBounds(70, 520, 339, 25);
                                buttonView_iCarEmployee.addMouseListener(new MouseAdapter() {
                                    Color color = buttonView_iCarEmployee.getForeground();
                                    @Override
                                    public void mouseEntered(MouseEvent me) {
                                        color = buttonView_iCarEmployee.getForeground();
                                        buttonView_iCarEmployee.setBackground(Color.green); // change the color to green when mouse over a button
                                    }
                                    @Override
                                    public void mouseExited(MouseEvent me) {
                                        buttonView_iCarEmployee.setBackground(color);
                                    }
                                });
                                buttonView_iCarEmployee.addActionListener(new CarRentalSystemGUI(){
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        String name = NameText.getText();
                                        String phoneNo = PhonenoText.getText();
                                        
                                        if (!name.isEmpty() && (phoneNo.matches("\\d{3}[-\\.\\s]\\d{4}[-\\.\\s]\\d{4}") || phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))) {
                                            frameEmployeeDo.dispose();
                                            for (int i = 5; i < 10; i++){
                                                try {
                                                    cars[i].displayCar();
                                                } catch (IOException ex) {
                                                    Logger.getLogger(CarRentalSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            }
                                        }
                                        else {
                                            UIManager um = new UIManager();
                                            um.put("OptionPane.messageForeground", Color.red);
                                            JOptionPane.showMessageDialog(null, "Fill in all blank\nor\nEnter a valid phone number exp: 012-3456 7890", "ERROR !!", JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                });
                                panelEmployeeDo.add(buttonView_iCarEmployee);
                                
                                    //////////////////////               Add Issued Car         ////////////////////////////
                                    
                                buttonAdd_iCarEmployee = new JButton("Add Issued Car");
                                buttonAdd_iCarEmployee.setBounds(70, 560, 339, 25);
                                buttonAdd_iCarEmployee.addMouseListener(new MouseAdapter() {
                                    Color color = buttonAdd_iCarEmployee.getForeground();
                                    @Override
                                    public void mouseEntered(MouseEvent me) {
                                        color = buttonAdd_iCarEmployee.getForeground();
                                        buttonAdd_iCarEmployee.setBackground(Color.green); // change the color to green when mouse over a button
                                    }
                                    @Override
                                    public void mouseExited(MouseEvent me) {
                                        buttonAdd_iCarEmployee.setBackground(color);
                                    }
                                });
                                buttonAdd_iCarEmployee.addActionListener(new CarRentalSystemGUI(){
                                    
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        String name = NameText.getText();
                                        String phoneNo = PhonenoText.getText();
                                        
                                        if (!name.isEmpty() && (phoneNo.matches("\\d{3}[-\\.\\s]\\d{4}[-\\.\\s]\\d{4}") || phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))) {
                                            frameEmployeeDo.dispose();
                                            //exception handling for add available car
                                            String strElement = "", strSeater = "";
                                            int element = 0;
                                            boolean valid_element = true;
                                            do {
                                                try {
                                                    strElement = JOptionPane.showInputDialog(null, "How many car you want to add?", "Add Issued Car", JOptionPane.QUESTION_MESSAGE);
                                                    element = Integer.parseInt(strElement);
                                                    valid_element = false;
                                                } catch (NumberFormatException ImmE) {
                                                    //element = Integer.parseInt(strElement);
                                                    JOptionPane.showMessageDialog(null, "ERROR !! Invalid input !! Try again...", "Add Issued Car", JOptionPane.ERROR_MESSAGE);
                                                }
                                            }while (valid_element);

                                            //exception handling for add available car detail
                                            String car_model = "", car_type = "", damage_info = "";
                                            int seater = 0, j = 10;
                                            double rate =0, cost_repair = 0;
                                            boolean valid_addCar = true;
                                            do {
                                                try {
                                                    do{
                                                        car_model = JOptionPane.showInputDialog(null, "Car " + (j-9) +" Model", "Add Issued Car", JOptionPane.QUESTION_MESSAGE);
                                                        car_type = JOptionPane.showInputDialog(null, "Car " + (j-9) +" Type", "Add Issued Car", JOptionPane.QUESTION_MESSAGE);
                                                        strSeater = JOptionPane.showInputDialog(null, "Car " + (j-9) +" Seater", "Add Issued Car", JOptionPane.QUESTION_MESSAGE);
                                                        seater = Integer.parseInt(strSeater);
                                                        String strRate = JOptionPane.showInputDialog(null, "Car " + (j-9) +" Rate", "Add Issued Car", JOptionPane.QUESTION_MESSAGE);
                                                        rate = Double.parseDouble(strRate);
                                                        damage_info = JOptionPane.showInputDialog(null, "Car " + (j-9) +" Damage info", "Add Issued Car", JOptionPane.QUESTION_MESSAGE);
                                                        String strPrice = JOptionPane.showInputDialog(null, "Car " + (j-9) +" Price per Day", "Add Issued Car", JOptionPane.QUESTION_MESSAGE);
                                                        cost_repair = Double.parseDouble(strPrice);

                                                        //catch error if user input special caracter
                                                        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
                                                        
                                                        Matcher matcher = pattern.matcher(car_model);
                                                        boolean isStringContainsSpecialCharacter = matcher.find();
                                                        if(isStringContainsSpecialCharacter) throw new CatchNewError();
                                                        
                                                        Matcher matcher1 = pattern.matcher(car_type);
                                                        boolean isStringContainsSpecialCharacter1 = matcher1.find();
                                                        if(isStringContainsSpecialCharacter1) throw new CatchNewError();

                                                        valid_addCar = false;

                                                        rates [j] = new Rate (rate);
                                                        cars [j] = new Issued_Car (car_model, car_type, seater, rates[j], damage_info, cost_repair);
                                                        j++;
                                                    } while (j  < (element+10) );
                                                }catch (NumberFormatException ImmE) {
                                                    JOptionPane.showMessageDialog(null, "ERROR !! Invalid input !! Try again...", "Add Issued Car", JOptionPane.ERROR_MESSAGE);
                                                } catch (CatchNewError ior) {
                                                   JOptionPane.showMessageDialog(null, ior.specialCaracter_errorMessage(), "Add Issued Car", JOptionPane.ERROR_MESSAGE);
                                                }
                                            }while (j  < (element+10) || valid_addCar);

                                            frameEmployeeDo.dispose();
                                            for (int i = 5; i < (element+10); i++){
                                                try {
                                                    cars[i].displayCar();
                                                } catch (IOException ex) {
                                                    Logger.getLogger(CarRentalSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
                                                }
                                            } 
                                        }
                                        else {
                                            UIManager um = new UIManager();
                                            um.put("OptionPane.messageForeground", Color.red);
                                            JOptionPane.showMessageDialog(null, "Fill in all blank\nor\nEnter a valid phone number exp: 012-3456 7890", "ERROR !!", JOptionPane.ERROR_MESSAGE);
                                        }
                                        
                                    }
                                });
                                panelEmployeeDo.add(buttonAdd_iCarEmployee);
                                
                                errorText = new JLabel("");
                                errorText.setBounds(50,370,180,25);
                                panelEmployeeDo.add(errorText);
                                
                                frameEmployeeDo.setVisible(true);
                                
                            } else {
                                UIManager um = new UIManager();
                                um.put("OptionPane.messageForeground", Color.red);
                                JOptionPane.showMessageDialog(null, "Your Username or password is incorrect. \nPlease try again.... ","ERROR !!", JOptionPane.ERROR_MESSAGE);
                                success.setText("Re-Enter your username and password");
                                success.setForeground(Color.red);
                            }
                        }
                    });
                    panelLogin.add(button);
        
                    success = new JLabel ("");
                    success.setBounds(50, 170, 400, 25);
                    panelLogin.add(success);

                    frameLogin.setVisible(true);
                }
            }
        });
        panelPersonType.add(buttonEmployee);
        
//=========================================================             Customer          =============================================================================================//

        //button to login as customer
        buttonCustomer = new JButton("Customer");
        buttonCustomer.setBounds(530, 370, 100, 25);
        buttonCustomer.addMouseListener(new MouseAdapter() {
            Color color = buttonCustomer.getForeground();
            @Override
            public void mouseEntered(MouseEvent me) {
                color = buttonCustomer.getForeground();
                buttonCustomer.setBackground(Color.green); // change the color to green when mouse over a button
            }
            @Override
            public void mouseExited(MouseEvent me) {
            buttonCustomer.setBackground(color);
            }
        });
        buttonCustomer.addActionListener(new CarRentalSystemGUI(){
            @Override
            public void actionPerformed(ActionEvent who) {
                if (who.getSource() == buttonCustomer) {
                    framePersonType.dispose();
                    //create panel login
                    JPanel panelLogin = new JPanel();
                    //create frame
                    JFrame frameLogin = new JFrame("Customer Login");
                    frameLogin.setSize(450, 300);
                    frameLogin.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    frameLogin.setLocationRelativeTo(null); // display fram at center of screen
                    frameLogin.setIconImage(vicenzo.getImage());
                    frameLogin.add(panelLogin);
        
                    panelLogin.setLayout(null);
                    
                    //icon login
                    picLabel = new JLabel();
                    picLabel.setIcon(login);
                    picLabel.setBounds(190,5,100,100);
                    panelLogin.add(picLabel);
                    
                    //add label "username" to panel
                    userlabel = new JLabel("Username");
                    userlabel.setBounds(50,110,80,25);
                    panelLogin.add(userlabel);
        
                    //create text field fpr username with lenght 20
                    userText = new JTextField(20);
                    userText.setBounds(140, 110, 230, 25);
                    panelLogin.add(userText);
      
                    passwordLabel = new JLabel("Password");
                    passwordLabel.setBounds(50,140,80,25);
                    panelLogin.add(passwordLabel);
        
                    //create password field for password that will censor the content
                    passwordText = new JPasswordField();
                    passwordText.setBounds(140, 140, 230, 25);
                    panelLogin.add(passwordText);
        
                    button = new JButton("Login");
                    button.setBounds(288, 200, 100, 25);
                    button.addActionListener(new CarRentalSystemGUI(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String user = userText.getText();
                            String password = passwordText.getText();
        
                            if (user.equals("haziq") && password.equals("haziq123")) { 
                                
                                frameLogin.dispose();
                                
                                //create oanel for employee do
                                JPanel panelEmployeeDo = new JPanel();
                                //create frame for employee do 
                                JFrame frameEmployeeDo = new JFrame("Customer");
                                frameEmployeeDo.setSize(500, 560);
                                frameEmployeeDo.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                frameEmployeeDo.setLocationRelativeTo(null);
                                frameEmployeeDo.setIconImage(vicenzo.getImage());
                                frameEmployeeDo.add(panelEmployeeDo);
                                
                                panelEmployeeDo.setLayout(null);
                                
                                picWelcomeLabel = new JLabel();
                                picWelcomeLabel.setIcon(welcome);
                                picWelcomeLabel.setBounds(0,0,500,251);
                                panelEmployeeDo.add(picWelcomeLabel);
                                
                                 //add greeting to panel
                                greeting = new JLabel ("Hi, "+userText.getText());
                                greeting.setBounds(70, 270, 200, 25);
                                panelEmployeeDo.add(greeting);
                                
                                //add label "username" to panel
                                NameLabel = new JLabel("Driver Name");
                                NameLabel.setBounds(70,310,120,25);
                                panelEmployeeDo.add(NameLabel);
        
                                //create text field fpr username with lenght 20
                                NameText = new JTextField(20);
                                NameText.setBounds(190, 310, 250, 25);
                                panelEmployeeDo.add(NameText);
                                
                                PhonenoLabel = new JLabel("Driver Phone No.");
                                PhonenoLabel.setBounds(70,340,120,25);
                                panelEmployeeDo.add(PhonenoLabel);
        
                                PhonenoText = new JTextField(10);
                                PhonenoText.setBounds(190, 340, 250, 25);
                                panelEmployeeDo.add(PhonenoText);

                                licencesLabel = new JLabel("Driver IC No.");
                                licencesLabel.setBounds(70,370,120,25);
                                panelEmployeeDo.add(licencesLabel);
        
                                licencesText = new JTextField(10);
                                licencesText.setBounds(190, 370, 250, 25);
                                panelEmployeeDo.add(licencesText);  
                                
                                    //////////////////////               Customer View Details         ////////////////////////////
                                
                                buttonViewdetail = new JButton("View Details");
                                buttonViewdetail.setBounds(70, 430, 339, 25);
                                buttonViewdetail.addMouseListener(new MouseAdapter() {
                                    Color color = buttonViewdetail.getForeground();
                                    @Override
                                    public void mouseEntered(MouseEvent me) {
                                        color = buttonViewdetail.getForeground();
                                        buttonViewdetail.setBackground(Color.green); // change the color to green when mouse over a button
                                    }
                                    @Override
                                    public void mouseExited(MouseEvent me) {
                                        buttonViewdetail.setBackground(color);
                                    }
                                });
                                buttonViewdetail.addActionListener(new CarRentalSystemGUI(){
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        //variable for passing to class employee 
                                        String employee_name = NameText.getText();
                                        String phone_number = PhonenoText.getText();
                                        String licences_number = licencesText.getText();
                                        
                                        //validate form and phone number
                                        if (!employee_name.isEmpty() && licences_number.matches("\\d{6}[-\\.\\s]\\d{2}[-\\.\\s]\\d{4}") && (phone_number.matches("\\d{3}[-\\.\\s]\\d{4}[-\\.\\s]\\d{4}") || phone_number.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))) {
                                            frameEmployeeDo.dispose();
                                            
                                            try {
                                                displayCustomer(user, password, employee_name, phone_number, licences_number);
                                            } catch (IOException ex) {
                                                Logger.getLogger(CarRentalSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
                                            }
                                        }
                                        else {
                                            UIManager um = new UIManager();
                                            um.put("OptionPane.messageForeground", Color.red);
                                            JOptionPane.showMessageDialog(null, "Fill in all blank\nor\nEnter a valid phone number exp: 012-3456 7890\nor\nEnter a valid IC number exp: 001122-10-2244", "Add Available Car", JOptionPane.ERROR_MESSAGE);
                                        }

                                    }
                                });
                                panelEmployeeDo.add(buttonViewdetail);
                                
                                    //////////////////////               Customer Booking Car        ////////////////////////////
                                
                                buttonBookingCar = new JButton("Booking Car");
                                buttonBookingCar.setBounds(70, 470, 339, 25);
                                buttonBookingCar.addMouseListener(new MouseAdapter() {
                                    Color color = buttonBookingCar.getForeground();
                                    @Override
                                    public void mouseEntered(MouseEvent me) {
                                        color = buttonBookingCar.getForeground();
                                        buttonBookingCar.setBackground(Color.green); // change the color to green when mouse over a button
                                    }
                                    @Override
                                    public void mouseExited(MouseEvent me) {
                                        buttonBookingCar.setBackground(color);
                                    }
                                });
                                buttonBookingCar.addActionListener(new CarRentalSystemGUI(){
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        //variable for passing to class employee 
                                        String employee_name = NameText.getText();
                                        String phone_number = PhonenoText.getText();
                                        String licences_number = licencesText.getText();
                                        
                                        if (!employee_name.isEmpty() && licences_number.matches("\\d{6}[-\\.\\s]\\d{2}[-\\.\\s]\\d{4}") && (phone_number.matches("\\d{3}[-\\.\\s]\\d{4}[-\\.\\s]\\d{4}") || phone_number.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))) {
                                            frameEmployeeDo.dispose();

                                            //cretae frame for booking
                                            JPanel panelBooking = new JPanel();
                                            //create frame for booking
                                            JFrame frameBooking= new JFrame("Booking Car");
                                            frameBooking.setSize(750, 820);
                                            frameBooking.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                            frameBooking.setLocationRelativeTo(null); // display frame at center of screen
                                            frameBooking.setIconImage(vicenzo.getImage());
                                            frameBooking.add(panelBooking);

                                            panelBooking.setLayout(null);

                                            bookingLabel = new JLabel("Choose Car");
                                            bookingLabel.setFont(bookingLabel.getFont().deriveFont(16.0f));
                                            bookingLabel.setBounds(50, 20, 400, 25);
                                            panelBooking.add(bookingLabel);

                                            buttonPersona = new JButton("Persona", persona);
                                            buttonPersona.setBounds(50, 60, 339, 25);
                                            buttonPersona.setSize(300, 220);
                                            // Text below image
                                            buttonPersona.setVerticalTextPosition(SwingConstants.BOTTOM);
                                            // And centred
                                            buttonPersona.setHorizontalTextPosition(SwingConstants.CENTER);
                                            buttonPersona.addMouseListener(new MouseAdapter() {
                                                Color color = buttonPersona.getForeground();
                                                @Override
                                                public void mouseEntered(MouseEvent me) {
                                                    color = buttonPersona.getForeground();
                                                    buttonPersona.setBackground(Color.green); // change the color to green when mouse over a button
                                                }
                                                @Override
                                                public void mouseExited(MouseEvent me) {
                                                    buttonPersona.setBackground(color);
                                                }
                                            });
                                            buttonPersona.addActionListener(new CarRentalSystemGUI(){
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    //exception handling for add available car
                                                    String strDay = "";
                                                    int day = 0;
                                                    boolean valid_day = true;
                                                    do {
                                                        try {
                                                            strDay = JOptionPane.showInputDialog(null, "How long you want to rent?", "Booking Car", JOptionPane.QUESTION_MESSAGE);
                                                            day = Integer.parseInt(strDay);
                                                            valid_day = false;
                                                        } catch (NumberFormatException ImmE) {
                                                            JOptionPane.showMessageDialog(null, "ERROR !! Invalid input !! Try again...", "Booking Car", JOptionPane.ERROR_MESSAGE);
                                                        }
                                                    }while (valid_day);
                                                    day = Integer.parseInt(strDay);

                                                    //invois
                                                    frameBooking.dispose();     

                                                    try {
                                                        invois(userText.getText(), NameText.getText(), PhonenoText.getText(), licencesText.getText(), "Persona", "Economy", 5, rates[0], 150.0, day);
                                                    } catch (IOException ex) {
                                                        Logger.getLogger(CarRentalSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
                                                    }

                                                }
                                            });
                                            panelBooking.add(buttonPersona);

                                            buttonSaga = new JButton("Saga FLX", saga);
                                            buttonSaga.setBounds(360, 60, 339, 25);
                                            buttonSaga.setSize(300, 220);
                                            // Text below image
                                            buttonSaga.setVerticalTextPosition(SwingConstants.BOTTOM);
                                            // And centred
                                            buttonSaga.setHorizontalTextPosition(SwingConstants.CENTER);
                                            buttonSaga.addMouseListener(new MouseAdapter() {
                                                Color color = buttonSaga.getForeground();
                                                @Override
                                                public void mouseEntered(MouseEvent me) {
                                                    color = buttonSaga.getForeground();
                                                    buttonSaga.setBackground(Color.green); // change the color to green when mouse over a button
                                                }
                                                @Override
                                                public void mouseExited(MouseEvent me) {
                                                    buttonSaga.setBackground(color);
                                                }
                                            });
                                            buttonSaga.addActionListener(new CarRentalSystemGUI(){
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    //exception handling for add available car
                                                    String strDay = "";
                                                    int day = 0;
                                                    boolean valid_day = true;
                                                    do {
                                                        try {
                                                            strDay = JOptionPane.showInputDialog(null, "How long you want to rent?", "Booking Car", JOptionPane.QUESTION_MESSAGE);
                                                            day = Integer.parseInt(strDay);
                                                            valid_day = false;
                                                        } catch (NumberFormatException ImmE) {
                                                            JOptionPane.showMessageDialog(null, "ERROR !! Invalid input !! Try again...", "Booking Car", JOptionPane.ERROR_MESSAGE);
                                                        }
                                                    }while (valid_day);
                                                    day = Integer.parseInt(strDay);
                                                    //invois
                                                    frameBooking.dispose();
                                                    try {
                                                        invois(userText.getText(), NameText.getText(), PhonenoText.getText(), licencesText.getText(), "Saga FLX", "Economy", 5, rates[1], 120.0, day);
                                                    } catch (IOException ex) {
                                                        Logger.getLogger(CarRentalSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
                                                    }

                                                }
                                            });
                                            panelBooking.add(buttonSaga);

                                            buttonEzora = new JButton("Ezora", ezora);
                                            buttonEzora.setBounds(50, 520, 339, 25);
                                            buttonEzora.setSize(300, 220);
                                            // Text below image
                                            buttonEzora.setVerticalTextPosition(SwingConstants.BOTTOM);
                                            // And centred
                                            buttonEzora.setHorizontalTextPosition(SwingConstants.CENTER);
                                            buttonEzora.addMouseListener(new MouseAdapter() {
                                                Color color = buttonEzora.getForeground();
                                                @Override
                                                public void mouseEntered(MouseEvent me) {
                                                    color = buttonEzora.getForeground();
                                                    buttonEzora.setBackground(Color.green); // change the color to green when mouse over a button
                                                }
                                                @Override
                                                public void mouseExited(MouseEvent me) {
                                                    buttonEzora.setBackground(color);
                                                }
                                            });
                                            buttonEzora.addActionListener(new CarRentalSystemGUI(){
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    //exception handling for add available car
                                                    String strDay = "";
                                                    int day = 0;
                                                    boolean valid_day = true;
                                                    do {
                                                        try {
                                                            strDay = JOptionPane.showInputDialog(null, "How long you want to rent?", "Booking Car", JOptionPane.QUESTION_MESSAGE);
                                                            day = Integer.parseInt(strDay);
                                                            valid_day = false;
                                                        } catch (NumberFormatException ImmE) {
                                                            JOptionPane.showMessageDialog(null, "ERROR !! Invalid input !! Try again...", "Booking Car", JOptionPane.ERROR_MESSAGE);
                                                        }
                                                    }while (valid_day);
                                                    day = Integer.parseInt(strDay);
                                                     //invois
                                                    frameBooking.dispose();
                                                    try {
                                                        invois(userText.getText(), NameText.getText(), PhonenoText.getText(), licencesText.getText(), "Ezora", "Family", 7, rates[2], 230.0, day);
                                                    } catch (IOException ex) {
                                                        Logger.getLogger(CarRentalSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
                                                    }
                                                }
                                            });
                                            panelBooking.add(buttonEzora);

                                            buttonMyvi = new JButton("Myvi", myvi);
                                            buttonMyvi.setBounds(360, 290, 339, 25);
                                            buttonMyvi.setSize(300, 220);
                                            // Text below image
                                            buttonMyvi.setVerticalTextPosition(SwingConstants.BOTTOM);
                                            // And centred
                                            buttonMyvi.setHorizontalTextPosition(SwingConstants.CENTER);
                                            buttonMyvi.addMouseListener(new MouseAdapter() {
                                                Color color = buttonMyvi.getForeground();
                                                @Override
                                                public void mouseEntered(MouseEvent me) {
                                                    color = buttonMyvi.getForeground();
                                                    buttonMyvi.setBackground(Color.green); // change the color to green when mouse over a button
                                                }
                                                @Override
                                                public void mouseExited(MouseEvent me) {
                                                    buttonMyvi.setBackground(color);
                                                }
                                            });
                                            buttonMyvi.addActionListener(new CarRentalSystemGUI(){
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    //exception handling for add available car
                                                    String strDay = "";
                                                    int day = 0;
                                                    boolean valid_day = true;
                                                    do {
                                                        try {
                                                            strDay = JOptionPane.showInputDialog(null, "How long you want to rent?", "Booking Car", JOptionPane.QUESTION_MESSAGE);
                                                            day = Integer.parseInt(strDay);
                                                            valid_day = false;
                                                        } catch (NumberFormatException ImmE) {
                                                            JOptionPane.showMessageDialog(null, "ERROR !! Invalid input !! Try again...", "Booking Car", JOptionPane.ERROR_MESSAGE);
                                                        }
                                                    }while (valid_day);
                                                    day = Integer.parseInt(strDay);

                                                    frameBooking.dispose();
                                                    try {
                                                        invois(userText.getText(), NameText.getText(), PhonenoText.getText(), licencesText.getText(), "Myvi", "Compact", 5, rates[3], 110.0, day);
                                                    } catch (IOException ex) {
                                                        Logger.getLogger(CarRentalSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
                                                    }

                                                }
                                            });
                                            panelBooking.add(buttonMyvi);

                                            buttonCivic = new JButton("Honda Civic", civic);
                                            buttonCivic.setBounds(50, 290, 339, 25);
                                            buttonCivic.setSize(300, 220);
                                            // Text below image
                                            buttonCivic.setVerticalTextPosition(SwingConstants.BOTTOM);
                                            // And centred
                                            buttonCivic.setHorizontalTextPosition(SwingConstants.CENTER);
                                            buttonCivic.addMouseListener(new MouseAdapter() {
                                                Color color = buttonCivic.getForeground();
                                                @Override
                                                public void mouseEntered(MouseEvent me) {
                                                    color = buttonCivic.getForeground();
                                                    buttonCivic.setBackground(Color.green); // change the color to green when mouse over a button
                                                }
                                                @Override
                                                public void mouseExited(MouseEvent me) {
                                                    buttonCivic.setBackground(color);
                                                }
                                            });
                                            buttonCivic.addActionListener(new CarRentalSystemGUI(){
                                                @Override
                                                public void actionPerformed(ActionEvent e) {
                                                    //exception handling for add available car
                                                    String strDay = "";
                                                    int day = 0;
                                                    boolean valid_day = true;
                                                    do {
                                                        try {
                                                            strDay = JOptionPane.showInputDialog(null, "How long you want to rent?", "Booking Car", JOptionPane.QUESTION_MESSAGE);
                                                            day = Integer.parseInt(strDay);
                                                            valid_day = false;
                                                        } catch (NumberFormatException ImmE) {
                                                            JOptionPane.showMessageDialog(null, "ERROR !! Invalid input !! Try again...", "Booking Car", JOptionPane.ERROR_MESSAGE);
                                                        }
                                                    }while (valid_day);
                                                    day = Integer.parseInt(strDay);

                                                    frameBooking.dispose();
                                                    try {
                                                        invois(userText.getText(), NameText.getText(), PhonenoText.getText(), licencesText.getText(), "Civic", "Economy", 5, rates[4], 190.0, day);
                                                    } catch (IOException ex) {
                                                        Logger.getLogger(CarRentalSystemGUI.class.getName()).log(Level.SEVERE, null, ex);
                                                    }

                                                }
                                            });
                                            panelBooking.add(buttonCivic);

                                            frameBooking.setVisible(true);
                                        }
                                        else {
                                            UIManager um = new UIManager();
                                            um.put("OptionPane.messageForeground", Color.red);
                                            JOptionPane.showMessageDialog(null, "Fill in all blank\nor\nEnter a valid phone number exp: 012-3456 7890\nor\nEnter a valid IC number exp: 001122-10-2244", "Add Available Car", JOptionPane.ERROR_MESSAGE);
                                        }
                                    }      
                                });
                                panelEmployeeDo.add(buttonBookingCar);
                                
                                frameEmployeeDo.setVisible(true);
                                
                            } else {
                                UIManager um = new UIManager();
                                um.put("OptionPane.messageForeground", Color.red);
                                JOptionPane.showMessageDialog(null, "Your Username or password is incorrect. \nPlease try again.... ","ERROR !!", JOptionPane.ERROR_MESSAGE);
                                success.setText("Re-Enter your username and password");
                                success.setForeground(Color.red);
                            }
                        }
                    });
                    panelLogin.add(button);
        
                    success = new JLabel ("");
                    success.setBounds(50, 170, 400, 25);
                    panelLogin.add(success);

                    frameLogin.setVisible(true);
                }
            }
        });
        panelPersonType.add(buttonCustomer);
        
        framePersonType.setVisible(true);
    }
    
      @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void invois (String username, String name, String phone_no, String lisense, String car_model, String car_type, int seater, Rate rate, double price, int day) throws IOException{
        String strSeater = String.valueOf(seater);
        String strRate = String.valueOf(rate);
        String strPrice = String.valueOf(price);
        String strDay = String.valueOf(day);
        
        double totalPrice = price * day;
        String strTotalprice = String.valueOf(totalPrice);

        //create image for icon
        URL url = new URL ("https://p.kindpng.com/picc/s/7-78945_car-cartoon-icon-png-transparent-png.png");
        BufferedImage img = ImageIO.read(url);
        ImageIcon vicenzo = new ImageIcon(img);
        
        //create panel for invocie
        JPanel panelinvoice = new JPanel();
        //create frame for employee do 
        JFrame frameInvoice = new JFrame("Invoice");
        frameInvoice.setSize(390, 500);
        frameInvoice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameInvoice.setLocationRelativeTo(null);
        frameInvoice.setIconImage(vicenzo.getImage());
        frameInvoice.add(panelinvoice);                       
        panelinvoice.setLayout(null);
        
        JLabel headerLabel = new JLabel ("Your Invoice");
        headerLabel.setBounds(50, 20, 200, 25);
        headerLabel.setFont(headerLabel.getFont().deriveFont(16.0f));
        headerLabel.setForeground(Color.DARK_GRAY);
        panelinvoice.add(headerLabel);  
        
        JLabel userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(50,60,150,25);
        panelinvoice.add(userNameLabel);
        
        JLabel userName1Label = new JLabel(": " + username);
        userName1Label.setBounds(200,60,180,25);
        panelinvoice.add(userName1Label);
        
        NameLabel = new JLabel("Driver Name");
        NameLabel.setBounds(50,90,150,25);
        panelinvoice.add(NameLabel);
        
        JLabel Name1Label = new JLabel(": " + name);
        Name1Label.setBounds(200,90,180,25);
        panelinvoice.add(Name1Label);
        
        PhonenoLabel = new JLabel("Driver Phone Number");
        PhonenoLabel.setBounds(50,120,150,25);
        panelinvoice.add(PhonenoLabel);
        
        JLabel Phoneno1Label = new JLabel(": " + phone_no);
        Phoneno1Label.setBounds(200,120,180,25);
        panelinvoice.add(Phoneno1Label);
        
        JLabel lisencesLabel = new JLabel("Driver Licences Number");
        lisencesLabel.setBounds(50,150,150,25);
        panelinvoice.add(lisencesLabel);
        
        JLabel lisences1Label = new JLabel(": " + lisense);
        lisences1Label.setBounds(200,150,180,25);
        panelinvoice.add(lisences1Label);
        
        JLabel carModel = new JLabel("Car Name");
        carModel.setBounds(50,180,100,25);
        panelinvoice.add(carModel);
        
        JLabel carModel1= new JLabel(": "+ car_model);
        carModel1.setBounds(200,180,180,25);
        panelinvoice.add(carModel1);
        
        JLabel CarType = new JLabel("Car Type");
        CarType.setBounds(50,210,100,25);
        panelinvoice.add(CarType);
        
        JLabel CarType1 = new JLabel(": " + car_type);
        CarType1.setBounds(200,210,180,25);
        panelinvoice.add(CarType1);
        
        JLabel SeatNum = new JLabel("Seat Number");
        SeatNum.setBounds(50,240,100,25);
        panelinvoice.add(SeatNum);
        
        JLabel SeatNum1 = new JLabel(": " + strSeater);
        SeatNum1.setBounds(200,240,180,25);
        panelinvoice.add(SeatNum1);
        
        JLabel CarRate = new JLabel("Car Rate");
        CarRate.setBounds(50,270,100,25);
        panelinvoice.add(CarRate);
        
        JLabel CarRate1 = new JLabel(": " + strRate);
        CarRate1.setBounds(200,270,180,25);
        panelinvoice.add(CarRate1);
        
        JLabel CarPrice = new JLabel("Car Price");
        CarPrice.setBounds(50,300,100,25);
        panelinvoice.add(CarPrice);
        
        JLabel CarPrice1 = new JLabel(": " + strPrice);
        CarPrice1.setBounds(200,300,180,25);
        panelinvoice.add(CarPrice1);
        
        JLabel DayRent= new JLabel("Day");
        DayRent.setBounds(50,330,100,25);
        panelinvoice.add(DayRent);
        
        JLabel DayRent1 = new JLabel(": " + strDay);
        DayRent1.setBounds(200,330,180,25);
        panelinvoice.add(DayRent1);
        
        JLabel TotalPrice = new JLabel("Total Price");
        TotalPrice.setBounds(50,360,100,25);
        panelinvoice.add(TotalPrice);
        
        JLabel TotalPrice1 = new JLabel(":RM " + strTotalprice);
        TotalPrice1.setBounds(200,360,180,25);
        panelinvoice.add(TotalPrice1);
        
        frameInvoice.setVisible(true);
    }
    
     // Display employee information in capital letter
    public void displayEmployee(String user, String password, String name, String phoneNo) throws IOException { 
        //create image for icon
        URL url = new URL ("https://p.kindpng.com/picc/s/7-78945_car-cartoon-icon-png-transparent-png.png");
        BufferedImage img = ImageIO.read(url);
        ImageIcon vicenzo = new ImageIcon(img);
        
        //create oanel for employee do
        JPanel panelDisplayEmployee = new JPanel();
        //create frame for employee do 
        JFrame frameEmployeeDo = new JFrame("Employee");
        frameEmployeeDo.setSize(350, 250);
        frameEmployeeDo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameEmployeeDo.setLocationRelativeTo(null);
        frameEmployeeDo.setIconImage(vicenzo.getImage());
        frameEmployeeDo.add(panelDisplayEmployee);
                                
        panelDisplayEmployee.setLayout(null);
        
        JLabel headerLabel = new JLabel ("Employee Details");
        headerLabel.setBounds(50, 20, 200, 25);
        headerLabel.setFont(headerLabel.getFont().deriveFont(16.0f));
        headerLabel.setForeground(Color.DARK_GRAY);
        panelDisplayEmployee.add(headerLabel);
        
        JLabel userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(50,60,100,25);
        panelDisplayEmployee.add(userNameLabel);
        
        JLabel userName1Label = new JLabel(": "+user);
        userName1Label.setBounds(160,60,180,25);
        panelDisplayEmployee.add(userName1Label);
        
        JLabel userPasswordLabel = new JLabel("Password");
        userPasswordLabel.setBounds(50,90,100,25);
        panelDisplayEmployee.add(userPasswordLabel);
        
        JLabel userPassword1Label = new JLabel(": "+password);
        userPassword1Label.setBounds(160,90,80,25);
        panelDisplayEmployee.add(userPassword1Label);
        
        JLabel employeeNameLabel = new JLabel("Name");
        employeeNameLabel.setBounds(50,120,100,25);
        panelDisplayEmployee.add(employeeNameLabel);
        
        JLabel employeeName1Label = new JLabel(": "+name);
        employeeName1Label.setBounds(160,120,180,25);
        panelDisplayEmployee.add(employeeName1Label);
        
        JLabel employeePhonenoLabel = new JLabel("Phone Number");
        employeePhonenoLabel.setBounds(50,150,100,25);
        panelDisplayEmployee.add(employeePhonenoLabel);
        
        JLabel employeePhoneno1Label = new JLabel(": "+phoneNo);
        employeePhoneno1Label.setBounds(160,150,180,25);
        panelDisplayEmployee.add(employeePhoneno1Label);
        
        frameEmployeeDo.setVisible(true);
    }   
    
    // Display employee information in capital letter
    public void displayCustomer(String user, String password, String name, String phone_number, String licences_number) throws IOException { 
        //create image for icon
        URL url = new URL ("https://p.kindpng.com/picc/s/7-78945_car-cartoon-icon-png-transparent-png.png");
        BufferedImage img = ImageIO.read(url);
        ImageIcon vicenzo = new ImageIcon(img);
        
        //create oanel for employee do
        JPanel panelDisplayCustomer = new JPanel();
        //create frame for employee do 
        JFrame frameCustomerDo = new JFrame("Customer");
        frameCustomerDo.setSize(350, 290);
        frameCustomerDo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameCustomerDo.setLocationRelativeTo(null);
        frameCustomerDo.setIconImage(vicenzo.getImage());
        frameCustomerDo.add(panelDisplayCustomer);
                                
        panelDisplayCustomer.setLayout(null);
        
        JLabel headerLabel = new JLabel ("Customer Details");
        headerLabel.setBounds(50, 20, 200, 25);
        headerLabel.setFont(headerLabel.getFont().deriveFont(16.0f));
        headerLabel.setForeground(Color.DARK_GRAY);
        panelDisplayCustomer.add(headerLabel);
        
        JLabel userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(50,60,150,25);
        panelDisplayCustomer.add(userNameLabel);
        
        JLabel userName1Label = new JLabel(": "+user);
        userName1Label.setBounds(200,60,180,25);
        panelDisplayCustomer.add(userName1Label);
        
        JLabel userPasswordLabel = new JLabel("Password");
        userPasswordLabel.setBounds(50,90,150,25);
        panelDisplayCustomer.add(userPasswordLabel);
        
        JLabel userPassword1Label = new JLabel(": "+password);
        userPassword1Label.setBounds(200,90,80,25);
        panelDisplayCustomer.add(userPassword1Label);
        
        NameLabel = new JLabel("Driver Name");
        NameLabel.setBounds(50,120,150,25);
        panelDisplayCustomer.add(NameLabel);
        
        JLabel Name1Label = new JLabel(": "+ name);
        Name1Label.setBounds(200,120,180,25);
        panelDisplayCustomer.add(Name1Label);
        
        PhonenoLabel = new JLabel("Driver Phone Number");
        PhonenoLabel.setBounds(50,150,150,25);
        panelDisplayCustomer.add(PhonenoLabel);
        
        JLabel Phoneno1Label = new JLabel(": "+phone_number);
        Phoneno1Label.setBounds(200,150,180,25);
        panelDisplayCustomer.add(Phoneno1Label);
        
        JLabel lisencesLabel = new JLabel("Driver Licences Number");
        lisencesLabel.setBounds(50,180,150,25);
        panelDisplayCustomer.add(lisencesLabel);
        
        JLabel lisences1Label = new JLabel(": "+licences_number);
        lisences1Label.setBounds(200,180,180,25);
        panelDisplayCustomer.add(lisences1Label);
        
        frameCustomerDo.setVisible(true);
    }

}
