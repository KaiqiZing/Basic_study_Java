package oneday21;

public class Java_Lambda {
    public static void main(String[] args) {
        Java_Lambda tester = new Java_Lambda();
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation subtraction = (a, b) -> a -b;
        MathOperation multiplication = (int a, int b) -> { return  a*b; };
        System.out.println(tester.operate(10,5, addition));
        System.out.println(tester.operate(20, 14, subtraction));



        GreetingService greetservice1 = message ->
                System.out.println("不加括号：" + message);
        GreetingService greetingService2 = (message) ->
                System.out.println("加括号：" + message);


        greetservice1.sayMessage("Runoob");
        greetingService2.sayMessage("Google");


    }

    interface MathOperation{
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }



    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
