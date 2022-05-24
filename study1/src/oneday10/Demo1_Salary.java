package oneday10;

public class Demo1_Salary extends Demo1_Employee{
    private double salary;

    public Demo1_Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }
    public void mailCheck(){
        System.out.println("within mailcheck of salary class");
        System.out.println("mailing check to" +" "+ getName() + " "+ "with salary:" +salary);
    }
    public double getSalary(){
        return salary;
    }

    public void setSalary(double newSalary){
        if (newSalary>=0.0){
            salary = newSalary;
        }
    }
    public double computepay(){
        System.out.println("computing salary for"+ getName());
        return salary/52;

    }
}
