package oneday6;

public class phone {

    //成员变量
    String brand;
    int price;
    String color;

    public void call(String name){
        System.out.println("给哪位打电话呢："+name);

    }

    public void message(){
        System.out.println("群发短信");
    }
}
