package pl.wjug.wjug269.textblocks;

import org.junit.jupiter.api.Test;

public class TextBlocksExamplesTest {

    @Test
    void simpleTextBlocks() {
        //given
        String example = """
                to jest przykładowy blok tekstowy
                    z jednym wcięciem w tej lini                
                        z dwoma wcięciami w ostatniej lini.
                """;
        //when
        System.out.println(example);
    }

    @Test
    void complexTextBlocks() {
        //given
        String example = """
                to jest przykładowy blok tekstowy
                agrument 1: %s                
                agrument 2: %s                
                agrument 3: %s                
                """.formatted(1, "dwa", 3);
        //when
        System.out.println(example);
    }

}
