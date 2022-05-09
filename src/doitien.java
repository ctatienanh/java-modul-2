import java.util.Scanner;

public class doitien {
    public static void main(String[] args) {
        System.out.println("nhap ti gia usd");
        Scanner sc = new Scanner(System.in);
        int usd = sc.nextInt();
        int vnd = usd*23000;
        System.out.println(vnd);
    }
}
