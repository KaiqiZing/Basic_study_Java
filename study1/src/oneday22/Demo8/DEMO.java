package oneday22.Demo8;

import java.util.Arrays;

public class DEMO {
    public static int[] CreateArray(int length, ArrayBuilder arrayBuilder)   {
        return arrayBuilder.builderArray(length);
    };

    public static void main(String[] args) {
  /*      int[] array1 = CreateArray(10, length -> {
            return new int[length];
        });
        System.out.println(array1.length);
    }
    */


        int[] array2 = CreateArray(10, int[]::new);
        System.out.println(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println(array2.length);
    }

}
