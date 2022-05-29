package Debug;

import java.util.Scanner;

public class LinearEquationResolver{

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");



        System.out.print("a: ");
        double a = nhap();

        System.out.print("b: ");
        double b = nhap();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
    public static int nhap() {
        while (true) {
            try {
                System.out.println("nhap so nguyen");
                int a = Integer.parseInt(sc.nextLine());
                if (a < 0){
                    throw new Loi();
                }
                else return a;
            }
            catch (NumberFormatException e){
                System.out.println("nhap lai");
            }
            catch (Loi e) {
                System.out.println(e.getMessage());
            }

        }
    }


}
