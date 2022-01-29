import java.util.Scanner;
public class AverageTemp {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Day 1's high temperature: ");
        double day1H = input.nextDouble();
        System.out.println("Enter Day 1's low temperature: ");
        double day1L = input.nextDouble();
        System.out.println("Enter Day 2's high temperature: ");
        double day2H = input.nextDouble();
        System.out.println("Enter Day 2's low temperature: ");
        double day2L = input.nextDouble();
        System.out.println("Enter Day 3's high temperature: ");
        double day3H = input.nextDouble();
        System.out.println("Enter Day 3's low temperature: ");
        double day3L = input.nextDouble();
        System.out.println("Enter Day 4's high temperature: ");
        double day4H = input.nextDouble();
        System.out.println("Enter Day 4's low temperature: ");
        double day4L = input.nextDouble();
        
        double avgHigh = (day1H +day2H + day3H + day4H) / 4;
        double avgLow = (day1L + day2L + day3L + day4L) / 4;
        double maxHigh = Math.max(Math.max(day1H, day2H), Math.max(day3H, day4H));
        double minLow = Math.min(Math.min(day1L,day2L), Math.min (day3L, day4L));  
        
        System.out.println("Average High Temperature: " + avgHigh);
        System.out.println("Average Low Temperature: " +avgLow);
        System.out.println("Maximum High Temperature: " + maxHigh);
        System.out.println("Minimum Low Temperature: " + minLow);
    }
}
