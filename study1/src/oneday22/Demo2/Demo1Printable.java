package oneday22.Demo2;

public class Demo1Printable {
    public static void main(String[] args) {
        printString((s)->{
            System.out.println(s);
        });
        printString(System.out::println);
    }
    public static void printString(Printable printable){
        printable.print("helloworld!!");
    }
}
