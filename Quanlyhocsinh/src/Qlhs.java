import java.util.ArrayList;
import java.sql.Date;
import java.util.Scanner;

public class Qlhs {
    ArrayList<Thongtin> array = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void menu (){
        System.out.println("===Menu===");
        System.out.println("1:nhap thong tin hoc sinh");
        System.out.println("2:hien thi thong tinh hoc sinh");
        System.out.println("3:hien thi sinh vien sinh nam 1985 va que o thai nguyen ");
        System.out.println("4:hien thi man hinh hoc sinh lop 10A1");
        switch (nhapmenu()){
            case 1:
                add(creat());
                break;
            case 2:
                show();
                break;
            case 3:
                check1985();
                break;
            case 4:
                check10A1();
                break;

        }
    }
    public Thongtin creat (){
        System.out.println("Nhap ten hoc sinh :");
        String name = sc.nextLine();
        System.out.println("Nhap ngay sinh :");
        int ngay = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap thang sinh :");
        int thang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap nam sinh :");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap que quan");
        String quequan = sc.nextLine();
        System.out.println("Nhap lop :");
        String lop = sc.nextLine();
        System.out.println("Nhap khoa hoc :");
        String khoahoc = sc.nextLine();
        System.out.println("Nhap ky hoc :");
        String kyhoc = sc.nextLine();
        return new Thongtin(name, new Date(nam -1900, thang -1, ngay), quequan, lop, khoahoc, kyhoc );

    }
    public void add(Thongtin s){
        array.add(s);
    }

    public void show(){
        for (Thongtin x:array) {
            System.out.println(x);
        }
    }
    public void check1985(){
        for (int i = 0; i < array.size(); i++) {
            if ( array.get(i).getQuequan().equals("ThaiNguyen") && array.get(i).getNgaysinh().getYear()==85){
                System.out.println(array.get(i));
            }
        }
    }

    public int nhapmenu(){
        int count =0;
        while (true) {
            try {

                int a = Integer.parseInt(sc.nextLine());
                if (a <= 0 || a > 4) {
                    throw new Error();
                } else
                    return a;
            }
            catch (Error e) {
                System.out.println(e.getMessage());
                count++;
            }
            catch (NumberFormatException e){
                System.out.println("nhap lai lua chon tu 1 toi 4 ");
                count++;
            }
            finally {
                if (count ==4){
                    System.out.println("nhap sai qua nhieu ");
                    System.exit(0);

                }
            }
        }
    }


    public void check10A1(){
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getLop().equals("10A1")){
                System.out.println(array.get(i));
            }
        }
    }

}
