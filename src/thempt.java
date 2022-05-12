import java.util.Scanner;

public class thempt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int size1;
        int size;
        int array [];
        int array1 [];
        do {
            System.out.println("nhap so phan tu cua mang 1: ");
            size = sc.nextInt();
            System.out.println("nhap so phan tu cua mang 2: ");
            size1 = sc.nextInt();
        }while (size <= 0 && size1 <=0);
        int i=0;
        int j=0;
        array= new int[size];
        array1 = new int[size1];
        while (i<size){
            System.out.println("nhap phan tu " +(i+1) +" :");
            array[i] = sc.nextInt();
            i++;
        }
        while (j<size1){
            System.out.println("nhap phan tu " +(j+1) + " :");
            array1[j] = sc.nextInt();
            j++;
        }
        int x = size + size1;
        System.out.println("mang sau khi noi :");
        for (int t=0; t <x; t++){
            System.out.print(concat(x,array,array1)[t] + " ");
        }
    }
    public  static int [] concat(int x , int arr1[], int arr2[]){
        int arr3 [] = new int[x];
        int j = arr1.length;
        for (int i=0; i < arr1.length; i++ ){
            arr3[i] = arr1[i];
        }
        for (int i=0; i< arr2.length; i++){
            arr3[j] = arr2[i];
            j++;
        }
        return arr3;
    }
}
