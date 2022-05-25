package oneday11;

import java.lang.reflect.Array;
import java.util.ArrayList;
/*发红包的群主类*/
public class Manager  extends User{
    public Manager(){

    }

    public Manager(String name, int money){
        super(name, money);
    }
    public ArrayList<Integer> send(int totalMoney, int count){
        ArrayList<Integer> redList = new ArrayList<>();

        int leftMoney = super.getMoney();
        if (totalMoney >leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        /*开始扣钱*/
        super.setMoney(leftMoney - totalMoney);

        int avg = totalMoney / count;  // 平均数
        int mod = totalMoney % count;  //余数放置最后一个红包当中；

        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }

        // 放置最后一个红包
        int last = avg+mod;
        redList.add(last);
        return redList;
    }
}
