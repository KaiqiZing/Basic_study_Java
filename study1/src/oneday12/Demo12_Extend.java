package oneday12;

public class Demo12_Extend {

    public static void main(String[] args) {
//        父类类型 变量名 = new 子类对象； 变量名.方法名();

//        Demo12_Father son = new Demo12_Son();
//        son.eat();
//
//        Demo12_Father secondson = new Demo12_SecondSon();
//        secondson.eat();

        Demo12_Son son  = new Demo12_Son();
//        showDemo12_Father(son);

        Demo12_SecondSon  secondSon = new Demo12_SecondSon();
//        showDemo12_Father(secondSon);



        // 向下转型 格式：子类类型 变量名 = (子类类型) 父类变量名;
        // 解决多态中不能调用子类存在但父类不存在的方法；
        Demo12_Father son2 = new Demo12_Son();
        Demo12_Son son1 = (Demo12_Son) son2;
        son1.testdown();

        Demo12_SecondSon son3 = (Demo12_SecondSon) son2;
       son3.testsecond();
        // 向下转型容易出现的问题：// 转型异常，即调用的方法不是创建对象的方法，造成转型异常，可以使用instanceof关键字来做校验



         // Demo12_Son , Demo12_SecondSon
        if (son2 instanceof Demo12_Son){
            Demo12_Son demo12son = (Demo12_Son) son2;
            demo12son.testdown();
        } else if (son2 instanceof Demo12_SecondSon) {
            Demo12_SecondSon secondson = (Demo12_SecondSon) son2;
            secondson.testsecond();

        }

    }


    /*
    Demo12_Father是父类类型，父类类型接收子类独享，当然可以把子类对象传递给方法；
    多态有规定执行的子类重写的方法，故showDemo12_Father,在接收到子类对象时直接调用子类的重写方法
     */
    public static void showDemo12_Father(Demo12_Father a){
        a.eat();
    }

}
