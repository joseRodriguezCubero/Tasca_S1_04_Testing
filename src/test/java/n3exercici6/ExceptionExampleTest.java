package n3exercici6;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


class ExceptionExampleTest {

    @Test
    void ExcepcionTownByCode() {

        assertThatThrownBy(() -> {
            int[] a = new int[2];
            System.out.println("Access element three :" + a[3]);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("Index 3 out of bounds for length 2");
    }
}