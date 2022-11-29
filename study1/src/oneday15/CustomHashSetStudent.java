package oneday15;

import java.util.Objects;

public class CustomHashSetStudent {
    private String name;
    private int age;

    public CustomHashSetStudent(){

    }
    public CustomHashSetStudent(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomHashSetStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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


    // 重写HashCode and equals


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomHashSetStudent that = (CustomHashSetStudent) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
