package Qlnv;

public class Parttime extends  Nhanvien{
    private int numbertime;

    public Parttime() {
    }

    public Parttime(int id, String name, int age, int number) {
        super(id, name, age);
        this.numbertime = number;
    }

    public int getNumbertime() {
        return numbertime;
    }

    public void setNumbertime(int numbertime) {
        this.numbertime = numbertime;
    }
}
