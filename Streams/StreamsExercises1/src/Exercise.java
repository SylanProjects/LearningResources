import java.util.Arrays;
import java.util.stream.IntStream;

public class Exercise {
    public static void One() {
        IntStream.range(0, 10).forEach(System.out::println);
    }
    public static void Two() {
        String[] names = {"Sylan", "Krzychu"};
        Arrays.stream(names).filter(x -> x.length() <= 5).sorted().forEach(System.out::print);
    }
}
