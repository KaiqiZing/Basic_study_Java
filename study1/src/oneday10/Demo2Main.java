package oneday10;

public class Demo2Main {

    public static void main(String[] args) {
//        Animal animal = new Animal(); // 错误！

//        Dog dog = new Dog(); // 错误，这也是抽象类

        Demo2_Dog2Ha ha = new Demo2_Dog2Ha(); // 这是普通类，可以直接new对象。
        ha.eat();
        ha.sleep();
        System.out.println("==========");

        Demo2_DogGolden golden = new Demo2_DogGolden();
        golden.eat();
        golden.sleep();
    }


}
