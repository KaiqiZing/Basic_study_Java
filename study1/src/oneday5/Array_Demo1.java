package oneday5;
/*
数组：存储数据长度固定的容器，保证多个数据的数据类型一致；
数组的定义：
格式1：数据存储的数据类型[] 数组名 = new 数组存储的数据类型[长度];
格式2：数据类型[] 数组名 = 数据类型[]{元素1，元素2，元素3...};
格式3：数据类型[] 数组名 = {元素1，元素2，元素3...};
Notice:数组有定长特性，长度一旦指定后不可更改；
 */
public class Array_Demo1 {
    public static void main(String[] args) {
//        格式1，索引获取数组数据，格式2：数据类型[] 数组名 = 数据类型[]{元素1，元素2，元素3...};
        int[] arr  = new int[]{1,3,4,5};
        System.out.println("length获取数组长度：" + arr.length);
        System.out.println(arr[0]);

//        变量指向一个数组，格式1：数据存储的数据类型[] 数组名 = new 数组存储的数据类型[长度];
        int[] arr1 = new int[2];
        arr1[0]= 1;
        arr1[1]= 3;
        System.out.println(arr1[1]);
        int[] arr2 = arr1;
        arr2[1] = 10;
        System.out.println(arr1[1]);


//        数组越界异常；格式3：数据类型[] 数组名 = {元素1，元素2，元素3...};
        int[] arr3 = {1,2,3};
//        System.out.println(arr3[3]); // ArrayIndexOutOfBoundsException

//        空指针异常
        int[] arr4 = {1,3,5};
        arr4 = null; // 该行代码表示变量将不会保存在数组内存当中；
        System.out.println(arr4[0]);  // NullPointerException
    }

}
