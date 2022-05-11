import java.util.Scanner;

public class snt {
    public static void main(String[] args) {
        System.out.println("nhap so can kiem tra");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 2){
            System.out.println("khong phai so nguyen to");
        }
        else {
            boolean check = true;
            for (int i=2; i < Math.sqrt(number); i++){
                if ( number %i==0){
                    check = false;
                    break;
                }
            }
            if (check){
                System.out.printf("so %d la so nguyen to", number);
            }
            else {
                System.out.printf("so %d khong phai so nguyen to", number);
            }
        }

    }
}
