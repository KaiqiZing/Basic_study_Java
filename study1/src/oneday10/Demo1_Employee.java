package oneday10;
/*
* 抽象类：如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类；
* 抽象类不能实例化对象，必须被继承才能使用，父类中包含子类所使用的方法，但是由于父类是抽象的所以只有给子类使用，而父类不能使用；
* 1. 不能直接创建new抽象类对象。
2. 必须用一个子类来继承抽象父类。
3. 子类必须覆盖重写抽象父类当中所有的抽象方法。
* */
public abstract class  Demo1_Employee {
    private String name;
    private String address;
    private int number;

    public Demo1_Employee(String name, String address, int number){
        System.out.println("计算employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public double computepay(){
        System.out.println("Inside Employee computePay");
        return 0.0;
    }
    public void mailCheck(){
        System.out.println("Mailing a check to" + this.name+""+this.address);
    }
    public String toString(){
        return name +""+address+""+number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}
