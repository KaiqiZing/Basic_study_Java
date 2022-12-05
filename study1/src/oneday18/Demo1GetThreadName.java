package oneday18;
/*
    线程的名称:
        主线程: main
        新线程: Thread-0,Thread-1,Thread-2
 */
public class Demo1GetThreadName {
    public static void main(String[] args) {
        //创建线程类子对象
        Demo1MyThread  mt = new Demo1MyThread();
        mt.start();

        new Demo1MyThread().start();
        System.out.println("当前正在执行的线程对象的引用："+ Thread.currentThread().getName());

    }
}
