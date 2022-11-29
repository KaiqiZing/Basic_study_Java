package oneday12;
/*
* 1.匿名内部类，在创建对象时只能使用一次
* 2. 匿名内部类是省略 实现类/子类名称，但是匿名对象时省略了  对象名称
* */
public class Demo12_NonameExtend {

    public static void main(String[] args) {
        Demo12_NoName noname = new Demo12_NoName() {
            @Override
            public void fly() {
                System.out.println("这是匿名内部类");
            }
        };
        noname.fly();

        new Demo12_NoName() {
            @Override
            public void fly() {
                System.out.println("第二种写法");
            }
        }.fly();

    }

}
