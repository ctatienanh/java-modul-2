import java.util.Scanner;

public class nhappt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr [] = {1,2,3,4};
        System.out.println("nhap phan tu x muon them: ");
        int x = sc.nextInt();
        int index;

        do {
            System.out.println("nhap vi tri can chen vao: ");
            index = sc.nextInt();
            if (index > arr.length-1 && index < -1){
                System.out.println("nhap lai vi tri");
            }
        }while (index > arr.length-1 && index < -1  );
        int []newarray  = new int[5];

        for (int i =0; i < arr.length; i++){

            if (index >i){
                newarray[i] = arr[i];
            }
            else newarray[i+1]=arr[i];
            }
        newarray[index]=x;
        System.out.println("mang sau khi them phan tu:");
        for (int j=0; j< newarray.length; j++) {
            System.out.print(newarray[j] + " ");
        }
    }
}
