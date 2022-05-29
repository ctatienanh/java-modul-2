import java.util.Random;
import java.util.Scanner;

public class Taoham100 {
    Scanner sc = new Scanner(System.in);

    public Integer[] songuyen() {
        Random rd = new Random();
         Integer[] arr = new Integer[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }

    public void kiemtraphantu() {
        Taoham100 sn = new Taoham100();
        Integer[] arr = sn.songuyen();
        System.out.println("Nhap vao mot tri so bat ki de kiem tra gia tri");
        int x = Integer.parseInt(sc.nextLine());
        try {
            System.out.println("gia tri cua phan tu :" + x + " la :" + arr[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("khong tim thay gia tri phan tu ban vua nhap");
        }
    }


    public static void main(String[] args) {
        Taoham100 s = new Taoham100();
        while (true) {
            s.kiemtraphantu();
        }
    }
}
