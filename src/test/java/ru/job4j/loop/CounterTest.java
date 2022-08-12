package ru.job4j.loop;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromTenToTwelveThenTwentyTwo() {
        int start = 10;
        int finish = 12;
        int result = Counter.sumByEven(start, finish);
        int expected = 22;
        assertThat(result).isEqualTo(expected);
    }
}