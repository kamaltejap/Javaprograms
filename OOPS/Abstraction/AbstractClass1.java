package OOPS.Abstraction;
    // Abstract class with abstract methods NextDate and LeapYear
abstract class DateUtils {
    // Abstract method to calculate the next date
    public abstract String NextDate(int day, int month, int year);

    // Abstract method to check if a year is a leap year
    public abstract boolean LeapYear(int year);
}
// Concrete subclass that implements the abstract methods
class DateCalculator extends DateUtils {
    // Method to calculate the next date
    @Override
    public String NextDate(int day, int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Adjust for leap year in February
        if (LeapYear(year)) {
            daysInMonth[1] = 29;
        }
        day += 1; // Move to the next day
        // Check if the day exceeds the days in the current month
        if (day > daysInMonth[month - 1]) {
            day = 1; // Reset to the first day of the next month
            month += 1; // Move to the next month

            // Check if month exceeds 12 (December)
            if (month > 12) {
                month = 1; // Reset to January
                year += 1; // Move to the next year
            }
        }
        // Return the next date as a string
        return day + "/" + month + "/" + year;
    }
    // Method to check if a year is a leap year
    @Override
    public boolean LeapYear(int year) {
        // A leap year is divisible by 4, but not by 100, unless it's also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
// Main class to test the functionality
public class AbstractClass1 {
    public static void main(String[] args) {
        DateCalculator dateCalculator = new DateCalculator();

        // Test NextDate function
        String nextDate = dateCalculator.NextDate(28, 2, 2024); // Leap year example
        System.out.println("Next Date: " + nextDate);
  
        // Test LeapYear function
        boolean isLeap = dateCalculator.LeapYear(2024);
        System.out.println("Is Leap Year: " + isLeap);
    }
}

    

