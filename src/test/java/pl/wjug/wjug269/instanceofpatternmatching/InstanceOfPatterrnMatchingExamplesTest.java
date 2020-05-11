package pl.wjug.wjug269.instanceofpatternmatching;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static java.time.DayOfWeek.MONDAY;

public class InstanceOfPatterrnMatchingExamplesTest {

    @Test
    void simpleInstanceOfPatternMatching() {
        //given
        var value = MONDAY;
        int result = -1;
        //when
        if (value instanceof DayOfWeek day) {
            if (day == MONDAY) {
                result = 1;
            }
        }
        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void complexInstanceOfPatternMatching() {
        //given
        var value = MONDAY;
        int result = -1;
        //when
        if (value instanceof DayOfWeek day && day == MONDAY) {
            result = 1;
        }
        //then
        Assertions.assertThat(result).isEqualTo(1);
    }

}
