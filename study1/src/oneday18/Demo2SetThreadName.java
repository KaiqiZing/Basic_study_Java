package oneday18;

public class Demo2SetThreadName {
    public static void main(String[] args) {
        Demo2MyThread mt = new Demo2MyThread();
        mt.setName("小强");
        mt.start();
        new Demo2MyThread("hello").start();

    }
}
