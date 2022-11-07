package oneday7;

import javax.swing.text.html.parser.TagElement;

public class StudentTest {

    private String name;
    private int age;

    public StudentTest(){
        System.out.println("无参构造方法啦！！！");

    }

    public StudentTest(String name, int age){

        System.out.println("有参构造方法啦！！！");

        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }


    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }


}
