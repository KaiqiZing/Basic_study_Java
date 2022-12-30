package oneday21;
/*
* 函数式接口：有且只有一个抽象方法的接口，称之为函数式接口。接口中可以包含其他方法--默认，静态，私有
* @FunctionalInterface注解作用：①可以检车接口是否是一个函数式接口，②接口中抽象方法的个数超过1个会报错*/


@FunctionalInterface
public interface MyfunctionInter {
    public abstract void method();
}
