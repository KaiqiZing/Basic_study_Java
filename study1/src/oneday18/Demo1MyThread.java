package oneday18;
/*
* 获取线程名称:getName()
*   1. getName线程的名称
*   2. currentThread(）返回当前正在执行的线程对象引用
* */
public class Demo1MyThread extends Thread{
    @Override
    public void run(){

        String name = getName();
        System.out.println("线程名称："+ name);
//        System.out.println("当前正在执行的线程对象的引用"Thread.currentThread().getName()); // 获取当前执行的线程
    }


}
