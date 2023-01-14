package oneday21.Demo2;

public class Demo01Logger {
    public static void main(String[] args) {
        //定义三个日志信息
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";
        showlog(1,msg1+msg2+msg3);


    }

    public static void showlog(int level, String message){
        if (level==1){
            System.out.println(message);
        }
    }
}
