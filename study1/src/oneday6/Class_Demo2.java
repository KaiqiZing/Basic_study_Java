package oneday6;
/*
封装

1.使用private关键字来修饰成员变量
2.对需要访问的成员变量，提供对应的一对get set 方法；
3. private是一个权限修饰符，代表最小权限；被其修饰后的成员变量和成员方法，只在本类中才能访问；
private使用格式" private 数据类型 变量名；

this--代表所在类的当前对象的引用（地址值），既谁在调用，this就代表谁；
因为成员变量名称不能与方法中的变量名重名，会导致方法中的变量名无法访问到成员变量，故引入this

JavaBean标准规范
public class ClassName{
    //成员变量
    //构造方法
    //无参构造方法【必须】
    //有参构造方法【建议】
    //成员方法
    //getXxx()
    //setXxx()
}
*/

/*JavaBean标准规范的类*/
public class Class_Demo2 {
    private String name;
    private int age;

    /*构造方法*/
    public Class_Demo2(){}
    public Class_Demo2(String name, int age){
        this.name = name;
        this.age = age;
    }

    /*成员方法*/
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
