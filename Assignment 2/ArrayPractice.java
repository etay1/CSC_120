import java.util.Scanner;
public class AssignmentTwo {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);

        double[] temps = new double [10];
        double[] speeds = new double [10];
        double[] chills = new double [10];
        double avg;
        double far;

        /*
        1.)Two arrays to store users input for temp and windspeed which are indexed in pairs
        2.)Third array to store the set of windchill for each pair
        3.)Thus the chills[i] is the windchill for temps[i] and speeds[i]
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter temperature: ");
            temps[i] = input.nextDouble();
            System.out.println("Enter windspeed: ");
            speeds[i] = input.nextDouble();
            chills[i] = wcCalc(temps[i],speeds[i]);
        }

        //Average windchill
        double sum = 0.0;
        for (int i = 0; i < 10; i++) {
            sum += chills[i];
        }
        avg = sum / 10.0;

        //Below Average Counter
        int tally = 0;
        for (int i = 0; i < 10; i++) {
            if (chills[i] < avg) {
                tally++;
            }
        }

        //Output requirements 1 & 2
        System.out.println("The average wind chill for the ten inputs: " + avg);
        System.out.println("The number of wind chill temperatures that are below the average wind chill: " + tally);

        //Output requirement 3
        double max = getLargest(chills,10);
        double min = getSmallest(chills,10);
        if ((Math.abs(max) - avg) > (Math.abs(min) - avg)) {
            far = max;
            System.out.println("The wind chill that is furthest from the average: " + far);
        } else if ((Math.abs(max) - avg) < (Math.abs(min) - avg)){
            far = min;
            System.out.println("The wind chill that is furthest from the average: " + far);
        } else {
            System.out.println("There are two wind chill temperatures that are equal distance from the average." );
            System.out.println("The local maximum is : " + max);
            System.out.println("The local minimum is : " + min);
        }

    }

    public static double wcCalc (double t, double w) {
        double wc = 35.74 + 0.6215 * t - 35.75 * Math.pow (w, .16) + 0.4275 * t * Math.pow (w, .16);
        return wc;
    }

    public static double getLargest(double[] a, int size) {
        double temp;
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }

    public static double getSmallest(double[] a, int size) {
        double temp;
        for (int i = 0; i < size; i++)
        {
            for (int j = i + 1; j < size; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }

}
