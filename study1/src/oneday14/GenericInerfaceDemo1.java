package oneday14;

import java.util.Iterator;

public class GenericInerfaceDemo1<I> implements GenericInerface<I>{
    @Override
    public void method(I i){
        System.out.println(i);
    }
}
