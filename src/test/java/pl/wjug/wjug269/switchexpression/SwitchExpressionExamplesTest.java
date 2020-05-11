package pl.wjug.wjug269.switchexpression;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

import static java.time.DayOfWeek.MONDAY;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchExpressionExamplesTest {

    @Test
    void simpleOldSwitchStatement() {
        //given
        int result = 0;
        DayOfWeek day = MONDAY;
        //when
        switch (day) {
            case MONDAY:
                result = 1;
                break;
            default:
                result = -1;
        }
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void simpleNewSwitchStatement() {
        //given
        int result = 0;
        DayOfWeek day = MONDAY;
        //when
        switch (day) {
            case MONDAY -> result = 1;
            default -> result = -1;
        }
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void simpleNewSwitchExpression() {
        //given
        DayOfWeek day = MONDAY;
        //when
        int result = switch (day) {
            case MONDAY -> 1;
            default -> -1;
        };
        //then
        assertThat(result).isEqualTo(1);
    }

    @Test
    void complexNewSwitchExpression() {
        //given
        DayOfWeek day = MONDAY;
        //when
        var result = switch (day) {
            case MONDAY -> "1";
            default -> -1;
        };
        //then
        assertThat(result).isExactlyInstanceOf(String.class);
        assertThat(Integer.parseInt((String) result)).isEqualTo(1);
    }


}
