package oneday3;
/*
跳出语句
break and continue
嵌套循环--循环的循环体是另一个循环，比如for循环里还有一个for循环，就是嵌套循环。总的循环次数=外循环次数*内循环次数

 */
public class Escape_Control_Statements {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
//            打印完两次helloworld之后结束循环
            if (i==3){
//                break;
                continue;
            }
            System.out.println("这是第"+i+"次打印：Hello World!!!");
        }

//        嵌套循环； 打印一组星光，每隔2个换行一次；
        for (int j=0; j<5; j++){
            for (int k=0; k<2; k++){
                System.out.println("打印第"+k+"*");
            }
            System.out.println();
        }
    }
}
