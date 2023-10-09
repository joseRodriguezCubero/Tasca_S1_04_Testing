package n3exercici7;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;


class OptionalExampleTest {

    @Test
    void IsEmptyOptional() {
        Optional emptyOptional = Optional.empty();
        assertThat(emptyOptional).isEmpty();
    }
}