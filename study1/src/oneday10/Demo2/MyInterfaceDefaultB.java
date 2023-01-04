package oneday10.Demo2;

public class MyInterfaceDefaultB implements MyInterfaceDefault{
    @Override
    public void Demo2MethodAbstract() {
        System.out.println("实现抽象方法B");
    }

    @Override
    public void Demo2MethodDefault() {
        System.out.println("实现类B覆盖覆盖重写了接口的默认方法");


    }
}
