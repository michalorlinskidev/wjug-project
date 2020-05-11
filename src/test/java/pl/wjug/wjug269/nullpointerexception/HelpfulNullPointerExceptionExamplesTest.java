package pl.wjug.wjug269.nullpointerexception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;

public class HelpfulNullPointerExceptionExamplesTest {

    //-XX:+ShowCodeDetailsInExceptionMessages
    @Test
    void simpleNullPointerException() {
        //given
        A a = new A(new B(new C(new D("test"))));
        //when
        a.getB().setC(null);
        //then
        try {
            a.getB().getC().getD().getVal();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Data
    @AllArgsConstructor
    private class A {
        private B b;
    }

    @Data
    @AllArgsConstructor
    private class B {
        private C c;
    }

    @Data
    @AllArgsConstructor
    private class C {
        private D d;
    }

    @Data
    @AllArgsConstructor
    private class D {
        private String val;
    }
}
