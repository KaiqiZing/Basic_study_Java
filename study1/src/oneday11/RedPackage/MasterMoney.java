package oneday11.RedPackage;

import java.util.ArrayList;

public class MasterMoney extends UserMoney{

    public MasterMoney(){
    }

    public MasterMoney(String username, double leftMoney) {
        super(username, leftMoney);
    }

    public ArrayList<Double> send(int money, int count) {

        double leftMoney = getLeftMoney();
        if (money > leftMoney) {
            return null;
        }

        setLeftMoney(leftMoney - money);
        ArrayList<Double> list = new ArrayList<>();
        money = money * 100;
        int m = money / count;
        int l = money % count;

        for (int i = 0; i < count; i++) {
            list.add(m / 100.0);
        }
        if ((l == 0)) {
            list.add(m / 100.0);
        } else {
            list.add((m + 1) / 100.0);
        }
        return list;
    }

}
