package oneday13;


public class Demo1StringBufferandStringBuilder {
    public static void main(String[] args) {
        BuilderTest(); //基本操作

        BuilderTest2();

    }

    private static void BuilderTest(){
        StringBuilder builder_test = new StringBuilder();

        builder_test.append("123");
        builder_test.insert(3,"test");
        System.out.println(builder_test);

        builder_test.delete(7,8);
        System.out.println(builder_test);

        /*链式编程：方法返回值是一个对象，可以继续调用方法*/
        builder_test.append("nihao").append(123).append("test");
        System.out.println("链式编程："+ builder_test);
    }

    private static void BuilderTest2(){
        /*toString操作 String和StringBuilder可以相互转换，
        * 1.String→StringBuilder可以使用StringBuilder构造方法，并初始化为指定字符串内容；
        * 2.StringBuilder→String可以使用StringBuilder中的toString方法，将StringBuilder对象转换为String对象*/

        String stringtest = "stringtest";
        System.out.println("stringtest的数据："+stringtest);
        StringBuilder bu = new StringBuilder(stringtest);
        bu.append("appenddata");
        System.out.println("string到StringBuilder:"+bu);

        String stest = bu.toString();
        System.out.println("StringBuilder转换String:"+stest);
    }

}
