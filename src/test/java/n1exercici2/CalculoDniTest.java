package n1exercici2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculoDniTest {

    @Test
    void CalculateCharExpectedZ() {
        var calculo = new CalculoDni();
        assertEquals('Z',calculo.dni(61880640));
    }

    @Test
    void CalculateCharExpectedE() {
        var calculo = new CalculoDni();
        assertEquals('E',calculo.dni(57046600));
    }

    @Test
    void CalculateCharExpectedV() {
        var calculo = new CalculoDni();
        assertEquals('V',calculo.dni(3954545));
    }

    @Test
    void CalculateCharExpectedM() {
        var calculo = new CalculoDni();
        assertEquals('M',calculo.dni(17026583));
    }

    @Test
    void CalculateCharExpectedH() {
        var calculo = new CalculoDni();
        assertEquals('H',calculo.dni(92969261));
    }

    @Test
    void CalculateCharExpectedX() {
        var calculo = new CalculoDni();
        assertEquals('X',calculo.dni(70043451));
    }

    @Test
    void CalculateCharExpectedC() {
        var calculo = new CalculoDni();
        assertEquals('C',calculo.dni(71765793));
    }

    @Test
    void CalculateCharExpectedJ() {
        var calculo = new CalculoDni();
        assertEquals('J',calculo.dni(73883304));
    }

    @Test
    void CalculateCharExpectedL() {
        var calculo = new CalculoDni();
        assertEquals('L',calculo.dni(16003672));
    }

    @Test
    void CalculateCharExpectedP() {
        var calculo = new CalculoDni();
        assertEquals('P',calculo.dni(93192535));
    }
}