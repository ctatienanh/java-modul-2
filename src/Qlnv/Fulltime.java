package Qlnv;

public class Fulltime extends Nhanvien {
    private int heso;

    public Fulltime() {
    }

    public Fulltime(int id, String name, int age, int heso) {
        super(id, name, age);
        this.heso = heso;
    }

    public int getHeso() {
        return heso;
    }

    public void setHeso(int heso) {
        this.heso = heso;
    }
}
