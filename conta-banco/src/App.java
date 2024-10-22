import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws Exception {
        List<Integer> numeros = Arrays.asList(3, 5, 1, 9, 7, 2);
        Optional<Integer> max = numeros.stream().max(Comparator.naturalOrder());
        System.out.println(max);

    }

    
}
