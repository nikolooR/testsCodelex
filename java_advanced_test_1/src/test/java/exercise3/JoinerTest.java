package exercise3;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoinerTest {
    @Test
    void testJoinerMethodJoin(){
        Joiner<Integer> joiner = new Joiner<>("-");
        Assertions.assertEquals("1-2-3-4", joiner.join(1,2,3,4));

        Joiner<String> joiner2 = new Joiner<>("+");
        Assertions.assertEquals("test+test+test", joiner2.join("test", "test", "test"));
    }
}