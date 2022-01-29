import java.util.Scanner;
public class Library {
    public static void main (String [] args) {
        int day;
        int month;
        int year;
        int dueDay;
        int dueMonth;
        int dueYear;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter current date: Day");
        day = input.nextInt();
        System.out.println("Enter current date: Month");
        month = input.nextInt();
        System.out.println("Enter current date: Year");
        year = input.nextInt();
        System.out.println("Enter due date: Day");
        dueDay = input.nextInt();
        System.out.println("Enter due date: Month");
        dueMonth = input.nextInt();
        System.out.println("Enter due date: Year");
        dueYear = input.nextInt();
        
        if (year > dueYear) {
            System.out.println("false");
        }   else if (year < dueYear) {
                System.out.println("true");
            }   else {
                if (month > dueMonth) {
                    System.out.println("false");
                }   else if (month < dueMonth) {
                        System.out.println("true");
                }   else {
                    if (day <= dueDay) {
                        System.out.println("true");
                    }   else {
                            System.out.println("false");
                        }
                    }
                }
                
        }      
    }
