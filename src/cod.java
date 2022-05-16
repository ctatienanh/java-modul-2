import java.util.Scanner;

public class cod {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Menu====");
        System.out.println("1:them nhan vien");
        System.out.println("2:sua");
        System.out.println("3:xoa");
        System.out.println("4:exit");
        System.out.println("nhap lua chon cua ban :");
        int click ;
        do {
            click = sc.nextInt();
            switch (click){
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    Delete();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while (click < 4);


    }
    static Product[] array = new Product[2];
    public static void add(){
        Scanner sc = new Scanner(System.in);

            int i=0;
            while ( i < array.length){
                System.out.println("nhap nv :" +(i+1));
                System.out.println("nhap ten :");
                String addname = sc.nextLine();
                System.out.println("nhap tuoi :");
                String addage = sc.nextLine();
                System.out.println("nhap dia chi :");
                String addaddress = sc.nextLine();
                Product a = new Product( addname, addage, addaddress);

                array[i] = a;
                i++;
            }
        show();

    }
    public static void show(){
        System.out.println("danh sach san pham sau khi nhap :");
        for (int i=0; i< array.length; i++){
            System.out.println("nhan vien thu :" + (i+1));
            System.out.println("name :" + array[i].getName());
            System.out.println("age :" +array[i].getAge());
            System.out.println("addaddress :" +array[i].getAddress());

        }
    }

    public static void edit(){
       Scanner sc = new Scanner(System.in);
        System.out.println("nhap vi tri can sua");
        int x = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ten :");
        String addname = sc.nextLine();
        array[x].setName(addname) ;
        System.out.println("nhap tuoi :");
        String addage = sc.nextLine();
        array[x].setAge(addage);
        System.out.println("nhap dia chi :");
        String addaddress = sc.nextLine();
        array[x].setAddress(addaddress);
        show();
    }

    public static void Delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vi tri can xoa :");
        int delete = Integer.parseInt(sc.nextLine());
        Product[] newarr = new Product [array.length-1];
        for (int i=0 ; i< array.length;i++){
            if (delete < i){
                newarr[i] = array[i];
            }
            else {
                newarr[i] = array[i+1];
            }
        }
        array = newarr;
    }


}

