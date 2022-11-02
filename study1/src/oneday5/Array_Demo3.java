package oneday5;

public class Array_Demo3 {
    public static void main(String[] args) {
        // 调用方法，传递数组；
        int[] arr1 = {1,3,4,5,7,8,9};
        printArray(arr1);


        // 调用方法，接收数组的返回值，接收到的是数据组内存地址；
        int[] arr2 = getarray();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("数组的返回值："+arr2[i]);

        }
    }

    /*
    * 创建方法方法接收数组类型的参数，进行数组遍历；
    * */
    public static void printArray(int[] arr1){
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("数组作为方法参数："+arr1[i]);
        }
    }

    public static int[] getarray(){
        int[] arr2 = {1,2,3,4,5,6};
        return arr2;  //返回数组的地址，返回到调用者；
    }


}
