package oneday3;
/*
1. switch(表达式) {
    case 常量值1:
        语句体1;
        break;
    case 常量值2:
        语句体2;
        break;
    ...
    default:
        语句体n+1;
        break;
}
2. switch 语句中，表达式数据类型，可以是byte, short, int, char, enum
3. case 穿透性：如果case后面不写break，会出现穿透现象，也就是不会再判断下一个case的值，直接向后运行，直到遇到break，或者整体switch 结束；
 */

public class Select_Statements {
    public static void main(String[] args) {
//        判断是星期几
        int weekday = 6;
        switch (weekday){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("your input info is error!");
                break;
        }
        System.out.println();
// 穿透性验证
        int i = 5;
        switch (i) {
            case 0:
                System.out.println("执行case0");
                break;
            case 5:
                System.out.println("执行case5");
            case 10:
                System.out.println("执行case10");
            default:
                System.out.println("执行default");
        }
    }
}


