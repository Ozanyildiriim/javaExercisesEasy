import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
//        String usersDateOfBirth = "1999";
//
//        int dateOfBirth = Integer.parseInt(usersDateOfBirth);
//
//        System.out.println("Age = "+ (currentYear-dateOfBirth));
//
//
//        String usersAgeWithPartialYear = "22.5";
//        double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
//
//        System.out.println("Users age is "+ageWithPartialYear);
        try {
            System.out.println(getInputFromConsole(currentYear));
        }catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }


    }

    public static String getInputFromConsole(int currentYear) {

        String name = System.console().readLine("Hi whats your name? ");
        System.out.println("Hi "+name+ ", thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);


        return "Your age "+age+"years";
    }

    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi whats your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi "+name+ ", thanks for taking the course!");

        System.out.println("What year were you born? ");
        String dateOfBirth = scanner.nextLine();

        int age = currentYear - Integer.parseInt(dateOfBirth);


        return "Your age is "+age;
    }

}
