import java.util.Scanner;
public class SlopeCalculator {
    public static void main(String[] args) {
        //Declare values for the coordinates and the slope
        int x1;
        int x2;
        int y1;
        int y2;
        double m;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter point A's coordinates (x1, y1)");
        x1 = input.nextInt();
        y1 = input.nextInt();
        System.out.println("Enter point B's coordinates (x2, y2)");
        x2 = input.nextInt();
        y2 = input.nextInt();
        m = (y2 - y1) / (double)(x2 - x1);
        
        System.out.println("The slope of the line that runs through point A and point B is: " + m);    
    }
}
