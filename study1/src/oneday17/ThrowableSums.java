package oneday17;

public class ThrowableSums {
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04() throws Exception {}
}

class sonclass extends ThrowableSums{
    // 子类重写父类方法时，抛出和父类相同的异常
    public void show01() throws NullPointerException, ClassCastException{}
    // 子类重写父类方法时，抛出父类异常的子类
    public void show02() throws  ArrayIndexOutOfBoundsException{}

    // 子类重写父类方法时不抛出异常
    public void show03(){}

    // 子类产生异常，父类无异常，只能捕获处理，不能声明抛出！！！ 捕获用try catch

    public void show04(){
        try {
            throw new Exception("编译器异常");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
