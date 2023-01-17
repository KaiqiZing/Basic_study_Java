package oneday22.Demo1;

import java.util.*;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T>是Java 8新加入的最常用的流接口。（这并不是一个函数式接口。）
    获取一个流非常简单，有以下几种常用的方式：
        - 所有的Collection集合都可以通过stream默认方法获取流；
            default Stream<E> stream​()
        - Stream接口的静态方法of可以获取数组对应的流。
            static <T> Stream<T> of​(T... values)
            参数是一个可变参数,那么我们就可以传递一个数组
 */
public class Demo1GetStream {
    public static void main(String[] args) {

    }

    public static void GetStream(){
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String, String> map1 = new HashMap<>();
        Set<String> keyset = map1.keySet();
        Stream<String> stream3 = keyset.stream();

        Collection<String> values = map1.values();
        Stream<String> stream4 = values.stream();

        Set<Map.Entry<String, String>> entries = map1.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        Stream<Integer> stream6 = Stream.of(1,2,3,4,5,6);
        Integer[] ArrayInterger = {1,2,3,4,56};
        Stream<Integer> stream7 = Stream.of(ArrayInterger);
        String[] ArrayInterger2 = {"aa","bb","cc"};
        Stream<String> stream8 = Stream.of(ArrayInterger2);



    }

}
