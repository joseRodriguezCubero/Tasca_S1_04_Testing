package n2exercici1;

import org.junit.jupiter.api.Test;

import static n2exercici1.main.length;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class mainTest {

    @Test
    public void MordorShouldContainer8() {
        assertThat("Mordor", length(is(8)));
    }

}