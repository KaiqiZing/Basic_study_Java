package oneday6;
import java.io.*;
public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    /*类构造器*/
    public  Employee(String name){
        this.name = name;
    }
    /*设置age and designation的值*/
    public void tempage(int tempage){
        age = tempage;
    }
    public void empdesignation(String empdesignation){
        designation = empdesignation;
    }
    /*设置salary的值*/
    public void empsalary(double empsalary){
        salary = empsalary;
    }

    /*打印不同的结果*/
    public  void printEmployee(){
        System.out.println("名字"+name);
        System.out.println("年龄"+age);
        System.out.println("职位"+designation);
        System.out.println("薪水"+salary);
    }
}
