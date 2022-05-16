import java.util.Date;

public class Product {
    private  String address;
    private String age;
    private  String name;

    public Product(String addname, String addage, String addaddress) {
        this.name = addname;
        this.age = addage;
        this.address = addaddress;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
