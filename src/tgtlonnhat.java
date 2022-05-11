import java.util.Scanner;

public class tgtlonnhat {
    public static void main(String[] args) {
        System.out.println("nhap so luong gia tri cua mang :");
        int array [];
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            size = sc.nextInt();
            if (size > 5){
                System.out.println("so luong mang toi da la 5");
            }
        }while (size >5);
        array = new int[size];
        int i=0;
        while (i< array.length){
            System.out.println("nhap phan tu thu :" +(i+1));
            array[i] = sc.nextInt();
            i++;
        }
        int max = array[0];
        for (int j =0; j< array.length ; j++){
            if (max < array[j]){
                max = array[j];
            }
        }
        System.out.println("gia tri max trong mang la :" +max);
    }
}
