package oneday5;
/*
数组遍历：将数组中的每个元素分别获取出来，就是遍历，
 */
public class Array_Demo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        for (int i=0; i<=arr.length-1; i++){
//            System.out.println(arr[i]);
//        }

//        数组反转：数组中元素的顺序颠倒顺序；
        for (int min=0, max = arr.length-1; min <= max; min++, max--){
            int temp = arr[min];
            arr[min]=arr[max];
            arr[max]=temp;
        }
//        反转后遍历数组：
        for (int i=0; i<=arr.length-1; i++){
            System.out.println(arr[i]);
        }
        System.out.println("_________");

//        数组作为方法参数：
        printarray(arr);

        System.out.println("_________");

//        数组作为方法的返回值；
        int[] arr1 =getarray();
        for (int i = 0; i <= arr1.length-1; i++){
            System.out.println(+arr1[i]);
        }
    }
    public static void printarray(int[] arr){
        for (int i =0; i<= arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] getarray(){
        int[] arr1 = {1,2,3,4};
        return arr1;
    }
}
