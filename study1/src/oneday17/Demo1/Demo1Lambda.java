package oneday17.Demo1;
/*
    Lambda表达式的标准格式:
        由三部分组成:
            a.一些参数
            b.一个箭头
            c.一段代码
        格式:
            (参数列表) -> {一些重写方法的代码};
        解释说明格式:
            ():接口中抽象方法的参数列表,没有参数,就空着;有参数就写出参数,多个参数使用逗号分隔
            ->:传递的意思,把参数传递给方法体{}
            {}:重写接口的抽象方法的方法体
 */
public class Demo1Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新线程1被创建了");

            }
        }).start();

        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"线线程1被创建了");

        }).start();

        new Thread(()->System.out.println(Thread.currentThread().getName()+"新线程3被创建了")).start();
    }
}
