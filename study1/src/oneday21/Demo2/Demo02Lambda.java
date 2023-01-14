package oneday21.Demo2;

public class Demo02Lambda {

       /*
            使用Lambda表达式作为参数传递,仅仅是把参数传递到showLog方法中
            只有满足条件,日志的等级是1级
                才会调用接口MessageBuilder中的方法builderMessage
                才会进行字符串的拼接
            如果条件不满足,日志的等级不是1级
                那么MessageBuilder接口中的方法builderMessage也不会执行
                所以拼接字符串的代码也不会执行
            所以不会存在性能的浪费

         */

    public static void main(String[] args) {

        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";
        showlog(1,()->{
            System.out.println("不满足条件不执行");
            return msg1+msg2+msg3;
        });

    }
    public static void showlog(int level, MessageBuilder mb){
        if (level==1){
            System.out.println(mb.builderMessage());
        }
    }
}
