import java.util.Scanner;

public class Tamgiac {
    public static void tamgiaccread(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap canh a :");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap canh b :");
            int b = Integer.parseInt(sc.nextLine());
            System.out.println("Nhap canh c :");
            int c = Integer.parseInt(sc.nextLine());
            if (a + b > c || b + c > a || a + c > b) {
                throw new error();
            }else System.out.println("tam giac hop le");
        } catch (error e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("loi roi ");
        }
    }

    public static void main(String[] args) {
        while (true){
            tamgiaccread();
        }
    }


}
