package oneday8.Demo2;

public class Demo02StringGet {

    public static void main(String[] args) {
//        StringDemo1();
//        StringDemo2();
//        StringDemo3();
        StringDemo4();
    }

    public static void StringDemo1(){
        /*
        String当中与获取相关的常用方法有：
        public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
        public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。
        public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
        public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。
         */

        int length = "adadadasdada".length();
        System.out.println("字符串长度："+ length);

        String str1 = "Hello";
        String str2 = "World";
        System.out.println("字符串的拼接："+ str1.concat(str2));
        System.out.println("获取字符串的索引值："+ str1.charAt(0));

        String original = "HELLOWORLDTESTCONTENT";
        int index = original.indexOf("LL");
        System.out.println("索引值是："+ index);

    }


    public static void StringDemo2(){
        /*
        字符串的截取方法：
        public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串。
        public String substring(int begin, int end)：截取从begin开始，一直到end结束，中间的字符串。
        备注：[begin,end)，包含左边，不包含右边。
         */
        String str1 = "contenttest" ;
        System.out.println("字符串的截取："+ str1.substring(3));



    }

    public static void  StringDemo3(){
        /*
        String当中与转换相关的常用方法有：

        public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
        public byte[] getBytes()：获得当前字符串底层的字节数组。
        public String replace(CharSequence oldString, CharSequence newString)：
        将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。
        备注：CharSequence意思就是说可以接受字符串类型。
         */
        // 转换成为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]); // H
        System.out.println(chars.length); // 5
        System.out.println("==============");

        // 转换成为字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("==============");

        // 字符串的内容替换
        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1); // How do you do?
        System.out.println(str2); // H*w d* y*u d*?
        System.out.println("==============");

        String lang1 = "会不会玩儿呀！你大爷的！你大爷的！你大爷的！！！";
        String lang2 = lang1.replace("你大爷的", "****");
        System.out.println(lang2); // 会不会玩儿呀！****！****！****！！！
    }

    public static void  StringDemo4(){
        /*
        分割字符串的方法：
        public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分。

        注意事项：
        split方法的参数其实是一个“正则表达式”，今后学习。
        今天要注意：如果按照英文句点“.”进行切分，必须写"\\."（两个反斜杠）
         */


        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("===============");

        String str2 = "aaa bbb ccc";
        String[] array2 = str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("===============");

        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\.");
        System.out.println(array3.length); // 0
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }


    }


}