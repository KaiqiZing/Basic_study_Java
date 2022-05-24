package oneday10;

// 子类也是一个抽象类
public abstract class Demo2_Dog extends Demo2_Animal {

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    // public abstract void sleep();
}
