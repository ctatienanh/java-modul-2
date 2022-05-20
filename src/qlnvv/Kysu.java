package qlnvv;

import java.text.SimpleDateFormat;
import java.sql.Date;

public class Kysu  extends Canbo{
    private String Nganhdaotao;

    public String getNganhdaotao() {
        return Nganhdaotao;
    }

    public void setNganhdaotao(String nganhdaotao) {
        Nganhdaotao = nganhdaotao;
    }

    public Kysu() {
    }

    public Kysu( String name, Date ngaysinh, String gioitinh, String diachi, String nganhdaotao) {
        super( name, ngaysinh, gioitinh, diachi);
        this.Nganhdaotao = nganhdaotao;
    }

    @Override
    public String toString() {
        return "Kysu{" +super.toString()+
                "Nganhdaotao=" + Nganhdaotao +
                '}';
    }
}
