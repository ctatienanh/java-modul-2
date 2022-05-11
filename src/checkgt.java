import java.util.Scanner;

public class checkgt {
    public static void main(String[] args) {
        String [] strings = {"a","b","c"};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tu can tim kiem:");
        String name = sc.nextLine();
        boolean check = false;
        for (int i=0; i< strings.length; i++){
            if (strings[i].equals(name)){
                check = true;
                System.out.printf("gia tri %s co trong mang vi tri %d ", strings[i],i+1);
                break;
            }
        }
        if (check == false){
            System.out.printf("gia tri %s khong co trong mang",name);
        }


    }
}
