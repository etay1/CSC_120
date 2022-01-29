import java.util.Scanner;
public class SemesterGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Test 1 Grade: ");
        int n1 = input.nextInt();
        System.out.println("Enter Test 2 Grade: ");
        int n2 = input.nextInt();
        System.out.println("Enter Test 3 Grade: ");
        int n3 = input.nextInt();

        //grab the lowest score
        int testLow = lowest(n1,n2,n3);
        //grab average of the top 2 test scores byway of subtracting the lowest grade in the numerator
        double average = avg(n1,n2,n3,testLow);
        //grab the letter associated with the average
        char letterGrade = letter(average);

        System.out.println(letterGrade);
    }

    public static int lowest (int a, int b, int c) {
        if (a < b) {
            if (c < a) {
                return c;
            } else {
                return a;
            }
        } else {
            if (b < c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static double avg (int a, int b, int c, int drop) {
        double z = (a + b + c - drop) / 2.0;
        return z;
    }

    public static char letter (double avg) {
        if (avg >= 90) {
            return 'A';
        } else if (avg < 90 && avg >= 80) {
            return 'B';
        } else if (avg < 80 && avg >= 70) {
            return 'C';
        } else if (avg < 70 && avg >= 60) {
            return 'D';
        } else {
            return 'E';
        }
    }
    
}
