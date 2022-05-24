package oneday10;

public class Demo1 {
    public static void main(String[] args) {
        Demo1_Salary s = new Demo1_Salary("老张", "上海市浦东新区", 12, 15000);
//        Demo1_Employee e = new Demo1_Salary("laochen", "NewYork", 15, 10000);
        System.out.println("call salary result");
        s.mailCheck();
        s.computepay();
//        System.out.println("call salary other salary");
//        s.mailCheck();

    }
}
