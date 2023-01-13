package oneday11.Demo2;

public class Demo2Son extends Demo2Father {
    int num = 20;
    int age = 16;
    @Override
    public void shownum(){
        System.out.println(num);
    }


    @Override
    public void methodMulti(){
        System.out.println("子类方法");
    }

}
