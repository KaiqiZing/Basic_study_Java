package oneday10;

public interface Demo1Father {
    public abstract void eat();
    public abstract void sleep();

    public  default void default_method(){
        System.out.println("默认方法可以继承，可以重写，二选一");
    }

    //静态与.class 文件相关，只能使用接口名调用，不可以通过实现类的类名或者实现类的对象调用
    public static void method(){
        System.out.print("这是interface的静态方法！！！只能接口调用，不能通过类对象调用");

    }


}
