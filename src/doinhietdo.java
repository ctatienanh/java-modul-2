import java.util.Scanner;

public class doinhietdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celcius;
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("Enter you choice: ");
            choice = sc.nextInt();
        } while (choice != 3 && choice > 2);
        switch (choice){
            case 1:
                System.out.println("Eneter fahrenheit :");
                fahrenheit = sc.nextDouble();
                System.out.println("fahrenheit to celcius la : " + FahrenheiTotcelsius(fahrenheit));
                break;
            case 2:
                System.out.println("Eneter celesius :");
                celcius = sc.nextDouble();
                System.out.println("Celsius to Fahrenheit :" + celsiusToFahrenheit(celcius));
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
    public static double FahrenheiTotcelsius(double fahrenheit)
    {
        double celsius = (5.0/9)*(fahrenheit -32);
        return celsius;
    }
    public static double celsiusToFahrenheit(double celsius){
        double Fahrenheit = (celsius +32) / (5.0*9);
        return Fahrenheit;
    }


}
