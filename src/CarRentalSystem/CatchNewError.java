/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarRentalSystem;

/**
 *
 * @author fakhr
 */
class CatchNewError extends Exception {
    
    public CatchNewError () {
        super ("Input number 1 to 5 only !!");
    }
    
    public String specialCaracter_errorMessage () {
        return ("\nERROR !! Please dont use Special Character such as !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~");
    }
}
