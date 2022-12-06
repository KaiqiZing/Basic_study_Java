package oneday10;

public interface Demo2InterfaceB {

    public abstract void methodB();
    public abstract void methodtest();

    public default void methoddefaultB(){

    }
    public default void methoddefault(){
        System.out.println("这是interface b的默认方法");

    }

    public static void runB(){
        System.out.println("interface B的静态方法");
    }

    public static void runtest(){
        System.out.println("interface B的静态方法runtest");
    }
}
