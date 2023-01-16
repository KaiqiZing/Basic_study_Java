package oneday21.Demo3;

public class Demo01Runnable {

    public static void startThread(Runnable run){
        new Thread(run).start(); // 开启多线程；

    }

    public static void main(String[] args) {
        // 调用方法，方法参数是一个接口，接口就能传递匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"thread start!!!");
            }
        });

        startThread(()-> System.out.println(Thread.currentThread().getName()+"thread startThread!!!"));


    }

}
