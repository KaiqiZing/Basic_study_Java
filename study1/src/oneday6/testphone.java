package oneday6;

public class testphone {
    public static void main(String[] args) {
        phone p = new phone();

        // output 成员变量
        System.out.println("品牌"+p.brand);
        System.out.println("price"+p.price);
        System.out.println("color"+p.color);
        System.out.println("========================");

        //成员变量赋值；
        p.brand = "华为测试品牌";
        p.price = 13999;
        p.color = "red";
        System.out.println("品牌:"+p.brand);
        System.out.println("price:"+p.price);
        System.out.println("color:"+p.color);
        System.out.println("========================");

        // 调用成员方法
        p.call("测试1");
        p.message();

    }
}
