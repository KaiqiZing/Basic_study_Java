package oneday8;
/*
* java.lang.String类代表字符串
* 类String中包含用户检查各个字符串的方法：比较字符串，搜索字符串，提取字符串，大小写字符串
* 特点：1.字符串的值在创建后不能被修改*/
public class String_demo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);
        s1 += "d";
        System.out.println(s1);
        // 内存中有"abc"，"abcd"两个对象，s1从指向"abc"，改变指向，指向了"abcd"。


        /*字符串对象不可变，所以字符串可以被共享*/
        String s2 = "abc";
        System.out.println(s2);
        // 内存中只有一个"abc"对象被创建，同时被s1 and s2 share

        /*字符串的构造方法*/
        // 无参构造
        // String str = new String();

        // 通过字符串数组构造
//        char chars[] = {'a', 'b','c'};
//        String str2 = new String(chars);
//        System.out.println(str2);

        // 通过字节数组构造
        byte bytes[] ={97,98,99};
        String str3 = new String(bytes);
        System.out.println("字节数组构造"+str3);

    }

}
