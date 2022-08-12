package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 3.0;
        double ac = 6.0;
        double bc = 8.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ab = 2.0;
        double ac = 5.0;
        double bc = 10.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }
}