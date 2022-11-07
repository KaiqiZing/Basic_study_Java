package oneday7;

public class person {
    String name;
    private int age;

    public void show(){
        System.out.println("my name is:"+name+"my age is:"+age);

    }

    public void setAge(int num){
        if (num<100 && num >=9){
            age = num;
        }else {
            System.out.println("data is error!!!");
        }
    }

    public int getAge(){
        return age;
    }

    public void sayHello(String name){
        System.out.println(name + "==你好我是："+ name+"==未使用this");
        System.out.println(name + "==你好我是："+ this.name+"==使用this");
    }
}
