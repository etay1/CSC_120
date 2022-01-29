import java.util.Scanner;
public class ComputeThickness {
    public static void main(String [] args)
    {
        //Required declerations for program
        int innerRadius;
        double innerArea;
        int thickness;
        double outerArea;
        double finalArea;
    
        Scanner input = new Scanner (System.in);
    
        //User input for inner radius and thickness 
        System.out.println ("Enter the inner radius:");
        innerRadius = input.nextInt();
        System.out.println ("Enter thickness: ");
        thickness = input.nextInt ();
    
        /*obtain the outer area and subtract it from 
        the inner area to evaluate the area of the thickness*/
        innerArea = Math.pow (innerRadius, 2)* Math.PI;
        outerArea = Math.pow (innerRadius + thickness, 2) * Math.PI;
        finalArea = outerArea - innerArea; 
    
        System.out.println("Inner radius: " + innerRadius);
        System.out.println("Thickness: " + thickness);
        System.out.println("Area: " + finalArea);
    }
}
