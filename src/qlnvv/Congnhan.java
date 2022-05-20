package qlnvv;

import java.text.SimpleDateFormat;
import java.sql.Date;

public class Congnhan extends Canbo {
    private String capbac;

    public String getCapbac() {
        return capbac;
    }

    public void setCapbac(String capbac) {
        this.capbac = capbac;
    }

    public Congnhan() {

    }

    public Congnhan(String name, Date ngaysinh, String gioitinh, String diachi, String capbac) {
        super( name, ngaysinh, gioitinh, diachi);
        this.capbac = capbac;
    }

    @Override
    public String toString() {
        return "Congnhan{" +super.toString()+
                "capbac=" + capbac +"}";
    }
}
