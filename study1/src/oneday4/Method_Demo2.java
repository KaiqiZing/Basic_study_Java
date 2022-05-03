package oneday4;


/*
Notice:不能在输出语句中调用void方法，因为方法执行后没有结果，也就打印不出任何内容；
 */
public class Method_Demo2 {
    public static void main(String[] args) {
//        直接调用--直接写方法名调用
        print();

//        赋值调用--调用放的在方法前面定义变量，接收方法返回值
        int sum = getsum(1,2);
        System.out.println("赋值调用："+sum);

//        输出语句调用--在输出语句中调用方法
        System.out.println("在输出语句中调用："+getsum(2,3));
    }
    public static void print(){
        System.out.println("方法被调用");
    }
    public static int getsum(int a, int b){
        return a+ b;
    }
}
