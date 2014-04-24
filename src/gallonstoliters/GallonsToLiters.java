/*
 * This is a program for converting gallons to liters.
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
