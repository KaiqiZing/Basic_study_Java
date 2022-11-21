package oneday9.demo2;

public class Demo1Son extends Demo1Father {
    int numSon = 20;
    int num = 200;

    public void methodSon(){
        // 本类当中
        int num = 300;
        System.out.println("局部变量:"+ num);
        System.out.println("本类成员变量:"+this.num);
        System.out.println("父类成员变量："+super.num);

    }

}
