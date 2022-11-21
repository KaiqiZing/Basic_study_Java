package oneday9;

/*
* 在父类和子类继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式
* 1.直接通过子类访问成员变量==等号左边是谁就优先用谁，没有则向上找；
* 2.间接通过成员方法访问成员变量
*  */

public class Demo1Extends {

    public static void main(String[] args) {
        Demo1Father father = new Demo1Father();
        System.out.println(father.numFather);
        System.out.println("++++++");


        Demo1Son son = new Demo1Son();
        System.out.println(son.numSon);
        System.out.println("++++++++");

        // 等号左边是谁就优先使用谁
        System.out.println(son.num);
        // System.out.println(son.abv);


        //间接方法访问
        son.methodSon();
        son.methodFather();


    }
}
