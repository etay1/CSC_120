import java.util.Scanner;
public class UnspecifiedIntegers {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
         // force initialize entries to 0 to counter the input of 0 to break
        int n, pos = 0, neg = 0, total = 0, entries = -1;
        System.out.println("Enter positive or negative integers, enter 0 to end program");

        do {
            n = input.nextInt();
            total += n;
            entries++;

            if (n > 0) {
                pos++;
            } else if (n < 0) {
                neg++;
            }
        // repeat till use inputs 0 to break
        } while (n != 0);

        // integer division will truncate - must type cast or avg will truncate
        double avg = (double) (total) / (entries);

        if (pos == 0 && neg == 0){
            System.out.println("No number entered except for 0");
        } else {
            System.out.println("The number of positives is " + pos);
            System.out.println("The number of negatives is " + neg);
            System.out.println("The total is " + (double) total);
            System.out.println("The average is " + avg);
        }

    }
}
