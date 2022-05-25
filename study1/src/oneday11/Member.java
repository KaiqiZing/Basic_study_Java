package oneday11;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member(){

    }
    public Member(String name, int money){
        super(name, money);
    }
    /*从红包中随机抽取一个红包个自己*/
    public void receive(ArrayList<Integer> list){

        int index = new Random().nextInt(list.size());
        int delta = list.remove(index);

        int money = super.getMoney(); // 获取到当前成员自己的钱
        super.setMoney(money+delta); // 自己的钱加上随机抽取的就是最终的红包金额

    }
}
