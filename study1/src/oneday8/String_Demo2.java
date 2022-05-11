package oneday8;
/*
* 字符串常用方法*/
public class String_Demo2 {
    public static void main(String[] args) {
/*        public boolean equals (Object anObject) :将此字符串与指定对象进行比较
        public boolean equalsIgnoreCase (String anotherString) :将此字符串与指定对象进行比较，忽略大小*/
        String s1 = "hello";
        String s2 = "HELLO";
        String s3 = "hello";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println("_____________");

        System.out.println(s1.equalsIgnoreCase(s2));


//        public int length () :返回此字符串的长度。
//        public String concat (String str) :将指定的字符串连接到该字符串的末尾。
//        public char charAt (int index) :返回指定索引处的 char值。
//        public int indexOf (String str) :返回指定子字符串第一次出现在该字符串内的索引。没有则返回-1
//        public String substring (int beginIndex) :返回一个子字符串，从beginIndex开始截取字符串到字符
//        串结尾。
//        public String substring (int beginIndex, int endIndex) :返回一个子字符串，从beginIndex到
//        endIndex截取字符串。含beginIndex，不含endIndex。

        System.out.println("字符串长度"+s1.length());
        String s4 = s1.concat("world");
        System.out.println(s4);

        System.out.println(s4.charAt(1));
        System.out.println(s4.indexOf("l"));
        System.out.println(s4.indexOf("skk"));
        System.out.println("+++++++++");

        System.out.println(s4.substring(3));
        System.out.println(s4.substring(0,4));
        System.out.println("+_+_+_+_+_+_+");

//        public char[] toCharArray () :将此字符串转换为新的字符数组。
//        public byte[] getBytes () :使用平台的默认字符集将该 String编码转换为新的字节数组。
//        public String replace (CharSequence target, CharSequence replacement) :将与target匹配的字符串使
//        用replacement字符串替换。
        String s5 = "dadhadaisdada1dad33";
        char[] chs = s5.toCharArray();
        for (int x=0; x<chs.length; x++){
            System.out.println(chs[x]);
        }
        String s6 = "qwe";
        byte[] bytes_chs = s6.getBytes();
        for (int x=0; x<bytes_chs.length; x++){
            System.out.println(bytes_chs[x]);

        }

        String replace_string = s5.replace("da","DA");
        System.out.println(replace_string);  // DAdhaDAisDADA1DAd33

        // 分割功能练习方法
        String s = "aa|bb|cc";
        String[] strArray = s.split("|");
        for (int x=0; x < strArray.length; x++){
            System.out.println(strArray[x]);

        }
    }
}
