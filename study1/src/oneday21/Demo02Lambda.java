package oneday21;

public class Demo02Lambda {

    public static void showlog(int level, MessageBuilder mb){
        if (level==1){
            System.out.println(mb.builderMessage());
        }
    }



    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showlog(1,()->{
            System.out.println("不满足条件不执行");
            //返回一个拼接好的字符串
            return  msg1+msg2+msg3;
        });


    }
}
