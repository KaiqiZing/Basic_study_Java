package oneday16.Demo2;

import java.util.Objects;

public class CustomMapDemo {

    private String name;
    private int age;

    public CustomMapDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public CustomMapDemo() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomMapDemo that = (CustomMapDemo) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


    @Override
    public String toString() {
        return "CustomMapDemo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
