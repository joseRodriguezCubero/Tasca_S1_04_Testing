package n2exercici1;

import org.junit.jupiter.api.Test;

import static n2exercici1.MachersExample.length;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class machersExampleTest {

    @Test
    public void MordorShouldContainer8() {
        assertThat("Mordor", length(is(8)));
    }

}