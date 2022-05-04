package oneday6;
import java.io.*;

public class Employee_Test {
    public static void main(String[] args) {
        /*构造两个对象*/
        Employee empone = new Employee("test1");
        Employee emptwo = new Employee("test2");

        /*调用这两个对象的成员方法*/
        empone.tempage(26);
        empone.empdesignation("高级程序员");
        empone.empsalary(1000000);
        empone.printEmployee();

        System.out.println("_______________");


        emptwo.tempage(35);
        emptwo.empdesignation("专家级程序员");
        emptwo.empsalary(2000000);
        emptwo.printEmployee();


    }

}
