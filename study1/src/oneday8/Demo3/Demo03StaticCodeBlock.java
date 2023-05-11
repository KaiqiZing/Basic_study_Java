package oneday8.Demo3;
/*
*优先加载于main方法，自动出发赋值且只在静态数据初始化时执行
*  */
public class Demo03StaticCodeBlock {
//    public static String name;
//    static {
//        System.out.println("这是静态代码块测试");
//        name = "张三";
//
//    }


    public String name;
    public Demo03StaticCodeBlock(){
        System.out.println("无参构造");
    }
    // 实例代码块，无static修饰，属于对象，每次构造对象时都会被执行
    {
        name = "测试";
        System.out.println("实例代码块执行中");

    }
    public static void main(String[] args) {
        System.out.println("main方法呗执行");
        Demo03StaticCodeBlock demo03StaticCodeBlock = new Demo03StaticCodeBlock();
        System.out.println(demo03StaticCodeBlock.name);

    }
}
