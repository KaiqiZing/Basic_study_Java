package oneday8;

public class StaticBlockTest {
    static {
        System.out.println("静态代码块执行！");
    }

    public  StaticBlockTest(){
        System.out.println("构造方法执行！！");

    }
}
