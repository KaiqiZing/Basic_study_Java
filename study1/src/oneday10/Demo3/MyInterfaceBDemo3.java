package oneday10.Demo3;

public interface MyInterfaceBDemo3 {

    public abstract void methodB();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("默认方法BBB");
    }


}
