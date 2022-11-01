package oneday5;
/*
数组：存储数据长度固定的容器，保证多个数据的数据类型一致；
数组的定义：
格式1：数据存储的数据类型[] 数组名 = new 数组存储的数据类型[长度];

静态初始化数组：
标准格式：
格式2：数据类型[] 数组名 = 数据类型[]{元素1，元素2，元素3...};
省略格式：
格式3：数据类型[] 数组名 = {元素1，元素2，元素3...};
Notice:数组有定长特性，长度一旦指定后不可更改；
注意事项：
1.静态初始化数组没有直接指定长度，可以length具体长度；
2.静态初始化标准格式和动态初始化都可以拆分两个步骤；
3.静态初始化省略格式不能拆分成两个步骤；

 */
public class Array_Demo1 {
    public static void main(String[] args) {

        //格式1，索引获取数组数据，格式2：数据类型[] 数组名 = 数据类型[]{元素1，元素2，元素3...};
        int[] arr  = new int[]{1,3,4,5};
        System.out.println("length获取数组长度：" + arr.length);
        System.out.println(arr[0]);

        //省略格式写法
        int[] arrayA = {10, 20,30};
        //静态初始化数组省略格式不能被拆分成两个步骤；
//        int [] arrayD;
//        arrayD = {10,203,30};


        //静态初始化标准格式拆分写法；
        int [] arrayB;
        arrayB  =   new int[] {11,22,33};

        // 动态初始化也可以拆分成两个步骤；
        int[] arrayC;
        arrayC = new int[5];

        /*
        * 使用动态初始化数组时候，其中的元素将会自动拥有一个默认值：
        * 1.如果是整数类型，那么默认为0；
        * 2.如果是浮点类型，那么默认为0.0；
        * 3.如果是字符类型，那么默认为'\u0000';
        * 4.如果是布尔类型，那么默认为false；
        * 5.如果是引用类型，那么默认为null；
        * 拓展：引用数据类型非常多，大致包括：类、 接口类型、 数组类型、 枚举类型、 注解类型、 字符串型
         * */

        int[] array_int = new int[2];
        System.out.println("int类型默认值："+array_int[0]);

        float[] array_float = new float[2];
        System.out.println("float类型默认值："+array_float[0]);

        char[] array_char = new char[2];
        System.out.println("str类型默认值："+array_char[0]);

        boolean[] array_boolean = new boolean[2];
        System.out.println("boolean类型默认值："+array_boolean[0]);

        String[] array_String = new String[2];
        System.out.println("String引用类型默认值："+array_String[0]);

        int[] arr1 = new int[2];
        arr1[0]= 1;
        arr1[1]= 3;
        System.out.println(arr1[1]);
        int[] arr2 = arr1;
        arr2[1] = 10;
        System.out.println(arr1[1]);


        //数组越界异常；格式3：数据类型[] 数组名 = {元素1，元素2，元素3...};
        int[] arr3 = {1,2,3};
        // System.out.println(arr3[3]); // ArrayIndexOutOfBoundsException

        // 空指针异常，如果只是赋值了一个null 没有进行new的创建，那么将会发生空指针异常
        int[] arr4 = null;
        // 补上new
        // arr4 = new int[3];
        System.out.println(arr4[0]);  // NullPointerException
    }

}
