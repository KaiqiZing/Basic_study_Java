package oneday11.RedPackage;

import java.util.ArrayList;
import java.util.Random;

public class Member extends UserMoney{
    public Member() {
    }

    public Member(String username, double leftMoney) {
        super(username, leftMoney);
    }

    public void openHongbao(ArrayList<Double> list){
        Random r = new Random();
        int index = r.nextInt(list.size());
        Double money = list.remove(index);
        setLeftMoney(money);

    }
}
