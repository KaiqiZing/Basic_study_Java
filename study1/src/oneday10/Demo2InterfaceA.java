package oneday10;

public interface Demo2InterfaceA {
    public abstract void methodA();
    public abstract void methodtest();


    public default void methoddefaultA(){

    }

    public default void methoddefault(){
        System.out.println("这是interface A的默认方法");
    }

    public static void runA(){
        System.out.println("interface A的静态方法");
    }

    public static void runtest(){
        System.out.println("interface A的静态方法runtest");
    }
}
