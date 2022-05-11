import java.util.Scanner;

public class daonguoc {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("nhap size cua mang :");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("nhap lai size khong vuot qua 20");
            }
        }
        while (size >20);
        array = new int[size];
        int i=0;
        while ( i < array.length){
            System.out.println("nhap phan tu thu" + i+1 +":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println("mang vua nhap :");
        for (int j=0; j< array.length; j++){
            System.out.print(array[j] + " ,");
        }
       for(int j=0; j< array.length/2; j++){
           int a = array[j];
           array[j]=array[size -1 -j];
           array[size -1 -j] = a;
       }
        System.out.println("\t");
        System.out.println("mang sau khi dao nguoc :");
       for (int j=0; j < array.length; j++){
           System.out.print(array[j] + " ,");
       }
    }
}
