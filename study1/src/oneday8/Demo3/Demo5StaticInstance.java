package oneday8.Demo3;

import java.util.ArrayList;

public class Demo5StaticInstance {
    public static ArrayList<String> RandomCard = new ArrayList<>();
    static {

        //定义一个数组存储全部参数
        String[] sizes = {"3","4","5","6","7","8","9","J","Q","K","A","2"};
        //花色
        String[] colors = {"♥","♠","♦","♣"};
        //遍历点数
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                String card = sizes[i] +colors[j];
                RandomCard.add(card);
            }
        }

        RandomCard.add("小🃏");
        RandomCard.add("大🃏");
    }

    public static void main(String[] args) {
        System.out.println("洗牌:z"+ RandomCard);
    }
}
