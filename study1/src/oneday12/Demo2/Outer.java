package oneday12.Demo2;
/*如果出现重名现象，那么格式是：外部类名称.this.外部类成员变量名
* */
public class Outer {
    int num = 10;

    public class Inner{
        int num = 20;
        public void methodInner(){
            int num = 30;
            System.out.println("局部变量就近原则："+num);
            System.out.println("内部类成员变量："+ this.num);
            System.out.println("外部类的成员变量:"+ Outer.this.num);


        }
    }
}
