package oneday12.Demo2;

public class Demo02InnerClass {
    // 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();

    public static void main(String[] args) {
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();

    }
}
