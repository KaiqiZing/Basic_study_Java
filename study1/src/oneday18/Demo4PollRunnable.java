package oneday18;

import static java.lang.Thread.sleep;

public class Demo4PollRunnable implements Runnable{
 @Override
    public void run(){
     System.out.println("开启线程池");
     try {
         Thread.sleep(10);
     } catch (InterruptedException e) {
         throw new RuntimeException(e);
     }
     System.out.println(Thread.currentThread().getName()+"创建了一个新的线程执行！！！！");
 }
}
