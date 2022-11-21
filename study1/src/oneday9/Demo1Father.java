package oneday9;

public class Demo1Father {

    int numFather = 10;
    int num = 100;

    public  void methodFather(){
        // 使用本类当中的，不会向下找子类的
        System.out.println("father value:"+num);
    }

}
