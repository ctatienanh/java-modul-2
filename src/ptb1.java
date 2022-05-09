import java.util.Scanner;

public class ptb1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap a");
        double a = scanner.nextDouble();
        System.out.println("nhap b");
        double b = scanner.nextDouble();
        System.out.println("nhap c");
        double c = scanner.nextDouble();
        if (a!=0){
            double answer = (c-b)/a;
            System.out.println("ket qua phep tinh: " +answer);
        }
        else {
            if (b==c){
                System.out.println("phuong trinh vo so nghiem");
            }
            else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
}
