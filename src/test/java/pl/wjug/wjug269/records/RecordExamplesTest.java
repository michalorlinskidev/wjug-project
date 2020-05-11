package pl.wjug.wjug269.records;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RecordExamplesTest {

    @Test
    void simpleRecord() {
        //given
        record A(String value) {
        }
        //when
        A a = new A("test");
        //then
        assertThat(a).isNotNull();
        assertThat(a.value).isEqualTo("test");
    }

    @Test
    void complexRecord() {
        //given
        record A(String value) {
            public A(String value) {
                System.out.println("Własny konstruktor kanoniczny");
                this.value = value;
            }

            String getValue() {
                System.out.println("Własny getter");
                return value;
            }
//            not enable set value
//            String setValue() {
//                this.value = "test";
//            }
        }
        //when
        A a = new A("test");
        //then
        assertThat(a).isNotNull();
        assertThat(a.getValue()).isEqualTo("test");
    }

}
