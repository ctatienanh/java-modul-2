import java.util.Scanner;

public class timmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int array [];
        do {
            System.out.println("nhap do dai cua mang");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("nhap lai, do dai toi da cua mang la 20");
            }
        }while (size > 20);
        array = new int[size];
        int i=0;
        while (i < array.length){
            System.out.println("nhap gia tri cua o nho thu " +(i+1));
            array[i] = sc.nextInt();
            i++;
        }
        int index = minValue(array);
        System.out.println("so nho nhat trong mang vua nhap la :" + array[index]);

    }

    public static int minValue( int [] array){
        int index =0;
        for (int i=0; i< array.length; i++){
            if (array[index] > array[i]){
                index = i;
            }
        }
        return index;
    }
}
