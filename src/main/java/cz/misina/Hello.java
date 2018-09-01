package cz.misina;

public class Hello {
    private final String name;
    private int age;

    public Hello(String name) {
        this.name = name;
    }

    public Hello() {
        this.name = "Unknown";
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
