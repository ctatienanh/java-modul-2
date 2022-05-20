package qlnvv;
import java.sql.Date;
import java.util.Scanner;

public class QLCB {
    Canbo canbos [] = new Canbo[0];


    Scanner sc= new Scanner(System.in);
    public  QLCB(){

    }

    public void menu() {
        System.out.println("===Menu===");
        System.out.println("1:nhap thong tin can bo");
        System.out.println("2:Tim kiem ho ten");
        System.out.println("3:hien thi ");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
              add(khoitaocanbo());
                break;
            case 2:
                System.out.println("nhap ten can bo can tim");
                String name = sc.nextLine();
                timkiem(name);
                break;
            case 3:
                for (Canbo cb:canbos) {
                    System.out.println(cb);
                }
                break;
        }
    }

    public Canbo khoitaocanbo( )  {
        System.out.println("nhap ten :");
        String name = sc.nextLine();
        System.out.println("nhap ngay sinh:");
        int ngaysinh=Integer.parseInt(sc.nextLine());
        System.out.println("nhap thang sinh:");
        int thang = Integer.parseInt(sc.nextLine());
        System.out.println("nhap nam sinh:");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.println("nhap gioi tinh");
        String gioitinh = sc.nextLine();
        System.out.println("nhap dia chi");
        String diachi = sc.nextLine();
        System.out.println("nhap thong tin chuc vu");
        System.out.println("1: cong nhan");
        System.out.println("2: nhan vien");
        System.out.println("3: ky su");
        int choices =Integer.parseInt(sc.nextLine());
        if (choices==1) {
            System.out.println("nhap cap bac : ");
            String capbac = sc.nextLine();
            return new Congnhan(name, new Date( nam-1900,thang-1, ngaysinh ), gioitinh, diachi, capbac);
        }
        else if (choices ==2) {
            System.out.println("nhap cong viec :");
            String congviec = sc.nextLine();
            return new Nhanvien(name, new Date( nam-1900,thang-1,ngaysinh ), gioitinh, diachi, congviec);
        }
        else {
                System.out.println("nhap nganh dao tao :");
                String nganh = sc.nextLine();
                return new Kysu(name,new Date( nam-1900,thang-1,ngaysinh ),gioitinh,diachi,nganh);
        }
    }

    public void add(Canbo canbo){
        Canbo[] newcanbo = new Canbo[canbos.length+1];
        for (int i=0; i < canbos.length; i++){
            newcanbo[i] = canbos[i];
        }
        newcanbo[newcanbo.length-1] = canbo;
        canbos = newcanbo;
    }
    public void timkiem(String name){
        for (int i = 0; i < canbos.length; i++) {
            if (canbos[i].getName().equals(name)){
                System.out.println(canbos[i]);
            }
        }
    }
}
