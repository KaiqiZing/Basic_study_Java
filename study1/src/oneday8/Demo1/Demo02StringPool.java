package oneday8.Demo1;
/*
* 字符串常量池：程序当中直接写上双引号字符串，就是字符串常量池中；
* 对于基本类型来说===进行数值的比较；
* 对于引用类型来说==进行地址值的比较；
* */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = "abcd";

        char[] charArray = {'a', 'b', 'c'};
        String str4 = new String(charArray);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str4);

    }
}
