package oneday21;

public class Demo1 {
    // 定义一个方法，参数使用函数式接口MyfunctionInter

    public static void show(MyfunctionInter myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        // 调用show方法方法参数是一个接口，所以可以传递接口的实现类对象
        show(new MyfunctionInterImpl());

        // 传递匿名内部类
        show(new MyfunctionInter() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类中的抽象方法");
            }
        });


        show(()->{
            System.out.println("使用lambda表达式重写接口中的抽象方法");
        });


        show(()->
            System.out.println("使用lambda表达式重写接口中的抽象方法， 简化写法"));
    }
}
