import java.util.Scanner;
public class WindChill {
    public static void main (String[] args) {
        double w;
        double t;
        double wc;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter temperature between -58°F and 41°F: ");
        t = input.nextDouble();
        while (t < -58 || t > 41){
            System.out.println("This temperature is invalid, please reenter a value between -58°F and 41°F");
            t = input.nextDouble();
        }
           
        System.out.println("Enter wind speed greater or equal to 2 miles per hour: ");
        w = input.nextDouble();        
        while (w < 2.0) {
            System.out.println("Invalid wind speed, please enter a value greater than or equal to 2.0");
            w = input.nextDouble();
        }
        
        wc = 35.74 + 0.6215 * t - 35.75 * Math.pow (w, .16) + 0.4275 * t * Math.pow (w, .16);
        System.out.println("Wind chill is: " + wc);
 
    }
}
