import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, night, special, rate;
        double degrees;
        Scanner scanner = new Scanner(System.in);
        DegreeConverter degreeConverter = new DegreeConverter();

        System.out.print("Enter degrees: ");
        degrees = scanner.nextDouble();
        System.out.println("\nDegrees in Celsius: " + degreeConverter.toCelsius(degrees));

        System.out.print("Enter rate: ");
        rate = scanner.nextInt();
        System.out.print("\nEnter day: ");
        day = scanner.nextInt();
        System.out.print("\nEnter night: ");
        night = scanner.nextInt();
        System.out.print("\nEnter special: ");
        special = scanner.nextInt();

        SalaryCalculator salaryCalculator = new SalaryCalculator(day, night, special, rate);
        System.out.println("\nYour salary is: " + salaryCalculator.calculateSalary());
    }
}
