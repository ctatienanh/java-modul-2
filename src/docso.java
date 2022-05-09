import java.util.Scanner;

public class docso {
    public static void main(String[] args) {
        System.out.println("nhap so can doc");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num - a * 100) / 10;
        int c = (num - a * 100 - b * 10);
        String num1 = "";
        if (a > 0) {
            switch (a) {
                case 1:
                    num1 += "mot tram ";
                    break;
                case 2:
                    num1 += "hai tram ";
                    break;
                case 3:
                    num1 += "ba tram ";
                    break;
                case 4:
                    num1 += "bon tram ";
                    break;
                case 5:
                    num1 += "nam tram ";
                    break;
                case 6:
                    num1 += "sau tram ";
                    break;
                case 7:
                    num1 += "bay tram ";
                    break;
                case 8:
                    num1 += "tam tram ";
                    break;
                case 9:
                    num1 += "chin tram ";
                    break;
            }
        }
        if (b > 0) {
            switch (b) {
                case 1:
                    num1 += "muoi ";
                    break;
                case 2:
                    num1 += "hai muoi ";
                    break;
                case 3:
                    num1 += "ba muoi ";
                    break;
                case 4:
                    num1 += "bon muoi ";
                    break;
                case 5:
                    num1 += "nam muoi ";
                    break;
                case 6:
                    num1 += "sau muoi ";
                    break;
                case 7:
                    num1 += "bay muoi ";
                    break;
                case 8:
                    num1 += "tam muoi ";
                    break;
                case 9:
                    num1 += "chin muoi ";
                    break;
            }
        }
        else {
            num1 += "linh ";
        }

            switch (c) {
                case 1:
                    num1 += "mot";
                    break;
                case 2:
                    num1 += "hai";
                    break;
                case 3:
                    num1 += "ba";
                    break;
                case 4:
                    num1 += "bon";
                    break;
                case 5:
                    num1 += "nam";
                    break;
                case 6:
                    num1 += "sau";
                    break;
                case 7:
                    num1 += "bay";
                    break;
                case 8:
                    num1 += "tam";
                    break;
                case 9:
                    num1 += "chin";
                    break;
            }
        System.out.println(num1);
    }
}