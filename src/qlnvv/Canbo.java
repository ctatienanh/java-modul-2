package qlnvv;

import java.text.SimpleDateFormat;
import java.sql.Date;

public class Canbo {
    private  String name;
    private  Date ngaysinh;
    private String gioitinh;
    private String diachi;

    public Canbo() {
    }

    public Canbo(String name, Date ngaysinh, String gioitinh, String diachi) {
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.diachi = diachi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "Canbo{" +
                "name= " + name  +
                ", ngaysinh=" + ngaysinh +
                ", gioitinh=" + gioitinh  +
                ", diachi=" + diachi  ;
    }
}
