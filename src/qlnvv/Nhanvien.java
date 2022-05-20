package qlnvv;

import java.text.SimpleDateFormat;
import java.sql.Date;

public class Nhanvien extends Canbo {
    private String congviec;

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    public Nhanvien() {
    }

    public Nhanvien( String name, Date ngaysinh, String gioitinh, String diachi,String congviec) {
        super( name, ngaysinh, gioitinh, diachi);
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +super.toString()+
                "congviec=" + congviec +
                '}';
    }
}
