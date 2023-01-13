package oneday10.Demo3;

public interface MyInterfaceADemo3 {

    public abstract void methodA();

    public abstract void methodAbs();

    public default void methodDefault() {
        System.out.println("默认方法AAA");
    }

}
