package oneday22.Demo7;

public class Husband {
    public static void main(String[] args) {
        new Husband().SoHappy();
    }
    public void buyHouse(){
        System.out.println("buy a big house！");

    }
    public void getmarry(Richable richable){
        richable.buy();
    }
    public void SoHappy(){
/*        getmarry(()->{
            this.buyHouse();
        });*/
        getmarry(this::buyHouse);
    }
}
