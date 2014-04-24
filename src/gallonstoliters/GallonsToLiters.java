/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallonstoliters;

/**
 *
 * @author Michael Adams
 */
public class GallonsToLiters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons;
        double liters;
        
        int counter;
        counter = 0;
        gallons = 10;
        
        for(gallons = 1; gallons <= 100; gallons++){
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons is " + liters + " liters");
            counter++;
            
            if(counter == 10){
                System.out.println();
                counter = 0;
            }
        }
    }
}
