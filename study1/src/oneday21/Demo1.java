package oneday21;

public class Demo1 {
    public static void show(MyfunctionInter myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyfunctionInterImpl());


        show(new MyfunctionInter() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类中的抽象方法");
            }
        });

    }
}
