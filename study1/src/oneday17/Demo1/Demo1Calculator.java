package oneday17.Demo1;

/*
    Lambda表达式有参数有返回值的练习
    需求:
        给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class Demo1Calculator {
    public static void main(String[] args) {
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        });

        invokeCalc(120, 130, (int a, int b)->{
            return a+b;
        });

        invokeCalc(120, 122,((a, b) -> a+b));
    }


    public static void invokeCalc(int a, int b, Calculator c){
        int sum = c.sum(a, b);
        System.out.println(sum);
    }
}
