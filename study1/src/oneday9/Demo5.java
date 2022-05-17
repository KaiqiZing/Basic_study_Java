package oneday9;
/*
* 继承关系中，父子类构造方法访问的特点：
* 1.子类构造方法当中有一个默认的隐含的"super()调用，所以一定是先调用父类构造，然后执行子类的构造；
* 2、子类构造可通过super关键字调用父类重载构造；
* 3、super父类构造调用，必须是子类构造方法的第一个语句，不能一个子类构造调用多次super构造；
* super and this 不能同时使用；
* 总结：子类必须调用父类构造方法。不写则赠送super()；写了则使用指定的super调用，super调用有且只有一个且必须是第一个；
* "*/
public class Demo5 {
    public static void main(String[] args) {
        Demo5_Son son = new Demo5_Son();
//        son.method_son();
//        son.method();
        son.method_father();
        son.shownum();
        son.methodB();

    }
}
