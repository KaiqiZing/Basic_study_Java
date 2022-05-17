package oneday9;

public class Demo1_Cat extends Demo1_Animal{
    void eat(){
        System.out.println("cat : eat");
    }
    void eattest(){
        this.eat();
        super.eat();
    }

}
