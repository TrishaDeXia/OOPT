import java.util.Scanner;

public class T2Q2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year:");
        int year = sc.nextInt();

        if(isLeapYear(year)){
            System.out.println(year + " is a leap year");
        } 
        else {
            System.out.println(year + " is not a leap year");
            sc.close();
        }
    }

    public static boolean isLeapYear(int year) {
        final int GREGORIAN_CALENDER_LEAP_YEAR = 1582;
        boolean beforeGregorian = year < GREGORIAN_CALENDER_LEAP_YEAR;

        return year % 4 == 0 && (beforeGregorian || !(year % 100 == 0) || year % 400 == 0);
    }
}
