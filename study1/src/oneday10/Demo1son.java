package oneday10;

public class Demo1son implements Demo1Father{

    // 必须重“接口”的抽象方法
    @Override
    public void eat() {
        System.out.println("eat anything");

    }

    @Override
    public void sleep() {
        System.out.println("sleep all day1");

    }

/*    @Override
    public void default_method(){
        System.out.println("重写父类默认方法");
    }*/

    public static void main(String[] args) {
        Demo1son son1 = new Demo1son();
        son1.sleep();
    }
}
