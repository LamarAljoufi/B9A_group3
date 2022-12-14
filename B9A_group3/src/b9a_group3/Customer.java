package b9a_group3;

public class Customer {

    private String name;
    private String phone;
    private int age;

    public int getAge() {
        return age;
    }

    public Customer(String name, String phone,int age) {
        this.name = name;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean ageIsLegal(int age) {
        return age <= 18;
    }
}
