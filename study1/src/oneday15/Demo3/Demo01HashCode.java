package oneday15.Demo3;
/*
    哈希值:是一个十进制的整数,由系统随机给出(就是对象的地址值,是一个逻辑地址,是模拟出来得到地址,不是数据实际存储的物理地址)
    在Object类有一个方法,可以获取对象的哈希值
    int hashCode() 返回该对象的哈希码值。
    hashCode方法的源码:
        public native int hashCode();
        native:代表该方法调用的是本地操作系统的方法
 */
public class Demo01HashCode {
    public static void main(String[] args) {
        //Person类继承了Object类,所以可以使用Object类的hashCode方法
        Person p1 =  new Person();
        System.out.println(p1.hashCode());
        System.out.println(p1);

        Person p2 =  new Person();
        System.out.println(p2.hashCode());
        System.out.println(p2);
        System.out.println(p1==p2);//false

    }


}
