import java.util.Scanner;

public class Maytinh {
    public static void maytinhcread ( int x , int y){
        try {

            int a = x+y;
            int b = x-y;
            int c = x*y;
            int d = x/y;
           if (x ==0 ){
               throw new error();
           }else {
               System.out.println("Tong cua x va y :" +a);
               System.out.println("Hieu cua x va y :" +b);
               System.out.println("Tich cua x va y :" +c);
               System.out.println("Thuong cua x va y :" +d);
           }

        }catch (error e) {
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("khong co phep chia cho khong");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x :");
        int x = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap y :");
        int y = Integer.parseInt(sc.nextLine());
        maytinhcread(x,y);
    }
}
