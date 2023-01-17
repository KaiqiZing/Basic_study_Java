package oneday22.Demo3;
/*
    通过对象名引用成员方法
    使用前提是对象名是已经存在的,成员方法也是已经存在
    就可以使用对象名来引用成员方法
 */
public class Demo01ObjectMethodReference {
    public static void main(String[] args) {
        printString((s)->{
            MethodRerObject obj = new MethodRerObject();
            obj.printUpperCaseString(s);

        });

        MethodRerObject obj1 = new MethodRerObject();
        printString(obj1::printUpperCaseString);
    }

    public static void printString(Printable printable){
        printable.print("hello");
    }
}
