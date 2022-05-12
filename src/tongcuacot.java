import java.util.Scanner;

public class tongcuacot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hang;
        int cot;
        do{
            System.out.println("nhap so hang trong mang :");
            hang = sc.nextInt();
            System.out.println("nha so cot trong mang :");
            cot = sc.nextInt();
        }while (hang <=0 && cot <=0);
        int array [][] = new int [hang][cot];
    for (int i=0; i<hang; i++){
        for (int j=0;j<cot;j++){
            System.out.println("nhap phan tu hang" +i +"cot" +j +":");
            array[i][j] = sc.nextInt();
        }
    }
        System.out.println("nhap cot muon tinh tong :");
   int x = sc.nextInt();
   int sum =0;
   for (int i=0; i< array.length; i++){
       sum += array[i][x];
   }
        System.out.println("tong cua cot :" +sum);
    }
}
