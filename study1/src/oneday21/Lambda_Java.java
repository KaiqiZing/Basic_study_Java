package oneday21;
/*
表达式语法
* (parameters) -> expression
或
(parameters) ->{ statements; }
* */
public class Lambda_Java {

    public static void main(String[] args) {
        Lambda_Java test1 = new Lambda_Java();

    MathOperation addtion = (int a, int b ) -> a + b;
    System.out.println(test1.operate(10,2,addtion));

    }

    interface MathOperation{
        int operation(int a, int b);

    }

    interface GreetSerice{
        void SayMessage(String name);
    }

    private int operate(int a, int b, MathOperation addtion){
        return addtion.operation(a,b);

    }


}
