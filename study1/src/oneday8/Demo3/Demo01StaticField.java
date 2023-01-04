package oneday8.Demo3;
/*
* 如果一个成员变量使用了static关键字，那么这个变量不再属于对象自己，而是属于所在的类。多个对象共享同一份数据。
* */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("你好", 14  );
        Student two = new Student("世界", 18);
        System.out.println(one.getName()+ one.getAge()+one.getId());
        System.out.println(two.getName()+ two.getAge()+two.getId());

    }
}
