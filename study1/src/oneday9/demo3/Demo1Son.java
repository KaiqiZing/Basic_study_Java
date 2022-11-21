package oneday9.demo3;

public class Demo1Son extends Demo1Father {

    @Override // 注解可以不写，但是写上主要为了检测是不是有效的正确覆盖重写；
    public void method() {
        super.method();
    }
}
