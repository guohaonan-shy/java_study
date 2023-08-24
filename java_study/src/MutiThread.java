import java.util.concurrent.Callable;

public class MutiThread implements Callable<String> {

    public int testVar = 99;
    public static String testStaticVar = "parent test static variation";


    public MutiThread() {}

    public MutiThread(int a) {
        this.testVar = a;
    }

    @Override
    public String call() throws Exception {
        return "start";
    }

    public static int max(int a, int... b) {
        int res = a;
        for (int i : b) {
            if(i > res) {
                res = i;
            }
        }
        return res;

    }

    public static String GetBinaryExpression(float a) {
        return Integer.toBinaryString(Float.floatToIntBits(a));
    }

    public static String GetBinaryExpression(double a) {
        return Long.toBinaryString(Double.doubleToLongBits(a));
    }

    public int getTestVar() {
        return this.testVar;
    }

}
