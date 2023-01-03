package oneday12.Demo1;

/*
* 成员变量：
*   1.如果使用final关键字修改，那么成员变量也是不可变的；
*   2.对于final的成员变量，要么执行赋值，要么通过构造方法赋值，二者只能选择其一；
*   3.必须保证类当中所有重载的构造方法，都最终会对final的成员变量进行赋值；
*
* */

public class FinalPersonVariable {

    private final String name;
    public FinalPersonVariable(){
        name="final类构造方法";
    }
    public FinalPersonVariable(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
