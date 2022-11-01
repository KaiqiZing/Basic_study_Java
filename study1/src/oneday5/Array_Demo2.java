package oneday5;
/*
数组遍历：将数组中的每个元素分别获取出来，就是遍历，
 */
public class Array_Demo2 {
    public static void main(String[] args) {
        // 数组的长度
        System.out.println("数组的长度是："+array_length());
        //数组的遍历
        //数组获取最大值元素
        System.out.println("数组最大值是："+ array_maxvalue());
        //数组反转
        array_reverse();
        //
    }

    public static int array_length(){
        int[] arraylength = {1,2,3,45,6};

        for (int i = 0; i <arraylength.length ; i++) {
            System.out.println("数组遍历结果是："+ arraylength[i]);
        }
        return arraylength.length;
    }


    public static int array_maxvalue(){
        int[] arraymaxvalue = {1,2,33,55,11,3432,5432};
        int max = arraymaxvalue[0];
        for (int i = 0; i < arraymaxvalue.length; i++) {
            if (arraymaxvalue[i] > max){
                max = arraymaxvalue[i];
            }
        }
        return max;
    }

    public static void array_reverse(){
        int[] arrayreverse = {1,2,3,4,5};
        for (int min=0, max=arrayreverse.length -1; min <=max; min++, max--){
            int temp = arrayreverse[min];
            arrayreverse[min] = arrayreverse[max];
            arrayreverse[max] = temp;
        }

        for (int i = 0; i < arrayreverse.length ; i++) {
            System.out.println(arrayreverse[i]);
        }
    }
}
