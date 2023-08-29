import java.util.function.Consumer;

public class FunctionInterface {
    public void test_func(String input) {
        Consumer<String> consumer = (print_input) -> {
            System.out.println(print_input);
        };

        consumer.accept(input);
    }

}
