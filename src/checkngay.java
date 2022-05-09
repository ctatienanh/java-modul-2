import java.util.Scanner;

public class checkngay {
    public static void main(String[] args) {
        System.out.println("nhap thang can kiem tra");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        String day;
        switch (month){
            case 2:
                day = "28 - 29";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                day = "30-31";
                break;
            default:
                day="";
        }
        if (day != ""){
            System.out.printf("thang %d co %s ngay",month , day);
        }
        else {
            System.out.println("khog tim duoc ngay cho thang vua nhap");
        }


    }
}
