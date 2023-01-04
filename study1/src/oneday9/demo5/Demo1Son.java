package oneday9.demo5;
/*
* this关键字的用法：
* 1.在奔雷成员方法总访问本类成员变量
* 2.在本类的成员方法中，访问本类的另一个成员方法
* 3.在本来都构造方法中，访问本类的另一个构造方法
* */
public class Demo1Son extends Demo1Father {

    int num = 200;
    public Demo1Son(){

     this(1);
    }

    public Demo1Son(int n ){

    }

    public Demo1Son(int n , int m){

    }
    public void showNum() {
        int num = 10;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);

    }

    public void methodA() {
        System.out.println("AAA");
    }


    public void methodB(){
        this.method();
        System.out.println("BBB");
    }

    public void method(){
        method();
        super.method();
    }

}
