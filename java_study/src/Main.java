import java.lang.Double;
import java.util.ArrayList;
import java.util.Random;

public class Main extends MutiThread {


    public static void main(String[] args) {
        FunctionInterface test = new FunctionInterface();
        test.test_func("test func interface");
//      多态在编译时，已经根据runtime的静态类型做了抹除
//
//      ！！！type... 编译器会处理成type[]数组
//      switch 语句必须在每个case之后添加break；否则，命中第一个case条件之后，剩余所有的条件都会被执行
//      看了遍编译之后的javac，发现if条件是一个一个执行的，对于全&运算，一个不满足，后面不会执行
    }
}