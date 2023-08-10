import java.util.concurrent.Callable;

public class MutiThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "start";
    }
}
