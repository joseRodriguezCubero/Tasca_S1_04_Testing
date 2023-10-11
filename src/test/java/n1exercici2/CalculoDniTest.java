package n1exercici2;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculoDniTest {




    @ParameterizedTest
    @MethodSource("numberToChar")

    void GivenTenNumbersShouldReturnTenChars(char letra, int number) {
        var calculo = new CalculoDni();
        assertEquals(letra, calculo.dni(number));
    }

    private static Stream<Arguments> numberToChar(){
        return Stream.of(
                Arguments.of('P',93192535),
                Arguments.of('L',16003672),
                Arguments.of('J',73883304),
                Arguments.of('C',71765793),
                Arguments.of('X',70043451),
                Arguments.of('Q',16031982),
                Arguments.of('M',17026583),
                Arguments.of('B',60882920),
                Arguments.of('E',57046600),
                Arguments.of('Y',97136228)
                        );
    }
}
