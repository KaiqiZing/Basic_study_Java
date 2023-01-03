package oneday12.Demo2;

public class Demo2Body {
    public class Demo2Heart{
        public void beat(){
            System.out.println("内部类！！！");
            System.out.println("我叫："+ name);
        }
    }

    private String name;
    public void MethodBody(){
        System.out.println("外部类的方法");
        new Demo2Heart().beat();
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }
}
