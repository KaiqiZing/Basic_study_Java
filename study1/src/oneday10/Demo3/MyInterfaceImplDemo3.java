package oneday10.Demo3;

public class MyInterfaceImplDemo3 implements MyInterfaceADemo3, MyInterfaceBDemo3{
    @Override
    public void methodA() {
        System.out.println("覆盖重写A方法");

    }
    @Override
    public void methodB(){
        System.out.println("覆盖重写B方法");

    }

    @Override
    public void methodAbs() {
        System.out.println("覆盖重写AB接口都有的抽象方法");

    }

    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行覆盖重写！！！");

    }
}
