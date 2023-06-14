package exercise3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner <T> {
    private String separator;
    public Joiner(String separator){
        this.separator = separator;
    }
    public String join(T... elements){
        return Arrays.stream(elements).map(String::valueOf).collect(Collectors.joining(separator));
    }
}
